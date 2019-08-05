package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties   {
  
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;
  private ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes = null;
  private ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes = null;
  private ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes = null;
  private ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths = null;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties () {

  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties (ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes, ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes, ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes, ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes, ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }

    
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }
  public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

    
  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }
  public void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
  }

    
  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }
  public void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
  }

    
  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }
  public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

    
  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
  public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }
  public void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties) o;
    return Objects.equals(cqPagesupdatehandlerImageresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerProductresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerProductresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerVideoresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerVideoresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerDynamicsequenceresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerDynamicsequenceresourcetypes) &&
        Objects.equals(cqPagesupdatehandlerPreviewmodepaths, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes, cqPagesupdatehandlerProductresourcetypes, cqPagesupdatehandlerVideoresourcetypes, cqPagesupdatehandlerDynamicsequenceresourcetypes, cqPagesupdatehandlerPreviewmodepaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
    
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerProductresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerProductresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerVideoresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerVideoresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerDynamicsequenceresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerDynamicsequenceresourcetypes)).append("\n");
    sb.append("    cqPagesupdatehandlerPreviewmodepaths: ").append(toIndentedString(cqPagesupdatehandlerPreviewmodepaths)).append("\n");
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
