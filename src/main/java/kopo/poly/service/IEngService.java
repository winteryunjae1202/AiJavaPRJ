package kopo.poly.service;

import kopo.poly.dto.EngDTO;

public interface IEngService {
        String modelFile = "C:/model/tessdata";

        EngDTO getReadforImageText(EngDTO pDTO) throws Exception;
}
