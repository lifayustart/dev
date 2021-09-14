package com.test;

import lombok.Data;

import java.util.List;

@Data
public class Node {
    private String name;
    private Integer id;
    private Integer parentId;
    private String link;
    private List<Node> childrens;
}
