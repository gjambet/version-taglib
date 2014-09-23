package net.guillaume.tooling.web.dev;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class VersionTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        JspWriter writer = pageContext.getOut();

        try {

            writer.append("pipo bimbo !!!!");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return Tag.SKIP_BODY;
    }

}
