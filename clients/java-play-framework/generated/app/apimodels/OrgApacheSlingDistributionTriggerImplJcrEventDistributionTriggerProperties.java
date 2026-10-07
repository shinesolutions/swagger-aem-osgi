package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties   {
  @JsonProperty("name")
  @Valid

  private ConfigNodePropertyString name;

  @JsonProperty("path")
  @Valid

  private ConfigNodePropertyString path;

  @JsonProperty("ignoredPathsPatterns")
  @Valid

  private ConfigNodePropertyArray ignoredPathsPatterns;

  @JsonProperty("serviceName")
  @Valid

  private ConfigNodePropertyString serviceName;

  @JsonProperty("deep")
  @Valid

  private ConfigNodePropertyBoolean deep;

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties name(ConfigNodePropertyString name) {
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties path(ConfigNodePropertyString path) {
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties ignoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
    return this;
  }

   /**
   * Get ignoredPathsPatterns
   * @return ignoredPathsPatterns
  **/
  public ConfigNodePropertyArray getIgnoredPathsPatterns() {
    return ignoredPathsPatterns;
  }

  public void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties serviceName(ConfigNodePropertyString serviceName) {
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

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties deep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
    return this;
  }

   /**
   * Get deep
   * @return deep
  **/
  public ConfigNodePropertyBoolean getDeep() {
    return deep;
  }

  public void setDeep(ConfigNodePropertyBoolean deep) {
    this.deep = deep;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties = (OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.path) &&
        Objects.equals(ignoredPathsPatterns, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.ignoredPathsPatterns) &&
        Objects.equals(serviceName, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.serviceName) &&
        Objects.equals(deep, orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.deep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, ignoredPathsPatterns, serviceName, deep);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    ignoredPathsPatterns: ").append(toIndentedString(ignoredPathsPatterns)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    deep: ").append(toIndentedString(deep)).append("\n");
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

