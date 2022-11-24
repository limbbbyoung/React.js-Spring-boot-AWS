package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TodoEntity.java
 * Class 설명을 작성하세요.
 *
 * @author 임병영
 * @since 2022.11.23
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
    private String id; // 이 오브젝트의 아이디
    private String userId; // 이 오브젝트를 생성한 사용자 아이디
    private String title; // 타이틀(예:운동하기)
    private boolean done; // true - todo를 완료한 경우(checked)
}
