package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties;

  /**
   **/
  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo pid(String pid) {
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
  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo title(String title) {
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
  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo description(String description) {
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
  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo properties(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties properties) {
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
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo = (ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo) o;
    return Objects.equals(pid, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.pid) &&
        Objects.equals(title, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.title) &&
        Objects.equals(description, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.description) &&
        Objects.equals(properties, comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo {\n");
    
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

