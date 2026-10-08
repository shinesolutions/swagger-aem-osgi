package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties   {
  @JsonProperty("pipeline.type")
  @Valid

  private ConfigNodePropertyString pipelineType;

  public ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties pipelineType(ConfigNodePropertyString pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

   /**
   * Get pipelineType
   * @return pipelineType
  **/
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
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties = (ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties) o;
    return Objects.equals(pipelineType, comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties.pipelineType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipelineType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties {\n");
    
    sb.append("    pipelineType: ").append(toIndentedString(pipelineType)).append("\n");
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

