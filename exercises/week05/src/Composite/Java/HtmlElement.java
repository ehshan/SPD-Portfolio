package Composite.Java;

public class HtmlElement extends HtmlTag {

    public String tagName;
    public String startTag;
    public String endTag;
    public String body;

    public HtmlElement(String s) {
        this.tagName = s;
    }


    @Override
    public String getTagName() {
       return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        endTag = tag;
    }

    public void setTagBody(String bodyTag){
        body = bodyTag;
    }


    @Override
    public void generateHtml() {
        System.out.print(startTag);
        System.out.print(body);
        System.out.println(endTag);
    }
}