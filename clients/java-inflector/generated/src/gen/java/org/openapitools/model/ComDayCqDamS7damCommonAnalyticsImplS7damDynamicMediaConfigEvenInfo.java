package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties;

  /**
   **/
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo pid(String pid) {
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
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo title(String title) {
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
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo description(String description) {
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
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo properties(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties) {
    this.properties = properties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("properties")
  public ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties getProperties() {
    return properties;
  }
  public void setProperties(ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties properties) {
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
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo = (ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo) o;
    return Objects.equals(pid, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.pid) &&
        Objects.equals(title, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.title) &&
        Objects.equals(description, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.description) &&
        Objects.equals(properties, comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo {\n");
    
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

