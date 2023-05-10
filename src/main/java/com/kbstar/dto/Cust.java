package com.kbstar.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Cust {
    @Size(min=4, max=10, message= "ID는 최소 4자리, 최대 10자리 이내로 입력하세요.") // 이 사이즈에 해당하지 않으면 error 반환
    @NotEmpty(message= "ID는 필수 항목 입니다") // null, blank 값이 못 들어오게 함
    private String id;
    @Size(min=5, max=10, message= "PASSWORD는 최소 5자리, 최대 10자리 이내로 입력하세요.")
    @NotEmpty(message= "PASSWORD는 필수 항목 입니다")
    private String pwd;
    @NotEmpty(message= "NAME은 필수 항목 입니다")
    private String name;
}
