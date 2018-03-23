package com.taotao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.Wither;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbItemCat implements Serializable {
    private Long id;
    private Long parentId;
    @Wither
    private String name;

    @Getter
    private String pass;
    private Integer status;
    private Integer sortOrder;
    private Boolean isParent;
    private Date created;
    private Date updated;

    //TODO
    public static void main(String[] args) {
        TbItemCat cat = new TbItemCat();
        cat.setName("      ttt     ");
        System.out.println(cat.getName());
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}