package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("deviceRegistrationTimeout")
  private ConfigNodePropertyInteger deviceRegistrationTimeout;

  /**
   * 
   * @return deviceRegistrationTimeout
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
