package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties   {
  
  private ConfigNodePropertyInteger bucketSize = null;

  public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties () {

  }

  public ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties (ConfigNodePropertyInteger bucketSize) {
    this.bucketSize = bucketSize;
  }

    
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
