package kopo.poly.persistance.mapper;

import kopo.poly.dto.StudentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper     //mybatis에서 제공하고 있는 어노테이션
public interface IStudentMapper {
    void insertStudent(StudentDTO pDTO) throws Exception;       // 리턴값 없으므로 void 사용 / Insert 쿼리 함수
    List<StudentDTO> getStudentList() throws Exception;      // select 쿼리문은 앞에 get을 붙임 / 조회결과가 1개이상일때 List로 결과를 받음
    StudentDTO getStudent(StudentDTO pDTO) throws Exception;    // 조회결과 1개일때 DTO로 결과를 받음
}
