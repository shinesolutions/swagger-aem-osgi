package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties   {
  
  private ConfigNodePropertyArray extendableWidgets = null;
  private ConfigNodePropertyBoolean widgetextensionproviderDebug = null;

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties () {

  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties (ConfigNodePropertyArray extendableWidgets, ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.extendableWidgets = extendableWidgets;
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
  }

    
  @JsonProperty("extendable.widgets")
  public ConfigNodePropertyArray getExtendableWidgets() {
    return extendableWidgets;
  }
  public void setExtendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
  }

    
  @JsonProperty("widgetextensionprovider.debug")
  public ConfigNodePropertyBoolean getWidgetextensionproviderDebug() {
    return widgetextensionproviderDebug;
  }
  public void setWidgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties comDayCqWidgetImplWidgetExtensionProviderImplProperties = (ComDayCqWidgetImplWidgetExtensionProviderImplProperties) o;
    return Objects.equals(extendableWidgets, comDayCqWidgetImplWidgetExtensionProviderImplProperties.extendableWidgets) &&
        Objects.equals(widgetextensionproviderDebug, comDayCqWidgetImplWidgetExtensionProviderImplProperties.widgetextensionproviderDebug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendableWidgets, widgetextensionproviderDebug);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
