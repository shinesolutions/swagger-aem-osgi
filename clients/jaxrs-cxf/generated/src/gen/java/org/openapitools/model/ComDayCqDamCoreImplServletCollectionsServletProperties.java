package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
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

public class ComDayCqDamCoreImplServletCollectionsServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqDamBatchCollectionsProperties = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamBatchCollectionsLimit = null;
 /**
   * Get cqDamBatchCollectionsProperties
   * @return cqDamBatchCollectionsProperties
  **/
  @JsonProperty("cq.dam.batch.collections.properties")
  public ConfigNodePropertyArray getCqDamBatchCollectionsProperties() {
    return cqDamBatchCollectionsProperties;
  }

  public void setCqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsProperties(ConfigNodePropertyArray cqDamBatchCollectionsProperties) {
    this.cqDamBatchCollectionsProperties = cqDamBatchCollectionsProperties;
    return this;
  }

 /**
   * Get cqDamBatchCollectionsLimit
   * @return cqDamBatchCollectionsLimit
  **/
  @JsonProperty("cq.dam.batch.collections.limit")
  public ConfigNodePropertyInteger getCqDamBatchCollectionsLimit() {
    return cqDamBatchCollectionsLimit;
  }

  public void setCqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
  }

  public ComDayCqDamCoreImplServletCollectionsServletProperties cqDamBatchCollectionsLimit(ConfigNodePropertyInteger cqDamBatchCollectionsLimit) {
    this.cqDamBatchCollectionsLimit = cqDamBatchCollectionsLimit;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionsServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionsProperties: ").append(toIndentedString(cqDamBatchCollectionsProperties)).append("\n");
    sb.append("    cqDamBatchCollectionsLimit: ").append(toIndentedString(cqDamBatchCollectionsLimit)).append("\n");
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

