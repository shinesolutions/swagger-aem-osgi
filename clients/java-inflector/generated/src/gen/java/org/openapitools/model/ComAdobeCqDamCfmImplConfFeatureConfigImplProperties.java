package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties   {
  @JsonProperty("dam.cfm.resourceTypes")
  private ConfigNodePropertyArray damCfmResourceTypes;

  @JsonProperty("dam.cfm.referenceProperties")
  private ConfigNodePropertyArray damCfmReferenceProperties;

  /**
   **/
  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.resourceTypes")
  public ConfigNodePropertyArray getDamCfmResourceTypes() {
    return damCfmResourceTypes;
  }
  public void setDamCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
  }

  /**
   **/
  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties damCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dam.cfm.referenceProperties")
  public ConfigNodePropertyArray getDamCfmReferenceProperties() {
    return damCfmReferenceProperties;
  }
  public void setDamCfmReferenceProperties(ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmReferenceProperties = damCfmReferenceProperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties comAdobeCqDamCfmImplConfFeatureConfigImplProperties = (ComAdobeCqDamCfmImplConfFeatureConfigImplProperties) o;
    return Objects.equals(damCfmResourceTypes, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmResourceTypes) &&
        Objects.equals(damCfmReferenceProperties, comAdobeCqDamCfmImplConfFeatureConfigImplProperties.damCfmReferenceProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmResourceTypes, damCfmReferenceProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {\n");
    
    sb.append("    damCfmResourceTypes: ").append(toIndentedString(damCfmResourceTypes)).append("\n");
    sb.append("    damCfmReferenceProperties: ").append(toIndentedString(damCfmReferenceProperties)).append("\n");
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

