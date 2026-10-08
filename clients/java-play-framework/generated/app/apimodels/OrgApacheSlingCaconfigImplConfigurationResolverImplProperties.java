package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties   {
  @JsonProperty("configBucketNames")
  @Valid

  private ConfigNodePropertyArray configBucketNames;

  public OrgApacheSlingCaconfigImplConfigurationResolverImplProperties configBucketNames(ConfigNodePropertyArray configBucketNames) {
    this.configBucketNames = configBucketNames;
    return this;
  }

   /**
   * Get configBucketNames
   * @return configBucketNames
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

