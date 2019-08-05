package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties   {
  
  private ConfigNodePropertyArray configBucketNames = null;

  public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties () {

  }

  public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties (ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
  }

    
  @JsonProperty("configBucketNames")
  public ConfigNodePropertyArray getConfigBucketNames() {
    return configBucketNames;
  }
  public void setConfigBucketNames(ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties orgApacheSlingCaconfigImplConfigurationResolverImplProperties = (OrgApacheSlingCaconfigImplConfigurationResolverImplProperties) o;
    return Objects.equals(configBucketNames, orgApacheSlingCaconfigImplConfigurationResolverImplProperties.configBucketNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configBucketNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {\n");
    
    sb.append("    configBucketNames: ").append(toIndentedString(configBucketNames)).append("\n");
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
