package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties properties = null;

  /**
   **/
  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo pid(String pid) {
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
  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo title(String title) {
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
  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo description(String description) {
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
  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo properties(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties properties) {
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
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo = (ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo) o;
    return Objects.equals(pid, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.pid) &&
        Objects.equals(title, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.title) &&
        Objects.equals(description, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.description) &&
        Objects.equals(properties, comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo {\n");
    
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

