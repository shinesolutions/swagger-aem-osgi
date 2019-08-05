package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties   {
  @JsonProperty("deviceRegistrationTimeout")
  private ConfigNodePropertyInteger deviceRegistrationTimeout = null;

  public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties deviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
    this.deviceRegistrationTimeout = deviceRegistrationTimeout;
    return this;
  }

   /**
   * Get deviceRegistrationTimeout
   * @return deviceRegistrationTimeout
  **/
  @ApiModelProperty(value = "")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

