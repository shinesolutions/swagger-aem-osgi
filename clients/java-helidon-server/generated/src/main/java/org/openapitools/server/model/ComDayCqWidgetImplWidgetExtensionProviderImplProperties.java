package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties   {

    private ConfigNodePropertyArray extendableWidgets;
    private ConfigNodePropertyBoolean widgetextensionproviderDebug;

    /**
     * Default constructor.
     */
    public ComDayCqWidgetImplWidgetExtensionProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
     *
     * @param extendableWidgets extendableWidgets
     * @param widgetextensionproviderDebug widgetextensionproviderDebug
     */
    public ComDayCqWidgetImplWidgetExtensionProviderImplProperties(
        ConfigNodePropertyArray extendableWidgets, 
        ConfigNodePropertyBoolean widgetextensionproviderDebug
    ) {
        this.extendableWidgets = extendableWidgets;
        this.widgetextensionproviderDebug = widgetextensionproviderDebug;
    }



    /**
     * Get extendableWidgets
     * @return extendableWidgets
     */
    public ConfigNodePropertyArray getExtendableWidgets() {
        return extendableWidgets;
    }

    public void setExtendableWidgets(ConfigNodePropertyArray extendableWidgets) {
        this.extendableWidgets = extendableWidgets;
    }

    /**
     * Get widgetextensionproviderDebug
     * @return widgetextensionproviderDebug
     */
    public ConfigNodePropertyBoolean getWidgetextensionproviderDebug() {
        return widgetextensionproviderDebug;
    }

    public void setWidgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
        this.widgetextensionproviderDebug = widgetextensionproviderDebug;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {\n");
        
        sb.append("    extendableWidgets: ").append(toIndentedString(extendableWidgets)).append("\n");
        sb.append("    widgetextensionproviderDebug: ").append(toIndentedString(widgetextensionproviderDebug)).append("\n");
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

