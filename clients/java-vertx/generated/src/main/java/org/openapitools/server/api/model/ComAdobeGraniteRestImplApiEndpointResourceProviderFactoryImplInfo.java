package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties properties = null;

  public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo () {

  }

  public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo (String pid, String title, String description, ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties properties) {
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
  public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties properties) {
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
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo = (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo) o;
    return Objects.equals(pid, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.pid) &&
        Objects.equals(title, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.title) &&
        Objects.equals(description, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.description) &&
        Objects.equals(properties, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo {\n");
    
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
