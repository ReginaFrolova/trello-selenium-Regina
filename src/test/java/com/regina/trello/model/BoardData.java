package com.regina.trello.model;

public class BoardData {
    private final String boardName;
    String team;

    public BoardData(String boardName) {
        this.boardName = boardName;
    }

    public String getBoardName() {
        return boardName;
    }
}
