package com.morshed.mongomigration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;

@ChangeLog(order = "00001")
public class DbChangelog00001 {

    @ChangeSet(order = "001", id="initialDivisionData", author = "Monjur-E-Morshed")
    public void setInitialData(MongockTemplate mongockTemplate){
        Division division = Division.builder()
                .name("Division")
                .bnName("BanglaDivision")
                .url("www.division.com")
                .build();
        mongockTemplate.insert(division);
    }
}
