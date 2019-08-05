package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties   {
  
  private ConfigNodePropertyArray replicateCommentResourceTypes = null;

  public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties () {

  }

  public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties (ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
  }

    
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
