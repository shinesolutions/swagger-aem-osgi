package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("dam.cfm.component.resourceType")
  private ConfigNodePropertyString damCfmComponentResourceType;

  @JsonProperty("dam.cfm.component.fileReferenceProp")
  private ConfigNodePropertyString damCfmComponentFileReferenceProp;

  @JsonProperty("dam.cfm.component.elementsProp")
  private ConfigNodePropertyString damCfmComponentElementsProp;

  @JsonProperty("dam.cfm.component.variationProp")
  private ConfigNodePropertyString damCfmComponentVariationProp;

  /**
   * 
   * @return damCfmComponentResourceType
   */
  public ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }

  public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }

  /**
   * 
   * @return damCfmComponentFileReferenceProp
   */
  public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }

  public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }

  /**
   * 
   * @return damCfmComponentElementsProp
   */
  public ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }

  public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }

  /**
   * 
   * @return damCfmComponentVariationProp
   */
  public ConfigNodePropertyString getDamCfmComponentVariationProp() {
    return damCfmComponentVariationProp;
  }

  public void setDamCfmComponentVariationProp(ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
