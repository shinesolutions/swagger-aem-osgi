package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo   {
  private String pid;
  private String title;
  private String description;
  private ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties properties;

  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo() {
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pid")
  public String getPid() {
    return pid;
  }

  @JsonProperty("pid")
  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo properties(ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  @Valid public ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties getProperties() {
    return properties;
  }

  @JsonProperty("properties")
  public void setProperties(ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties properties) {
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
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo = (ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo) o;
    return Objects.equals(this.pid, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo.pid) &&
        Objects.equals(this.title, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo.title) &&
        Objects.equals(this.description, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo.description) &&
        Objects.equals(this.properties, comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo {\n");
    
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
