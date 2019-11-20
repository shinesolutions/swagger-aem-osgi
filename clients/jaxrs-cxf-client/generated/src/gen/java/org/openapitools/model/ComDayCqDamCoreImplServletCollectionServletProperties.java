package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplServletCollectionServletProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray cqDamBatchCollectionProperties = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections = null;
 /**
   * Get cqDamBatchCollectionProperties
   * @return cqDamBatchCollectionProperties
  **/
  @JsonProperty("cq.dam.batch.collection.properties")
  public ConfigNodePropertyArray getCqDamBatchCollectionProperties() {
    return cqDamBatchCollectionProperties;
  }

  public void setCqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
  }

  public ComDayCqDamCoreImplServletCollectionServletProperties cqDamBatchCollectionProperties(ConfigNodePropertyArray cqDamBatchCollectionProperties) {
    this.cqDamBatchCollectionProperties = cqDamBatchCollectionProperties;
    return this;
  }

 /**
   * Get cqDamBatchCollectionMaxcollections
   * @return cqDamBatchCollectionMaxcollections
  **/
  @JsonProperty("cq.dam.batch.collection.maxcollections")
  public ConfigNodePropertyInteger getCqDamBatchCollectionMaxcollections() {
    return cqDamBatchCollectionMaxcollections;
  }

  public void setCqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
  }

  public ComDayCqDamCoreImplServletCollectionServletProperties cqDamBatchCollectionMaxcollections(ConfigNodePropertyInteger cqDamBatchCollectionMaxcollections) {
    this.cqDamBatchCollectionMaxcollections = cqDamBatchCollectionMaxcollections;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCollectionServletProperties {\n");
    
    sb.append("    cqDamBatchCollectionProperties: ").append(toIndentedString(cqDamBatchCollectionProperties)).append("\n");
    sb.append("    cqDamBatchCollectionMaxcollections: ").append(toIndentedString(cqDamBatchCollectionMaxcollections)).append("\n");
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
