package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties properties;
 /**
  * Get pid
  * @return pid
  */
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
 public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * Sets the <code>pid</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo properties(ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties properties) {
    this.properties = properties;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo = (ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo) o;
    return Objects.equals(this.pid, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.pid) &&
        Objects.equals(this.title, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.title) &&
        Objects.equals(this.description, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.description) &&
        Objects.equals(this.properties, comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo {\n");
    
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

