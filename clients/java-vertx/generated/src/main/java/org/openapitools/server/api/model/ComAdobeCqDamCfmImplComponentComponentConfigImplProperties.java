package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties   {
  
  private ConfigNodePropertyString damCfmComponentResourceType = null;
  private ConfigNodePropertyString damCfmComponentFileReferenceProp = null;
  private ConfigNodePropertyString damCfmComponentElementsProp = null;
  private ConfigNodePropertyString damCfmComponentVariationProp = null;

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties () {

  }

  public ComAdobeCqDamCfmImplComponentComponentConfigImplProperties (ConfigNodePropertyString damCfmComponentResourceType, ConfigNodePropertyString damCfmComponentFileReferenceProp, ConfigNodePropertyString damCfmComponentElementsProp, ConfigNodePropertyString damCfmComponentVariationProp) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
    this.damCfmComponentVariationProp = damCfmComponentVariationProp;
  }

    
  @JsonProperty("dam.cfm.component.resourceType")
  public ConfigNodePropertyString getDamCfmComponentResourceType() {
    return damCfmComponentResourceType;
  }
  public void setDamCfmComponentResourceType(ConfigNodePropertyString damCfmComponentResourceType) {
    this.damCfmComponentResourceType = damCfmComponentResourceType;
  }

    
  @JsonProperty("dam.cfm.component.fileReferenceProp")
  public ConfigNodePropertyString getDamCfmComponentFileReferenceProp() {
    return damCfmComponentFileReferenceProp;
  }
  public void setDamCfmComponentFileReferenceProp(ConfigNodePropertyString damCfmComponentFileReferenceProp) {
    this.damCfmComponentFileReferenceProp = damCfmComponentFileReferenceProp;
  }

    
  @JsonProperty("dam.cfm.component.elementsProp")
  public ConfigNodePropertyString getDamCfmComponentElementsProp() {
    return damCfmComponentElementsProp;
  }
  public void setDamCfmComponentElementsProp(ConfigNodePropertyString damCfmComponentElementsProp) {
    this.damCfmComponentElementsProp = damCfmComponentElementsProp;
  }

    
  @JsonProperty("dam.cfm.component.variationProp")
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
    return Objects.equals(damCfmComponentResourceType, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentResourceType) &&
        Objects.equals(damCfmComponentFileReferenceProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentFileReferenceProp) &&
        Objects.equals(damCfmComponentElementsProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentElementsProp) &&
        Objects.equals(damCfmComponentVariationProp, comAdobeCqDamCfmImplComponentComponentConfigImplProperties.damCfmComponentVariationProp);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
