package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("extendable.widgets")
  private ConfigNodePropertyArray extendableWidgets;

  @JsonProperty("widgetextensionprovider.debug")
  private ConfigNodePropertyBoolean widgetextensionproviderDebug;

  /**
   * 
   * @return extendableWidgets
   */
  public ConfigNodePropertyArray getExtendableWidgets() {
    return extendableWidgets;
  }

  public void setExtendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
  }

  /**
   * 
   * @return widgetextensionproviderDebug
   */
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
    return Objects.equals(this.extendableWidgets, comDayCqWidgetImplWidgetExtensionProviderImplProperties.extendableWidgets) &&
        Objects.equals(this.widgetextensionproviderDebug, comDayCqWidgetImplWidgetExtensionProviderImplProperties.widgetextensionproviderDebug);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
