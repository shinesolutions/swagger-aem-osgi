package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties   {
  private ConfigNodePropertyArray contentReferenceConfigResourceTypes;

  public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties() {
  }

  /**
   **/
  public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties contentReferenceConfigResourceTypes(ConfigNodePropertyArray contentReferenceConfigResourceTypes) {
    this.contentReferenceConfigResourceTypes = contentReferenceConfigResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contentReferenceConfig.resourceTypes")
  @Valid public ConfigNodePropertyArray getContentReferenceConfigResourceTypes() {
    return contentReferenceConfigResourceTypes;
  }

  @JsonProperty("contentReferenceConfig.resourceTypes")
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
