package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo   {
  
  private String pid;
  private String title;
  private String description;
  private ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties properties;

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo () {

  }

  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo (String pid, String title, String description, ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties properties) {
    this.pid = pid;
    this.title = title;
    this.description = description;
    this.properties = properties;
  }

    
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }
  public void setPid(String pid) {
    this.pid = pid;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("properties")
  public ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties properties) {
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
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo = (ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo) o;
    return Objects.equals(pid, comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.pid) &&
        Objects.equals(title, comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.title) &&
        Objects.equals(description, comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.description) &&
        Objects.equals(properties, comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo {\n");
    
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
