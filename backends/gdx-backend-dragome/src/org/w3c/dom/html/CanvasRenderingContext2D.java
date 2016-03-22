// Generated by esidl 0.4.0.

package org.w3c.dom.html;

import org.w3c.dom.Element;

public interface CanvasRenderingContext2D
{
    // CanvasRenderingContext2D
    public HTMLCanvasElement getCanvas();
    public void save();
    public void restore();
    public void scale(double x, double y);
    public void rotate(double angle);
    public void translate(double x, double y);
    public void transform(double a, double b, double c, double d, double e, double f);
    public void setTransform(double a, double b, double c, double d, double e, double f);
    public double getGlobalAlpha();
    public void setGlobalAlpha(double globalAlpha);
    public String getGlobalCompositeOperation();
    public void setGlobalCompositeOperation(String globalCompositeOperation);
    public Object getStrokeStyle();
    public void setStrokeStyle(Object strokeStyle);
    public Object getFillStyle();
    public void setFillStyle(Object fillStyle);
    public CanvasGradient createLinearGradient(double x0, double y0, double x1, double y1);
    public CanvasGradient createRadialGradient(double x0, double y0, double r0, double x1, double y1, double r1);
    public CanvasPattern createPattern(HTMLImageElement image, String repetition);
    public CanvasPattern createPattern(HTMLCanvasElement image, String repetition);
    public CanvasPattern createPattern(HTMLVideoElement image, String repetition);
    public double getLineWidth();
    public void setLineWidth(double lineWidth);
    public String getLineCap();
    public void setLineCap(String lineCap);
    public String getLineJoin();
    public void setLineJoin(String lineJoin);
    public double getMiterLimit();
    public void setMiterLimit(double miterLimit);
    public double getShadowOffsetX();
    public void setShadowOffsetX(double shadowOffsetX);
    public double getShadowOffsetY();
    public void setShadowOffsetY(double shadowOffsetY);
    public double getShadowBlur();
    public void setShadowBlur(double shadowBlur);
    public String getShadowColor();
    public void setShadowColor(String shadowColor);
    public void clearRect(double x, double y, double w, double h);
    public void fillRect(double x, double y, double w, double h);
    public void strokeRect(double x, double y, double w, double h);
    public void beginPath();
    public void closePath();
    public void moveTo(double x, double y);
    public void lineTo(double x, double y);
    public void quadraticCurveTo(double cpx, double cpy, double x, double y);
    public void bezierCurveTo(double cp1x, double cp1y, double cp2x, double cp2y, double x, double y);
    public void arcTo(double x1, double y1, double x2, double y2, double radius);
    public void rect(double x, double y, double w, double h);
    public void arc(double x, double y, double radius, double startAngle, double endAngle);
    public void arc(double x, double y, double radius, double startAngle, double endAngle, boolean anticlockwise);
    public void fill();
    public void stroke();
    public void drawSystemFocusRing(Element element);
    public boolean drawCustomFocusRing(Element element);
    public void scrollPathIntoView();
    public void clip();
    public boolean isPointInPath(double x, double y);
    public String getFont();
    public void setFont(String font);
    public String getTextAlign();
    public void setTextAlign(String textAlign);
    public String getTextBaseline();
    public void setTextBaseline(String textBaseline);
    public void fillText(String text, double x, double y);
    public void fillText(String text, double x, double y, double maxWidth);
    public void strokeText(String text, double x, double y);
    public void strokeText(String text, double x, double y, double maxWidth);
    public TextMetrics measureText(String text);
    public void drawImage(HTMLImageElement image, double dx, double dy);
    public void drawImage(HTMLImageElement image, double dx, double dy, double dw, double dh);
    public void drawImage(HTMLImageElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    public void drawImage(HTMLCanvasElement image, double dx, double dy);
    public void drawImage(HTMLCanvasElement image, double dx, double dy, double dw, double dh);
    public void drawImage(HTMLCanvasElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    public void drawImage(HTMLVideoElement image, double dx, double dy);
    public void drawImage(HTMLVideoElement image, double dx, double dy, double dw, double dh);
    public void drawImage(HTMLVideoElement image, double sx, double sy, double sw, double sh, double dx, double dy, double dw, double dh);
    public ImageData createImageData(double sw, double sh);
    public ImageData createImageData(ImageData imagedata);
    public ImageData getImageData(double sx, double sy, double sw, double sh);
    public void putImageData(ImageData imagedata, double dx, double dy);
    public void putImageData(ImageData imagedata, double dx, double dy, double dirtyX, double dirtyY, double dirtyWidth, double dirtyHeight);
}
