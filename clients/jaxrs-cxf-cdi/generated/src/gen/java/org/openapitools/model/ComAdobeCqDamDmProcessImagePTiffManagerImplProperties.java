package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties   {
  
  private ConfigNodePropertyInteger maxMemory = null;


  /**
   **/
  public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties maxMemory(ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("maxMemory")
  public ConfigNodePropertyInteger getMaxMemory() {
    return maxMemory;
  }
  public void setMaxMemory(ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
  }



  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

