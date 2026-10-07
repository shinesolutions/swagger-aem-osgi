package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties   {
  @JsonProperty("max.recursion.levels")
  @Valid

  private ConfigNodePropertyInteger maxRecursionLevels;

  public OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties maxRecursionLevels(ConfigNodePropertyInteger maxRecursionLevels) {
    this.maxRecursionLevels = maxRecursionLevels;
    return this;
  }

   /**
   * Get maxRecursionLevels
   * @return maxRecursionLevels
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

