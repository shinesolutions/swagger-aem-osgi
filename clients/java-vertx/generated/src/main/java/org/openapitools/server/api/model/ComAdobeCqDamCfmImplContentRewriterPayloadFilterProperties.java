package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties   {
  
  private ConfigNodePropertyString pipelineType = null;

  public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties () {

  }

  public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties (ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
  }

    
  @JsonProperty("pipeline.type")
  public ConfigNodePropertyString getPipelineType() {
    return pipelineType;
  }
  public void setPipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
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
    return Objects.equals(pipelineType, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.pipelineType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}