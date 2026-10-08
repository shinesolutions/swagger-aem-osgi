package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray configBucketNames;
 /**
   * Get configBucketNames
   * @return configBucketNames
  **/
  @JsonProperty("configBucketNames")
  public ConfigNodePropertyArray getConfigBucketNames() {
    return configBucketNames;
  }

  public void setConfigBucketNames(ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
  }

  public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties configBucketNames(ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
    return this;
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
    return Objects.equals(this.configBucketNames, orgApacheSlingCaconfigImplConfigurationResolverImplProperties.configBucketNames);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

