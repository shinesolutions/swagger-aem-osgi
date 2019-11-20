package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties   {
  
  private ConfigNodePropertyInteger deviceRegistrationTimeout = null;

  public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties () {

  }

  public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties (ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
  }

    
  @JsonProperty("deviceRegistrationTimeout")
  public ConfigNodePropertyInteger getDeviceRegistrationTimeout() {
    return deviceRegistrationTimeout;
  }
  public void setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}