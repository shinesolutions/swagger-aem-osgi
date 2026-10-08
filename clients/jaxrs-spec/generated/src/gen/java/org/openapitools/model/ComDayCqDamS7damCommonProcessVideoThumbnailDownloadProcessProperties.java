package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties   {
  private ConfigNodePropertyString processLabel;

  public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties() {
  }

  /**
   **/
  public ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties processLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("process.label")
  @Valid public ConfigNodePropertyString getProcessLabel() {
    return processLabel;
  }

  @JsonProperty("process.label")
  public void setProcessLabel(ConfigNodePropertyString processLabel) {
    this.processLabel = processLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties = (ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties) o;
    return Objects.equals(this.processLabel, comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.processLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {\n");
    
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
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
