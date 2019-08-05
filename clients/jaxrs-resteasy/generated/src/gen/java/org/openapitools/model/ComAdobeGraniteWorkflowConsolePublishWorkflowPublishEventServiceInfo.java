package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties properties = null;

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
  public ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo = (ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo) o;
    return Objects.equals(pid, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.pid) &&
        Objects.equals(title, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.title) &&
        Objects.equals(description, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.description) &&
        Objects.equals(properties, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

