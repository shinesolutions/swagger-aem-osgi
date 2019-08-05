package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties   {
  @JsonProperty("bucketSize")
  private ConfigNodePropertyInteger bucketSize = null;

  public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties bucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
    return this;
  }

   /**
   * Get bucketSize
   * @return bucketSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getBucketSize() {
    return bucketSize;
  }

  public void setBucketSize(ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

