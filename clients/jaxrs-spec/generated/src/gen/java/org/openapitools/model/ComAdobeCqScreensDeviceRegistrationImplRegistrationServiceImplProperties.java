package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties   {
  
  private @Valid ConfigNodePropertyInteger deviceRegistrationTimeout = null;

  /**
   **/
  public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties deviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deviceRegistrationTimeout")
  public ConfigNodePropertyInteger getDeviceRegistrationTimeout() {
    return deviceRegistrationTimeout;
  }
  public void setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties = (ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties) o;
    return Objects.equals(deviceRegistrationTimeout, comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.deviceRegistrationTimeout);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

