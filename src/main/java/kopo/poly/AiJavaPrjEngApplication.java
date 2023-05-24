package kopo.poly;

import kopo.poly.dto.EngDTO;
import kopo.poly.service.IEngService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class AiJavaPrjEngApplication implements CommandLineRunner {
    private final IEngService engService;

    public static void main(String[] args) {
        SpringApplication.run(kopo.poly.AiJavaPrjEngApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Java start!");

        String filePath = "images";
        String fileName = "sample02.jpg";

        EngDTO pDTO = new EngDTO();

        pDTO.setFilePath(filePath);
        pDTO.setFileName(fileName);

        EngDTO rDTO = engService.getReadforImageText(pDTO);

        String result = rDTO.getResult();
        log.info("Sentence");
        log.info(result);
        log.info("Java End!");

    }
}