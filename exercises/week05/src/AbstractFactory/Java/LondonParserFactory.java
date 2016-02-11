package AbstractFactory.Java;

public class LondonParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {

        XMLParser parser = null;
        switch(parserType){
            case "error":       parserType.equals("LondonERROR");
                                parser = new LondonErrorXMLParser();
                                break;
            case "feedback":    parserType.equals("LondonFEEDBACK");
                                parser = new LondonFeedbackXMLParser();
                                break;
            case "order":       parserType.equals("LondonORDER");
                                parser = new LondonOrderXMLParser();
                                break;
            case "response":    parserType.equals("LondonRESPONSE");
                                parser = new LondonResponseXMLParser();
                                break;
        }


        return parser;
    }
}
