package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWidgetImplWidgetExtensionProviderImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWidgetImplWidgetExtensionProviderImplProperties   {
  @JsonProperty("extendable.widgets")
  private ConfigNodePropertyArray extendableWidgets = null;

  @JsonProperty("widgetextensionprovider.debug")
  private ConfigNodePropertyBoolean widgetextensionproviderDebug = null;

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties extendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
    return this;
  }

   /**
   * Get extendableWidgets
   * @return extendableWidgets
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExtendableWidgets() {
    return extendableWidgets;
  }

  public void setExtendableWidgets(ConfigNodePropertyArray extendableWidgets) {
    this.extendableWidgets = extendableWidgets;
  }

  public ComDayCqWidgetImplWidgetExtensionProviderImplProperties widgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
    return this;
  }

   /**
   * Get widgetextensionproviderDebug
   * @return widgetextensionproviderDebug
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getWidgetextensionproviderDebug() {
    return widgetextensionproviderDebug;
  }

  public void setWidgetextensionproviderDebug(ConfigNodePropertyBoolean widgetextensionproviderDebug) {
    this.widgetextensionproviderDebug = widgetextensionproviderDebug;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

