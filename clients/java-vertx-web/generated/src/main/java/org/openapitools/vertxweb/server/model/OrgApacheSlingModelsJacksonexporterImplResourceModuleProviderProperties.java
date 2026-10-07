package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties   {
  
  private ConfigNodePropertyInteger maxRecursionLevels;

  public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties () {

  }

  public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties (ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
  }

    
  @JsonProperty("max.recursion.levels")
  public ConfigNodePropertyInteger getMaxRecursionLevels() {
    return maxRecursionLevels;
  }
  public void setMaxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
