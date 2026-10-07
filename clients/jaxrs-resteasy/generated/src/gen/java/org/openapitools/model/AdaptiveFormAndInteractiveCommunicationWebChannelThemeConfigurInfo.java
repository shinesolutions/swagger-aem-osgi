package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo   {
  
  private String pid;
  private String title;
  private String description;
  private AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties properties;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid
  public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties getProperties() {
    return properties;
  }
  public void setProperties(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo = (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo) o;
    return Objects.equals(this.pid, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.pid) &&
        Objects.equals(this.title, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.title) &&
        Objects.equals(this.description, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.description) &&
        Objects.equals(this.properties, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

