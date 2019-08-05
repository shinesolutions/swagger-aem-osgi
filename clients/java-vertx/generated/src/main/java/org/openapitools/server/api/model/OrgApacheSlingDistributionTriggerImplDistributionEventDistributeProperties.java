package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyString path = null;

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties () {

  }

  public OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties (ConfigNodePropertyString name, ConfigNodePropertyString path) {
    this.name = name;
    this.path = path;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties = (OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties) o;
    return Objects.equals(name, orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.name) &&
        Objects.equals(path, orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
