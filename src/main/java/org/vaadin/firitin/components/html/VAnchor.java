package org.vaadin.firitin.components.html;

import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.server.AbstractStreamResource;
import org.vaadin.firitin.fluency.ui.FluentHtmlContainer;

public class VAnchor extends Anchor implements FluentHtmlContainer<VAnchor> {
    public enum AnchorTarget {
        DEFAULT("_self"),
        BLANK("_blank"),
        PARENT("_parent"),
        TOP("_top");
        
        private String value;

        private AnchorTarget(String target) {
            this.value = target;
        }
    }

    public VAnchor() {
        super();
    }

    public VAnchor(String href, String text) {
        super(href, text);
    }

    public VAnchor(AbstractStreamResource href, String text) {
        super(href, text);
    }

    public VAnchor withHref(String href) {
        setHref(href);
        return this;
    }

    public VAnchor withHref(AbstractStreamResource href) {
        setHref(href);
        return this;
    }

    public VAnchor withTarget(String target) {
        setTarget(target);
        return this;
    }
    
    public VAnchor withTarget(AnchorTarget target) {
        return withTarget(target.value);
    }
}
