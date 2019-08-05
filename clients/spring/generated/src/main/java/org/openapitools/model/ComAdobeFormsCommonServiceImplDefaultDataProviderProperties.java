package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties   {
  @JsonProperty("alloweddataFileLocations")
  private ConfigNodePropertyArray alloweddataFileLocations = null;

  public ComAdobeFormsCommonServiceImplDefaultDataProviderProperties alloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
    return this;
  }

  /**
   * Get alloweddataFileLocations
   * @return alloweddataFileLocations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyArray getAlloweddataFileLocations() {
    return alloweddataFileLocations;
  }

  public void setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations) {
    this.alloweddataFileLocations = alloweddataFileLocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

