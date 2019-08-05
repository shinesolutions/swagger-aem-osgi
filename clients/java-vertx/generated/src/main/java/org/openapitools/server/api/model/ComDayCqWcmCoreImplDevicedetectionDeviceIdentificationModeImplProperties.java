package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties   {
  
  private ConfigNodePropertyDropDown dimDefaultMode = null;
  private ConfigNodePropertyBoolean dimAppcacheEnabled = null;

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties () {

  }

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties (ConfigNodePropertyDropDown dimDefaultMode, ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimDefaultMode = dimDefaultMode;
    this.dimAppcacheEnabled = dimAppcacheEnabled;
  }

    
  @JsonProperty("dim.default.mode")
  public ConfigNodePropertyDropDown getDimDefaultMode() {
    return dimDefaultMode;
  }
  public void setDimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
  }

    
  @JsonProperty("dim.appcache.enabled")
  public ConfigNodePropertyBoolean getDimAppcacheEnabled() {
    return dimAppcacheEnabled;
  }
  public void setDimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimAppcacheEnabled = dimAppcacheEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties = (ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties) o;
    return Objects.equals(dimDefaultMode, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.dimDefaultMode) &&
        Objects.equals(dimAppcacheEnabled, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.dimAppcacheEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimDefaultMode, dimAppcacheEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {\n");
    
    sb.append("    dimDefaultMode: ").append(toIndentedString(dimDefaultMode)).append("\n");
    sb.append("    dimAppcacheEnabled: ").append(toIndentedString(dimAppcacheEnabled)).append("\n");
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
