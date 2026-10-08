package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties;

/**
 * ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties properties;

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo properties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties getProperties() {
    return properties;
  }

  public void setProperties(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties properties) {
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
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo = (ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo) o;
    return Objects.equals(this.pid, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.pid) &&
        Objects.equals(this.title, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.title) &&
        Objects.equals(this.description, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.description) &&
        Objects.equals(this.properties, comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo {\n");
    
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

