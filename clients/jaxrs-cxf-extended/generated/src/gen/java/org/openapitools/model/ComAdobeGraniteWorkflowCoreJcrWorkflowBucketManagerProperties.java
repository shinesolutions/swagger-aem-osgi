package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger bucketSize;
 /**
  * Get bucketSize
  * @return bucketSize
  */
  @JsonProperty("bucketSize")
  public ConfigNodePropertyInteger getBucketSize() {
    return bucketSize;
  }

  /**
   * Sets the <code>bucketSize</code> property.
   */
 public void setBucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
  }

  /**
   * Sets the <code>bucketSize</code> property.
   */
  public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties bucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
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
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties = (ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties) o;
    return Objects.equals(this.bucketSize, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.bucketSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketSize);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

