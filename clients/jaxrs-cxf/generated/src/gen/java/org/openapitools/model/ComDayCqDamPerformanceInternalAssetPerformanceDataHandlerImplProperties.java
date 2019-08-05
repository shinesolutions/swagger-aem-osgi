package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger batchCommitSize = null;
 /**
   * Get batchCommitSize
   * @return batchCommitSize
  **/
  @JsonProperty("batch.commit.size")
  public ConfigNodePropertyInteger getBatchCommitSize() {
    return batchCommitSize;
  }

  public void setBatchCommitSize(ConfigNodePropertyInteger batchCommitSize) {
    this.batchCommitSize = batchCommitSize;
  }

  public ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties batchCommitSize(ConfigNodePropertyInteger batchCommitSize) {
    this.batchCommitSize = batchCommitSize;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {\n");
    
    sb.append("    batchCommitSize: ").append(toIndentedString(batchCommitSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

