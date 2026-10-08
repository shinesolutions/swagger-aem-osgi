package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger deviceRegistrationTimeout;
 /**
  * Get deviceRegistrationTimeout
  * @return deviceRegistrationTimeout
  */
  @JsonProperty("deviceRegistrationTimeout")
  public ConfigNodePropertyInteger getDeviceRegistrationTimeout() {
    return deviceRegistrationTimeout;
  }

  /**
   * Sets the <code>deviceRegistrationTimeout</code> property.
   */
 public void setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
  }

  /**
   * Sets the <code>deviceRegistrationTimeout</code> property.
   */
  public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties deviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties = (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties) o;
    return Objects.equals(this.deviceRegistrationTimeout, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.deviceRegistrationTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceRegistrationTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {\n");
    
    sb.append("    deviceRegistrationTimeout: ").append(toIndentedString(deviceRegistrationTimeout)).append("\n");
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

