package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties   {
  @JsonProperty("max.recursion.levels")
  private ConfigNodePropertyInteger maxRecursionLevels = null;

  /**
   **/
  public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties maxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("max.recursion.levels")
  public ConfigNodePropertyInteger getMaxRecursionLevels() {
    return maxRecursionLevels;
  }
  public void setMaxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties = (OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties) o;
    return Objects.equals(maxRecursionLevels, orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties.maxRecursionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxRecursionLevels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {\n");
    
    sb.append("    maxRecursionLevels: ").append(toIndentedString(maxRecursionLevels)).append("\n");
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

