package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties   {
  @JsonProperty("name")
  @Valid

  private ConfigNodePropertyString name;

  @JsonProperty("path")
  @Valid

  private ConfigNodePropertyString path;

  @JsonProperty("seconds")
  @Valid

  private ConfigNodePropertyString seconds;

  @JsonProperty("serviceName")
  @Valid

  private ConfigNodePropertyString serviceName;

  public OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
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
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

