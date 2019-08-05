package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyArray ignoredPathsPatterns = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyBoolean deep = null;

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties () {

  }

  public OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties (ConfigNodePropertyString name, ConfigNodePropertyString path, ConfigNodePropertyArray ignoredPathsPatterns, ConfigNodePropertyString serviceName, ConfigNodePropertyBoolean deep) {
    this.name = name;
    this.path = path;
    this.ignoredPathsPatterns = ignoredPathsPatterns;
    this.serviceName = serviceName;
    this.deep = deep;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("path")
  public ConfigNodePropertyString getPath() {
    return path;
  }
  public void setPath(ConfigNodePropertyString path) {
    this.path = path;
  }

    
  @JsonProperty("ignoredPathsPatterns")
  public ConfigNodePropertyArray getIgnoredPathsPatterns() {
    return ignoredPathsPatterns;
  }
  public void setIgnoredPathsPatterns(ConfigNodePropertyArray ignoredPathsPatterns) {
    this.ignoredPathsPatterns = ignoredPathsPatterns;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("deep")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
