package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray alloweddataFileLocations;
 /**
   * Get alloweddataFileLocations
   * @return alloweddataFileLocations
  **/
  @JsonProperty("alloweddataFileLocations")
  public ConfigNodePropertyArray getAlloweddataFileLocations() {
    return alloweddataFileLocations;
  }

  public void setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
  }

  public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties alloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
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
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties comAdobeFormsCommonServiceImplDefaultDataProviderProperties = (ComAdobeFormsCommonServiceImplDefaultDataProviderProperties) o;
    return Objects.equals(this.alloweddataFileLocations, comAdobeFormsCommonServiceImplDefaultDataProviderProperties.alloweddataFileLocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alloweddataFileLocations);
  }

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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

