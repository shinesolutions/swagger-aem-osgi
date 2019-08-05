package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties   {
  
  private ConfigNodePropertyBoolean deviceInfoTransformerEnabled = null;
  private ConfigNodePropertyString deviceInfoTransformerCssStyle = null;

  public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties () {

  }

  public ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties (ConfigNodePropertyBoolean deviceInfoTransformerEnabled, ConfigNodePropertyString deviceInfoTransformerCssStyle) {
    this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
    this.deviceInfoTransformerCssStyle = deviceInfoTransformerCssStyle;
  }

    
  @JsonProperty("device.info.transformer.enabled")
  public ConfigNodePropertyBoolean getDeviceInfoTransformerEnabled() {
    return deviceInfoTransformerEnabled;
  }
  public void setDeviceInfoTransformerEnabled(ConfigNodePropertyBoolean deviceInfoTransformerEnabled) {
    this.deviceInfoTransformerEnabled = deviceInfoTransformerEnabled;
  }

    
  @JsonProperty("device.info.transformer.css.style")
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
    return Objects.equals(deviceInfoTransformerEnabled, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.deviceInfoTransformerEnabled) &&
        Objects.equals(deviceInfoTransformerCssStyle, comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties.deviceInfoTransformerCssStyle);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
