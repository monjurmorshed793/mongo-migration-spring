package com.morshed.mongomigration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ChangeLog(order = "00002")
public class DbChangelog00002 {
    @ChangeSet(order = "001", id="divisionData", author = "Monjur-E-Morshed")
    public void importDivisionCSVData(MongockTemplate mongockTemplate) throws IOException {
        File divisionFile = new ClassPathResource("initial-data/divisions.csv").getFile();
        BufferedReader br = new BufferedReader(new FileReader(divisionFile.getPath()));
        String line=null;
        while ((line = br.readLine()) != null) {
            List<String> objects = new ArrayList<String>(Arrays.asList(line.split(",")));
            Division division = new Division();
            division.setId(objects.get(0));
            division.setName(objects.get(1));
            division.setBnName(objects.get(2));
            division.setUrl(objects.get(3));
            mongockTemplate.insert(division);
        }
    }
}
