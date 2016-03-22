// Generated by esidl 0.4.0.

package org.w3c.dom.css;

public interface CSSStyleDeclaration
{
    // CSSStyleDeclaration
    public String getCssText();
    public void setCssText(String cssText);
    public int getLength();
    public String item(int index);
    public String getPropertyValue(String property);
    public String getPropertyPriority(String property);
    public void setProperty(String property, String value);
    public void setProperty(String property, String value, String priority);
    public String removeProperty(String property);
    public CSSStyleDeclarationValue getValues();
    public CSSRule getParentRule();
}
