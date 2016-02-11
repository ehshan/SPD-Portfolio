package AbstractFactory.Java;

import AbstractFactory.Java.XMLParser;

public interface AbstractParserFactory {

    XMLParser getParserInstance(String parserType);
}
