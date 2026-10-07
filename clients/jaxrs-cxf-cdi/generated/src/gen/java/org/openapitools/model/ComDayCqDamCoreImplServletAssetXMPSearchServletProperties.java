package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties   {
  
  private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets;

  /**
   **/
  public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties cqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.batch.indesign.maxassets")
  public ConfigNodePropertyInteger getCqDamBatchIndesignMaxassets() {
    return cqDamBatchIndesignMaxassets;
  }
  public void setCqDamBatchIndesignMaxassets(ConfigNodePropertyInteger cqDamBatchIndesignMaxassets) {
    this.cqDamBatchIndesignMaxassets = cqDamBatchIndesignMaxassets;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

