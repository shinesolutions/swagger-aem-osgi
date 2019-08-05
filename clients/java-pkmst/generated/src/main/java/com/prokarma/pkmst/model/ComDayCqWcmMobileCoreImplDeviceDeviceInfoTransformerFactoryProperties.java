package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties   {
  @JsonProperty("device.info.transformer.enabled")
  private ConfigNodePropertyBoolean deviceInfoTransformerEnabled = null;

  @JsonProperty("device.info.transformer.css.style")
  private ConfigNodePropertyString deviceInfoTransformerCssStyle = null;

  public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties deviceInfoTransformerEnabled(ConfigNodePropertyBoolean deviceInfoTransformerEnabled) {
    this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
    return this;
  }

   /**
   * Get deviceInfoTransformerEnabled
   * @return deviceInfoTransformerEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDeviceInfoTransformerEnabled() {
    return deviceInfoTransformerEnabled;
  }

  public void setDeviceInfoTransformerEnabled(ConfigNodePropertyBoolean deviceInfoTransformerEnabled) {
    this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
  }

  public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties deviceInfoTransformerCssStyle(ConfigNodePropertyString deviceInfoTransformerCssStyle) {
    this.deviceInfoTransformerCssStyle = deviceInfoTransformerCssStyle;
    return this;
  }

   /**
   * Get deviceInfoTransformerCssStyle
   * @return deviceInfoTransformerCssStyle
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getDeviceInfoTransformerCssStyle() {
    return deviceInfoTransformerCssStyle;
  }

  public void setDeviceInfoTransformerCssStyle(ConfigNodePropertyString deviceInfoTransformerCssStyle) {
    this.deviceInfoTransformerCssStyle = deviceInfoTransformerCssStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties = (ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties) o;
    return Objects.equals(this.deviceInfoTransformerEnabled, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.deviceInfoTransformerEnabled) &&
        Objects.equals(this.deviceInfoTransformerCssStyle, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.deviceInfoTransformerCssStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceInfoTransformerEnabled, deviceInfoTransformerCssStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {\n");
    
    sb.append("    deviceInfoTransformerEnabled: ").append(toIndentedString(deviceInfoTransformerEnabled)).append("\n");
    sb.append("    deviceInfoTransformerCssStyle: ").append(toIndentedString(deviceInfoTransformerCssStyle)).append("\n");
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

