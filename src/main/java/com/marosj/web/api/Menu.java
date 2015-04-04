package com.marosj.web.api;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private MaskInfo actual;
    private List<MaskInfo> elements = new ArrayList<MaskInfo>();

    public Menu() {
        MaskInfo mi = new MaskInfo();
        mi.setId("id1");
        mi.setTitle("Person");
        elements.add(mi);

        MaskInfo mi2 = new MaskInfo();
        mi2.setId("id2");
        mi2.setTitle("Contracts");
        elements.add(mi2);

        MaskInfo mi3 = new MaskInfo();
        mi3.setId("id3");
        mi3.setTitle("Admin");
        elements.add(mi3);

        actual = mi2;
    }

    public MaskInfo actualItem() {
        return actual;
    }

    public List<MaskInfo> elements() {
        return new ArrayList<MaskInfo>(elements);
    }

    public MenuPath pathTo(MaskInfo mask) {
        MenuPath result = new MenuPath();
        for (MaskInfo mi : elements) {
            result.add(mi);
            if (mi.getId().equals(mask.getId())) {
                break;
            }
        }
        return result;
    }
}
