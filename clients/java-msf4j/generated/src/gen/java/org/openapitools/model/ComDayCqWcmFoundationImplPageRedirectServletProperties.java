package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComDayCqWcmFoundationImplPageRedirectServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmFoundationImplPageRedirectServletProperties   {
  @JsonProperty("excluded.resource.types")
  private ConfigNodePropertyArray excludedResourceTypes = null;

  public ComDayCqWcmFoundationImplPageRedirectServletProperties excludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
    return this;
  }

   /**
   * Get excludedResourceTypes
   * @return excludedResourceTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getExcludedResourceTypes() {
    return excludedResourceTypes;
  }

  public void setExcludedResourceTypes(ConfigNodePropertyArray excludedResourceTypes) {
    this.excludedResourceTypes = excludedResourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmFoundationImplPageRedirectServletProperties comDayCqWcmFoundationImplPageRedirectServletProperties = (ComDayCqWcmFoundationImplPageRedirectServletProperties) o;
    return Objects.equals(this.excludedResourceTypes, comDayCqWcmFoundationImplPageRedirectServletProperties.excludedResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludedResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmFoundationImplPageRedirectServletProperties {\n");
    
    sb.append("    excludedResourceTypes: ").append(toIndentedString(excludedResourceTypes)).append("\n");
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

