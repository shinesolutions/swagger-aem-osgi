package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString pipelineType;
 /**
   * Get pipelineType
   * @return pipelineType
  **/
  @JsonProperty("pipeline.type")
  public ConfigNodePropertyString getPipelineType() {
    return pipelineType;
  }

  public void setPipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
  }

  public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties pipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties = (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties) o;
    return Objects.equals(this.pipelineType, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.pipelineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties {\n");
    
    sb.append("    pipelineType: ").append(toIndentedString(pipelineType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

