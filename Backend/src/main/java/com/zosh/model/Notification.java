package com.zosh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    private Long fromAppuserId;
    private Long toUserid;
    private Long amount;
    private String message;
}
