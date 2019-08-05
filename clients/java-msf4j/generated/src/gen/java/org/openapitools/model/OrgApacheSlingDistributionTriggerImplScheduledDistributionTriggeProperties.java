package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("path")
  private ConfigNodePropertyString path = null;

  @JsonProperty("seconds")
  private ConfigNodePropertyString seconds = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties path(ConfigNodePropertyString path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getPath() {
    return path;
  }

  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties seconds(ConfigNodePropertyString seconds) {
    this.seconds = seconds;
    return this;
  }

   /**
   * Get seconds
   * @return seconds
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSeconds() {
    return seconds;
  }

  public void setSeconds(ConfigNodePropertyString seconds) {
    this.seconds = seconds;
  }

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

   /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.name, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.name) &&
        Objects.equals(this.path, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.path) &&
        Objects.equals(this.seconds, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.seconds) &&
        Objects.equals(this.serviceName, orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.serviceName);
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

