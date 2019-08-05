package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties = null;

  /**
   **/
  public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
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
  public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo title(String title) {
    this.title = title;
    return this;
  }

  
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
  public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo description(String description) {
    this.description = description;
    return this;
  }

  
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
  public ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo properties(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties properties) {
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
    ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo comAdobeCqDamS7imagingImplPsPlatformServerServletInfo = (ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo) o;
    return Objects.equals(pid, comAdobeCqDamS7imagingImplPsPlatformServerServletInfo.pid) &&
        Objects.equals(title, comAdobeCqDamS7imagingImplPsPlatformServerServletInfo.title) &&
        Objects.equals(description, comAdobeCqDamS7imagingImplPsPlatformServerServletInfo.description) &&
        Objects.equals(properties, comAdobeCqDamS7imagingImplPsPlatformServerServletInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo {\n");
    
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

