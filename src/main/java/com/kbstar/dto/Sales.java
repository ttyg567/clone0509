package com.kbstar.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Sales {
    private String rdate;
    private int price;
    private String gender;

    public Sales(int price, String gender) {
        this.price = price;
        this.gender = gender;
    }
}
