package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;

/**
 * ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties   {
  @JsonProperty("contentReferenceConfig.resourceTypes")
  private ConfigNodePropertyArray contentReferenceConfigResourceTypes;

  public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties contentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
    return this;
  }

   /**
   * Get contentReferenceConfigResourceTypes
   * @return contentReferenceConfigResourceTypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getContentReferenceConfigResourceTypes() {
    return contentReferenceConfigResourceTypes;
  }

  public void setContentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

