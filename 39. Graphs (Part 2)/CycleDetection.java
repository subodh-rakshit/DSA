import java.util.*;
import java.util.LinkedList;

public class CycleDetection {

  static class Edge {
    int src;
    int dest;

    public Edge(int s, int d) {
      this.src = s;
      this.dest = d;
    }
  }

  // Creating the graph
  static void createGraph(ArrayList<Edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));
    graph[0].add(new Edge(0, 3));

    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 2));

    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 1));

    graph[3].add(new Edge(3, 0));
    graph[3].add(new Edge(3, 4));

    graph[4].add(new Edge(4, 3));
  }

  public static void bfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        bfsUtil(graph, vis);
      }
    }
  }

  public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]) { // O(V+E)
    Queue<Integer> q = new LinkedList<>();

    // adding the src
    q.add(0); // source = 0

    while (!q.isEmpty()) {
      int curr = q.remove();

      if (!vis[curr]) { // visit curr
        System.out.print(curr + " ");
        vis[curr] = true;

        // picking out the neighbors of the graph
        for (int i = 0; i < graph[curr].size(); i++) {
          Edge e = graph[curr].get(i);
          q.add(e.dest);
        }
      }
    }
  }

  public static void dfs(ArrayList<Edge>[] graph) {
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      dfsUtil(graph, i, vis);
    }
  }

  public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) { // O(V+E)
    // visit the curr
    System.out.print(curr + " ");
    vis[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);
      if (!vis[e.dest]) {
        dfsUtil(graph, e.dest, vis);
      }
    }
  }

  public static boolean detectCycle(ArrayList<Edge>[] graph) { // O(V + E)
    boolean vis[] = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        if (detectCycleUtil(graph, vis, i, -1)) {
          return true; // cycle exists in one of the parts
        }
      }
    }
    return false;
  }

  public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
    vis[curr] = true;
    for (int i = 0; i < graph[curr].size(); i++) {
      Edge e = graph[curr].get(i);

      // case 3
      if (!vis[e.dest]) {
        if (detectCycleUtil(graph, vis, e.dest, curr)) {
          return true;
        }
      }

      // case 1
      else if (vis[e.dest] && e.dest != par) {
        return true;
      }

      // case 2 -> do nothing -> continue
    }
    return false;
  }

  public static void main(String[] args) {
    int V = 7;
    ArrayList<Edge> graph[] = new ArrayList[V];
    createGraph(graph);
    // dfs(graph);
    System.out.println(detectCycle(graph));
  }
}
