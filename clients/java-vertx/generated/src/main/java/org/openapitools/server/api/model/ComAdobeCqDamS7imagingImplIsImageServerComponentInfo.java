package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeCqDamS7imagingImplIsImageServerComponentProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties = null;

  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo () {

  }

  public ComAdobeCqDamS7imagingImplIsImageServerComponentInfo (String pid, String title, String description, ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties) {
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
  public ComAdobeCqDamS7imagingImplIsImageServerComponentProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqDamS7imagingImplIsImageServerComponentProperties properties) {
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
    ComAdobeCqDamS7imagingImplIsImageServerComponentInfo comAdobeCqDamS7imagingImplIsImageServerComponentInfo = (ComAdobeCqDamS7imagingImplIsImageServerComponentInfo) o;
    return Objects.equals(pid, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.pid) &&
        Objects.equals(title, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.title) &&
        Objects.equals(description, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.description) &&
        Objects.equals(properties, comAdobeCqDamS7imagingImplIsImageServerComponentInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
