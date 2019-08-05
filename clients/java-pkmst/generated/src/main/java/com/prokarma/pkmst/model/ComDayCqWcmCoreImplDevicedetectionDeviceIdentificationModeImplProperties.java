package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties   {
  @JsonProperty("dim.default.mode")
  private ConfigNodePropertyDropDown dimDefaultMode = null;

  @JsonProperty("dim.appcache.enabled")
  private ConfigNodePropertyBoolean dimAppcacheEnabled = null;

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties dimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
    return this;
  }

   /**
   * Get dimDefaultMode
   * @return dimDefaultMode
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyDropDown getDimDefaultMode() {
    return dimDefaultMode;
  }

  public void setDimDefaultMode(ConfigNodePropertyDropDown dimDefaultMode) {
    this.dimDefaultMode = dimDefaultMode;
  }

  public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties dimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimAppcacheEnabled = dimAppcacheEnabled;
    return this;
  }

   /**
   * Get dimAppcacheEnabled
   * @return dimAppcacheEnabled
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getDimAppcacheEnabled() {
    return dimAppcacheEnabled;
  }

  public void setDimAppcacheEnabled(ConfigNodePropertyBoolean dimAppcacheEnabled) {
    this.dimAppcacheEnabled = dimAppcacheEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

