package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString path = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString nuggetsPath = null;

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties () {

  }

  public OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties (ConfigNodePropertyString name, ConfigNodePropertyString path, ConfigNodePropertyString serviceName, ConfigNodePropertyString nuggetsPath) {
    this.name = name;
    this.path = path;
    this.serviceName = serviceName;
    this.nuggetsPath = nuggetsPath;
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

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("nuggetsPath")
  public ConfigNodePropertyString getNuggetsPath() {
    return nuggetsPath;
  }
  public void setNuggetsPath(ConfigNodePropertyString nuggetsPath) {
    this.nuggetsPath = nuggetsPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties = (OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.path) &&
        Objects.equals(serviceName, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.serviceName) &&
        Objects.equals(nuggetsPath, orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.nuggetsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path, serviceName, nuggetsPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    nuggetsPath: ").append(toIndentedString(nuggetsPath)).append("\n");
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
