package com.example.yuaicoder.core;

import com.example.yuaicoder.model.enums.CodeGenTypeEnum;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class AiCodeGeneratorFacadeTest {


    @Resource AiCodeGeneratorFacade aiCodeGeneratorFacade;
    @Test
    void generateAndSaveCode() {
        File file = aiCodeGeneratorFacade.generateAndSaveCode("生成一个登陆页面，不超过20行", CodeGenTypeEnum.MULTI_FILE);
        Assertions.assertNotNull(file);
    }

    @Test
    void testGenerateAndSaveCode() {
        Flux<String> codeStream = aiCodeGeneratorFacade.generateAndSaveCodeStream("生成一个登陆页面，不超过20行", CodeGenTypeEnum.MULTI_FILE);
        List<String> res = codeStream.collectList().block();
        Assertions.assertNotNull(res);

        //拼接字符串得到完整代码
        String completeCode = String.join("", res);
        Assertions.assertNotNull(completeCode);
    }
}