package com.company;

import java.io.File;
import java.util.List;

public class Main {

    private static void execute(File file) throws Exception {
        Maze maze = new Maze(file);
        System.out.println("Maze 1 : \n");
        dfs(maze);
        System.out.println("Maze 2 : \n");
        bfs(maze);
    }

    private static void bfs(Maze maze) {
        BFSMazeSolver bfs = new BFSMazeSolver();
        List<Coordinate> path = bfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }

    private static void dfs(Maze maze) {
        DFSMazeSolver dfs = new DFSMazeSolver();
        List<Coordinate> path = dfs.solve(maze);
        maze.printPath(path);
        maze.reset();
    }

    public static void main(String[] args) throws Exception {
	// write your code here
        System.out.println("************************Welcome to the Maze Solver!!!************************\n");
        System.out.println("Instructions : \n1.) Maze1 is base on Stack while Maze2 is based on queue.\n2.) You can open the file Maze.txt and create your own maze\n");

        File maze = new File("src/com/company/Maze.txt");

        execute(maze);


    }
}
