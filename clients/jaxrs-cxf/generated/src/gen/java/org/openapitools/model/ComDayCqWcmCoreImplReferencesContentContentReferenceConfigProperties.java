package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray contentReferenceConfigResourceTypes;
 /**
   * Get contentReferenceConfigResourceTypes
   * @return contentReferenceConfigResourceTypes
  **/
  @JsonProperty("contentReferenceConfig.resourceTypes")
  public ConfigNodePropertyArray getContentReferenceConfigResourceTypes() {
    return contentReferenceConfigResourceTypes;
  }

  public void setContentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
  }

  public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties contentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
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
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties = (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties) o;
    return Objects.equals(this.contentReferenceConfigResourceTypes, comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties.contentReferenceConfigResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentReferenceConfigResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {\n");
    
    sb.append("    contentReferenceConfigResourceTypes: ").append(toIndentedString(contentReferenceConfigResourceTypes)).append("\n");
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

