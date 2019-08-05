package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties   {
  @JsonProperty("dam.cfm.component.resourceType")
  private ConfigNodePropertyString damCfmComponentResourceType = null;

  @JsonProperty("dam.cfm.component.fileReferenceProp")
  private ConfigNodePropertyString damCfmComponentFileReferenceProp = null;

  @JsonProperty("dam.cfm.component.elementsProp")
  private ConfigNodePropertyString damCfmComponentElementsProp = null;

  @JsonProperty("dam.cfm.component.variationProp")
  private ConfigNodePropertyString damCfmComponentVariationProp = null;

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
    return this;
  }

  /**
   * Get damCfmComponentResourceType
   * @return damCfmComponentResourceType
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }

  public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    return this;
  }

  /**
   * Get damCfmComponentFileReferenceProp
   * @return damCfmComponentFileReferenceProp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }

  public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    return this;
  }

  /**
   * Get damCfmComponentElementsProp
   * @return damCfmComponentElementsProp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }

  public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties damCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
    return this;
  }

  /**
   * Get damCfmComponentVariationProp
   * @return damCfmComponentVariationProp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDamCfmComponentVariationProp() {
    return damCfmComponentVariationProp;
  }

  public void setDamCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties comAdobeCqDamCfmImplComponentComponentConfigImplProperties = (ComAdobeCqDamCfmImplComponentComponentConfigImplProperties) o;
    return Objects.equals(this.damCfmComponentResourceType, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType) &&
        Objects.equals(this.damCfmComponentFileReferenceProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp) &&
        Objects.equals(this.damCfmComponentElementsProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp) &&
        Objects.equals(this.damCfmComponentVariationProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(damCfmComponentResourceType, damCfmComponentFileReferenceProp, damCfmComponentElementsProp, damCfmComponentVariationProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {\n");
    
    sb.append("    damCfmComponentResourceType: ").append(toIndentedString(damCfmComponentResourceType)).append("\n");
    sb.append("    damCfmComponentFileReferenceProp: ").append(toIndentedString(damCfmComponentFileReferenceProp)).append("\n");
    sb.append("    damCfmComponentElementsProp: ").append(toIndentedString(damCfmComponentElementsProp)).append("\n");
    sb.append("    damCfmComponentVariationProp: ").append(toIndentedString(damCfmComponentVariationProp)).append("\n");
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

