package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
  @Valid
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

