package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties = null;

  public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo () {

  }

  public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo (String pid, String title, String description, ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties) {
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
  public ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties properties) {
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
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo = (ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo) o;
    return Objects.equals(pid, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.pid) &&
        Objects.equals(title, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.title) &&
        Objects.equals(description, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.description) &&
        Objects.equals(properties, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo {\n");
    
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
