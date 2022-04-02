package com.cat.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author al
 * @Date 2022/4/2
 */
@Data
public class Res<T> implements Serializable {

    private String code;

    private T data;

    private String description;

    private boolean success;
}
