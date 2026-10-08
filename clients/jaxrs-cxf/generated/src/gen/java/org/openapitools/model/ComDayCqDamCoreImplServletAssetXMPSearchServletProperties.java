package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets;
 /**
   * Get cqDamBatchIndesignMaxassets
   * @return cqDamBatchIndesignMaxassets
  **/
  @JsonProperty("cq.dam.batch.indesign.maxassets")
  public ConfigNodePropertyInteger getCqDamBatchIndesignMaxassets() {
    return cqDamBatchIndesignMaxassets;
  }

  public void setCqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
  }

  public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties cqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
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
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties comDayCqDamCoreImplServletAssetXMPSearchServletProperties = (ComDayCqDamCoreImplServletAssetXMPSearchServletProperties) o;
    return Objects.equals(this.cqDamBatchIndesignMaxassets, comDayCqDamCoreImplServletAssetXMPSearchServletProperties.cqDamBatchIndesignMaxassets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamBatchIndesignMaxassets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties {\n");
    
    sb.append("    cqDamBatchIndesignMaxassets: ").append(toIndentedString(cqDamBatchIndesignMaxassets)).append("\n");
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

