package kopo.poly.service.impl;

import kopo.poly.dto.EngDTO;
import kopo.poly.service.IEngService;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Slf4j
@Service

public class Engservice implements IEngService {
    @Override
    public EngDTO getReadforImageText(EngDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + ".getReadforImageText start!");

        ClassPathResource resource = new ClassPathResource((pDTO.getFilePath()) + "/" + pDTO.getFileName());

        ITesseract instance = new Tesseract();

        instance.setDatapath((IEngService.modelFile));
        instance.setLanguage("eng");

        String result = instance.doOCR(resource.getFile());
        pDTO.setResult(result);
        log.info(this.getClass().getName() + "/" + ".getReadforImageText End!");
        return pDTO;
    }
}