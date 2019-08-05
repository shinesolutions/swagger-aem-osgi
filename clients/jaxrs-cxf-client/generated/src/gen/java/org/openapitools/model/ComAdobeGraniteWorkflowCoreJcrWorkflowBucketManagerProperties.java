package org.openapitools.model;

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

public class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger bucketSize = null;
 /**
   * Get bucketSize
   * @return bucketSize
  **/
  @JsonProperty("bucketSize")
  public ConfigNodePropertyInteger getBucketSize() {
    return bucketSize;
  }

  public void setBucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
  }

  public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties bucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties {\n");
    
    sb.append("    bucketSize: ").append(toIndentedString(bucketSize)).append("\n");
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

