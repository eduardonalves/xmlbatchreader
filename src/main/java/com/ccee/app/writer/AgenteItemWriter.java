package com.ccee.app.writer;
import java.util.List;

import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import com.ccee.app.dao.AgenteDAO;
import com.ccee.app.model.AgenteXml;
public class AgenteItemWriter implements ItemWriter<AgenteXml> {
	@Autowired
	AgenteDAO agenteDAO;

	
	public void write(Chunk<? extends AgenteXml> chunk) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Writer here...");
		System.out.println(chunk);

	}
	public void write(List<? extends AgenteXml> items) throws Exception {
        System.out.println("Writer...");

        //List<AgenteXml> contractList = (List<AgenteXml>) items;
        
        //System.out.println(contractList);
        //contractDao.saveData(contractList);
    }
}
