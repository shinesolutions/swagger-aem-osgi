package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties   {
  @JsonProperty("pipeline.type")
  private ConfigNodePropertyString pipelineType = null;

  public ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties pipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

   /**
   * Get pipelineType
   * @return pipelineType
  **/
  @Valid
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
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties = (ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties) o;
    return Objects.equals(pipelineType, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.pipelineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

