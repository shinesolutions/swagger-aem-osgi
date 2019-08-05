package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComDayCqDamCoreProcessMetadataProcessorProcessProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreProcessMetadataProcessorProcessProperties   {
  @JsonProperty("process.label")
  private ConfigNodePropertyString processLabel = null;

  @JsonProperty("cq.dam.enable.sha1")
  private ConfigNodePropertyBoolean cqDamEnableSha1 = null;

  @JsonProperty("cq.dam.metadata.xssprotected.properties")
  private ConfigNodePropertyArray cqDamMetadataXssprotectedProperties = null;

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

   /**
   * Get processLabel
   * @return processLabel
  **/
  @Valid
  public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
    return this;
  }

   /**
   * Get cqDamEnableSha1
   * @return cqDamEnableSha1
  **/
  @Valid
  public ConfigNodePropertyBoolean getCqDamEnableSha1() {
    return cqDamEnableSha1;
  }

  public void setCqDamEnableSha1(ConfigNodePropertyBoolean cqDamEnableSha1) {
    this.cqDamEnableSha1 = cqDamEnableSha1;
  }

  public ComDayCqDamCoreProcessMetadataProcessorProcessProperties cqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
    return this;
  }

   /**
   * Get cqDamMetadataXssprotectedProperties
   * @return cqDamMetadataXssprotectedProperties
  **/
  @Valid
  public ConfigNodePropertyArray getCqDamMetadataXssprotectedProperties() {
    return cqDamMetadataXssprotectedProperties;
  }

  public void setCqDamMetadataXssprotectedProperties(ConfigNodePropertyArray cqDamMetadataXssprotectedProperties) {
    this.cqDamMetadataXssprotectedProperties = cqDamMetadataXssprotectedProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties comDayCqDamCoreProcessMetadataProcessorProcessProperties = (ComDayCqDamCoreProcessMetadataProcessorProcessProperties) o;
    return Objects.equals(processLabel, comDayCqDamCoreProcessMetadataProcessorProcessProperties.processLabel) &&
        Objects.equals(cqDamEnableSha1, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamEnableSha1) &&
        Objects.equals(cqDamMetadataXssprotectedProperties, comDayCqDamCoreProcessMetadataProcessorProcessProperties.cqDamMetadataXssprotectedProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel, cqDamEnableSha1, cqDamMetadataXssprotectedProperties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreProcessMetadataProcessorProcessProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    cqDamEnableSha1: ").append(toIndentedString(cqDamEnableSha1)).append("\n");
    sb.append("    cqDamMetadataXssprotectedProperties: ").append(toIndentedString(cqDamMetadataXssprotectedProperties)).append("\n");
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

