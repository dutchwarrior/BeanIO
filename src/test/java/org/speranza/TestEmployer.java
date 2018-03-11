/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.speranza;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;
import org.junit.Test;

/**
 *
 * @author feder
 */
public class TestEmployer {

    @Test
    public void writeBeanEmployer() throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Employer employer = new Employer("Jonny", "Smith", "Avvocato", 1330d, sdf.parse("10/10/2010"));
        StreamFactory streamFactory = StreamFactory.newInstance();
        StreamBuilder sb = new StreamBuilder("EmployFile")
                .format("delimited")
                .parser(new DelimitedParserBuilder(';'))
                .addTypeHandler("DoubleCustomTypeHandlerImpl", new DoubleCustomTypeHandlerImpl())
                .addRecord(Employer.class);
        streamFactory.define(sb);
        File file = new File("C:/temp/prova1.txt");
        file.createNewFile();
        BeanWriter writer = streamFactory.createWriter("EmployFile", file);
        writer.write(employer);
        writer.flush();
        writer.close();
    }

    @Test
    public void writeBeanEmployerCustomConverter() throws ParseException, IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        EmployerCustomConverter employer = new EmployerCustomConverter("Jonny", "Smith", "Avvocato", 1330d, sdf.parse("10/10/2010"));
        StreamFactory streamFactory = StreamFactory.newInstance();
        StreamBuilder sb = new StreamBuilder("EmployFile")
                .format("delimited")
                .parser(new DelimitedParserBuilder(';'))
                .addTypeHandler(Double.class, new DoubleCustomTypeHandlerImpl_1())
                .addRecord(EmployerCustomConverter.class);
        streamFactory.define(sb);
        File file = new File("C:/temp/prova2.txt");
        file.createNewFile();
        BeanWriter writer = streamFactory.createWriter("EmployFile", file);
        writer.write(employer);
        writer.flush();
        writer.close();
    }

}
