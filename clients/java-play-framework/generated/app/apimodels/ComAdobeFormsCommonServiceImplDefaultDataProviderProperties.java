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
 * ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties   {
  @JsonProperty("alloweddataFileLocations")
  @Valid

  private ConfigNodePropertyArray alloweddataFileLocations;

  public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties alloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
    return this;
  }

   /**
   * Get alloweddataFileLocations
   * @return alloweddataFileLocations
  **/
  public ConfigNodePropertyArray getAlloweddataFileLocations() {
    return alloweddataFileLocations;
  }

  public void setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties comAdobeFormsCommonServiceImplDefaultDataProviderProperties = (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties) o;
    return Objects.equals(alloweddataFileLocations, comAdobeFormsCommonServiceImplDefaultDataProviderProperties.alloweddataFileLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloweddataFileLocations);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {\n");
    
    sb.append("    alloweddataFileLocations: ").append(toIndentedString(alloweddataFileLocations)).append("\n");
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

