package com.aseprojali.faqpresiden.io.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

/**
 * Created by avew on 3/6/15.
 */
public class StringConverter implements Converter {
    @Override
    public Object fromBody(TypedInput typedInput, Type type) throws ConversionException {
        String text = null;
        try {
            text = fromStream(typedInput.in());
        } catch (Exception ignored) {/*NOP*/ }

        return text;
    }

    @Override
    public TypedOutput toBody(Object object) {
        return null;
    }

    public static String fromStream(InputStream in) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(in, "utf-8"), 8);
        StringBuilder out = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        String line;


        while ((line = reader.readLine()) != null) {
            out.append(line);
            out.append(newLine);
        }


        return out.toString();
    }
}
