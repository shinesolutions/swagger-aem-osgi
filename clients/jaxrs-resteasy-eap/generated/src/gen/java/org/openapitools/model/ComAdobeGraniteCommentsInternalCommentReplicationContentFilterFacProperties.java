package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties   {
  

  private ConfigNodePropertyArray replicateCommentResourceTypes = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("replicate.comment.resourceTypes")
  public ConfigNodePropertyArray getReplicateCommentResourceTypes() {
    return replicateCommentResourceTypes;
  }
  public void setReplicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

