package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties   {
  
  private ConfigNodePropertyArray replicateCommentResourceTypes = null;


  /**
   **/
  public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties replicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("replicate.comment.resourceTypes")
  public ConfigNodePropertyArray getReplicateCommentResourceTypes() {
    return replicateCommentResourceTypes;
  }
  public void setReplicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties) o;
    return Objects.equals(replicateCommentResourceTypes, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.replicateCommentResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicateCommentResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {\n");
    
    sb.append("    replicateCommentResourceTypes: ").append(toIndentedString(replicateCommentResourceTypes)).append("\n");
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

