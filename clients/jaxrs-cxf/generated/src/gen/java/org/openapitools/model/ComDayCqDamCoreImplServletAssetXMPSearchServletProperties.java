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

public class ComDayCqDamCoreImplServletAssetXMPSearchServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamBatchIndesignMaxassets = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

