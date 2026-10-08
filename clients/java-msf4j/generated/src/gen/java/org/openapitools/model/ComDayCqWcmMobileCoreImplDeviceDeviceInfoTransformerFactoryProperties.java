package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties   {
  @JsonProperty("device.info.transformer.enabled")
  private ConfigNodePropertyBoolean deviceInfoTransformerEnabled;

  @JsonProperty("device.info.transformer.css.style")
  private ConfigNodePropertyString deviceInfoTransformerCssStyle;

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
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

