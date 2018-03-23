package com.taotao.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TbItemDesc implements Serializable {
    private Long itemId;
    private Date created;
    private Date updated;
    private String itemDesc;

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc == null ? null : itemDesc.trim();
    }
}