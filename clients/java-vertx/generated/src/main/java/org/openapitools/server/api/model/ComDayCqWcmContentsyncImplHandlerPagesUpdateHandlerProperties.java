package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties   {
  
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;

  public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties () {

  }

  public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties (ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

    
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }
  public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties = (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties) o;
    return Objects.equals(cqPagesupdatehandlerImageresourcetypes, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {\n");
    
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
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
