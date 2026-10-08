package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo  {
  
  @ApiModelProperty(value = "")
  private String pid;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties properties;
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
  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo pid(String pid) {
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
  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo title(String title) {
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
  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get properties
  * @return properties
  */
  @JsonProperty("properties")
  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties getProperties() {
    return properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
 public void setProperties(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties properties) {
    this.properties = properties;
  }

  /**
   * Sets the <code>properties</code> property.
   */
  public OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo properties(OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties properties) {
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
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo = (OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo) o;
    return Objects.equals(this.pid, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.title) &&
        Objects.equals(this.description, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo {\n");
    
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

