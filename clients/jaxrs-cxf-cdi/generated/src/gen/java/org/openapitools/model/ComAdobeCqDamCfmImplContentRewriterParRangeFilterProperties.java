package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties   {
  
  private ConfigNodePropertyString pipelineType = null;


  /**
   **/
  public ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties pipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pipeline.type")
  public ConfigNodePropertyString getPipelineType() {
    return pipelineType;
  }
  public void setPipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties comAdobeCqDamCfmImplContentRewriterParRangeFilterProperties = (ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties) o;
    return Objects.equals(pipelineType, comAdobeCqDamCfmImplContentRewriterParRangeFilterProperties.pipelineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {\n");
    
    sb.append("    pipelineType: ").append(toIndentedString(pipelineType)).append("\n");
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

