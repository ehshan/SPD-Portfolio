package Composite.Java;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

    public List<HtmlTag> childTags = new ArrayList<>();
    public String tagName;
    public String startTag;
    public String endTag;

    public HtmlParentElement(String s) {
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

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        childTags.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        childTags.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return childTags;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        childTags.forEach(HtmlTag::generateHtml);
        System.out.println(endTag);
    }
}