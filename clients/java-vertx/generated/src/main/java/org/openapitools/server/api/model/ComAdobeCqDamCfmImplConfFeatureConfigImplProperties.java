package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties   {
  
  private ConfigNodePropertyArray damCfmResourceTypes = null;
  private ConfigNodePropertyArray damCfmReferenceProperties = null;

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties () {

  }

  public ComAdobeCqDamCfmImplConfFeatureConfigImplProperties (ConfigNodePropertyArray damCfmResourceTypes, ConfigNodePropertyArray damCfmReferenceProperties) {
    this.damCfmResourceTypes = damCfmResourceTypes;
    this.damCfmReferenceProperties = damCfmReferenceProperties;
  }

    
  @JsonProperty("dam.cfm.resourceTypes")
  public ConfigNodePropertyArray getDamCfmResourceTypes() {
    return damCfmResourceTypes;
  }
  public void setDamCfmResourceTypes(ConfigNodePropertyArray damCfmResourceTypes) {
    this.damCfmResourceTypes = damCfmResourceTypes;
  }

    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
