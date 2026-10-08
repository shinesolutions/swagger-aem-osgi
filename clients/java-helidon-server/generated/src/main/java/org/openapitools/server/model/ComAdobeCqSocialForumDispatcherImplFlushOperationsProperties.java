package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties   {

    private ConfigNodePropertyInteger extensionOrder;
    private ConfigNodePropertyBoolean flushForumontopic;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
     *
     * @param extensionOrder extensionOrder
     * @param flushForumontopic flushForumontopic
     */
    public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(
        ConfigNodePropertyInteger extensionOrder, 
        ConfigNodePropertyBoolean flushForumontopic
    ) {
        this.extensionOrder = extensionOrder;
        this.flushForumontopic = flushForumontopic;
    }



    /**
     * Get extensionOrder
     * @return extensionOrder
     */
    public ConfigNodePropertyInteger getExtensionOrder() {
        return extensionOrder;
    }

    public void setExtensionOrder(ConfigNodePropertyInteger extensionOrder) {
        this.extensionOrder = extensionOrder;
    }

    /**
     * Get flushForumontopic
     * @return flushForumontopic
     */
    public ConfigNodePropertyBoolean getFlushForumontopic() {
        return flushForumontopic;
    }

    public void setFlushForumontopic(ConfigNodePropertyBoolean flushForumontopic) {
        this.flushForumontopic = flushForumontopic;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties {\n");
        
        sb.append("    extensionOrder: ").append(toIndentedString(extensionOrder)).append("\n");
        sb.append("    flushForumontopic: ").append(toIndentedString(flushForumontopic)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

