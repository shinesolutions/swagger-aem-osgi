package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties   {
  private ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes;
  private ConfigNodePropertyArray cqPagesupdatehandlerProductresourcetypes;
  private ConfigNodePropertyArray cqPagesupdatehandlerVideoresourcetypes;
  private ConfigNodePropertyArray cqPagesupdatehandlerDynamicsequenceresourcetypes;
  private ConfigNodePropertyArray cqPagesupdatehandlerPreviewmodepaths;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties() {
  }

  /**
   **/
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  @Valid public ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
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
  @Valid public ConfigNodePropertyArray getCqPagesupdatehandlerProductresourcetypes() {
    return cqPagesupdatehandlerProductresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.productresourcetypes")
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
  @Valid public ConfigNodePropertyArray getCqPagesupdatehandlerVideoresourcetypes() {
    return cqPagesupdatehandlerVideoresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
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
  @Valid public ConfigNodePropertyArray getCqPagesupdatehandlerDynamicsequenceresourcetypes() {
    return cqPagesupdatehandlerDynamicsequenceresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
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
  @Valid public ConfigNodePropertyArray getCqPagesupdatehandlerPreviewmodepaths() {
    return cqPagesupdatehandlerPreviewmodepaths;
  }

  @JsonProperty("cq.pagesupdatehandler.previewmodepaths")
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
    return Objects.equals(this.cqPagesupdatehandlerImageresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerProductresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerProductresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerVideoresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerVideoresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerDynamicsequenceresourcetypes, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerDynamicsequenceresourcetypes) &&
        Objects.equals(this.cqPagesupdatehandlerPreviewmodepaths, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.cqPagesupdatehandlerPreviewmodepaths);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
