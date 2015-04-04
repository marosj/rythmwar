package com.marosj.web.api;

import java.util.ArrayList;
import java.util.List;

public class MenuPath {

    private List<MaskInfo> menuItems = new ArrayList<MaskInfo>();

    public void add(MaskInfo element) {
        menuItems.add(element);
    }

    public List<MaskInfo> elements() {
        return new ArrayList<MaskInfo>(menuItems);
    }
}
