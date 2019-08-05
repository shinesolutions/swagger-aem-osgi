package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties   {
  
  private @Valid ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes = null;
  private @Valid ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes = null;
  private @Valid ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes = null;
  private @Valid ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes = null;
  private @Valid ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths = null;

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }
  public void setCqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }
  public void setCqPagesupdatehandlerProductresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes) {
    this.cqPagesupdatehandlerProductresourcetypes = cqPagesupdatehandlerProductresourcetypes;
  }

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }
  public void setCqPagesupdatehandlerVideoresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes) {
    this.cqPagesupdatehandlerVideoresourcetypes = cqPagesupdatehandlerVideoresourcetypes;
  }

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
  public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }
  public void setCqPagesupdatehandlerDynamicsequenceresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes) {
    this.cqPagesupdatehandlerDynamicsequenceresourcetypes = cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
  public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }
  public void setCqPagesupdatehandlerPreviewmodepaths(ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths) {
    this.cqPagesupdatehandlerPreviewmodepaths = cqPagesupdatehandlerPreviewmodepaths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

