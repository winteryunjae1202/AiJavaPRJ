package kopo.poly.service;

import kopo.poly.dto.StudentDTO;

import java.util.List;

public interface IStudentService {
    List<StudentDTO> insertStudent(StudentDTO pDTO) throws Exception;
}
