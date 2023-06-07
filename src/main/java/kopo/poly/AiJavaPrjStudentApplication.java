package kopo.poly;

import kopo.poly.dto.StudentDTO;
import kopo.poly.service.IStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class AiJavaPrjStudentApplication implements CommandLineRunner {
    private final IStudentService studentService;

    public static void main(String[] args) {
        SpringApplication.run(AiJavaPrjStudentApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("자바 프로그래밍 시작!");

        StudentDTO pDTO;
        List<StudentDTO> rList;

        pDTO = new StudentDTO();
        pDTO.setUserId("hglee");
        pDTO.setUserName("이협건");
        pDTO.setEmail("hglee67@kopo.ac.kr");
        pDTO.setAddr("서울");

        rList = studentService.insertStudent(pDTO);
        rList.forEach(dto -> {
            log.info("DB에 저장된 아이디 : " + dto.getUserId());
            log.info("DB에 저장된 이름 : " + dto.getUserName());
            log.info("DB에 저장된 이메일 : " + dto.getEmail());
            log.info("DB에 저장된 주소 : " + dto.getAddr());
        });
    }
}










