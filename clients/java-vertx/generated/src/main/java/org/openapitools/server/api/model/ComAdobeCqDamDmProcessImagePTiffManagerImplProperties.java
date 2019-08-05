package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties   {
  
  private ConfigNodePropertyInteger maxMemory = null;

  public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties () {

  }

  public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties (ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
  }

    
  @JsonProperty("maxMemory")
  public ConfigNodePropertyInteger getMaxMemory() {
    return maxMemory;
  }
  public void setMaxMemory(ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties comAdobeCqDamDmProcessImagePTiffManagerImplProperties = (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties) o;
    return Objects.equals(maxMemory, comAdobeCqDamDmProcessImagePTiffManagerImplProperties.maxMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxMemory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {\n");
    
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
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
