package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties   {
  

  private ConfigNodePropertyInteger bucketSize = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("bucketSize")
  public ConfigNodePropertyInteger getBucketSize() {
    return bucketSize;
  }
  public void setBucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
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
    return Objects.equals(bucketSize, comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties.bucketSize);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

