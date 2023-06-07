package kopo.poly.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
    //camel식을 사용하여 칼럼명에 있는 공백을 공백다음 첫문자를 대문자로 나타냄 ex)user_id ==> userID
    private String userId;
    private String userName;
    private String email;
    private String addr;
}
// 보통 DTO는 테이블 단위로 많이 만듬, DTO명을 테이블명을 만들면 가독성 올라가고 좋음