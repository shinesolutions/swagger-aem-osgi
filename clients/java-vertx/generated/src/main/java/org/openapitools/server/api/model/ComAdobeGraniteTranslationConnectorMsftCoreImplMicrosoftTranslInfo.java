package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties properties = null;

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo () {

  }

  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo (String pid, String title, String description, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties properties) {
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
  public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties properties) {
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
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo = (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo) o;
    return Objects.equals(pid, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.pid) &&
        Objects.equals(title, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.title) &&
        Objects.equals(description, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.description) &&
        Objects.equals(properties, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo {\n");
    
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
