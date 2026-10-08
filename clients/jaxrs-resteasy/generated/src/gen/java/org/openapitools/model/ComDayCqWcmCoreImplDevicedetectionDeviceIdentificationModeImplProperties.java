package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties   {
  
  private ConfigNodePropertyDropDown dimDefaultMode;
  private ConfigNodePropertyBoolean dimAppcacheEnabled;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim.default.mode")
  @Valid
  public ConfigNodePropertyDropDown getDimDefaultMode() {
    return dimDefaultMode;
  }
  public void setDimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("dim.appcache.enabled")
  @Valid
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
    return Objects.equals(this.dimDefaultMode, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.dimDefaultMode) &&
        Objects.equals(this.dimAppcacheEnabled, comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties.dimAppcacheEnabled);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

