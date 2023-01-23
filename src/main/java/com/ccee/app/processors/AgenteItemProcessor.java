package com.ccee.app.processors;

import org.springframework.batch.item.ItemProcessor;

import com.ccee.app.model.AgenteXml;

public class AgenteItemProcessor implements ItemProcessor<AgenteXml, AgenteXml> {
	@Override
    public AgenteXml process(AgenteXml result) throws Exception {
        System.out.println("Processing result :");
        System.out.println(result);
        return result;
    }
}
