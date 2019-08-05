package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties properties = null;

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo () {

  }

  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo (String pid, String title, String description, ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties properties) {
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
  public ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties properties) {
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
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo = (ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo) o;
    return Objects.equals(pid, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.pid) &&
        Objects.equals(title, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.title) &&
        Objects.equals(description, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.description) &&
        Objects.equals(properties, comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo {\n");
    
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
