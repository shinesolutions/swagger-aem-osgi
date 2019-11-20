package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString seconds = null;
  private ConfigNodePropertyString serviceName = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("seconds")
  public ConfigNodePropertyString getSeconds() {
    return seconds;
  }
  public void setSeconds(ConfigNodePropertyString seconds) {
    this.seconds = seconds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties = (OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.path) &&
        Objects.equals(seconds, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.seconds) &&
        Objects.equals(serviceName, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.serviceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, seconds, serviceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
