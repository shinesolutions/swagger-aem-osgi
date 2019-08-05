package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties properties = null;

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo pid(String pid) {
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

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo title(String title) {
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

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo description(String description) {
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

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo properties(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties properties) {
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
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo = (ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo) o;
    return Objects.equals(this.pid, comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.pid) &&
        Objects.equals(this.title, comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.title) &&
        Objects.equals(this.description, comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.description) &&
        Objects.equals(this.properties, comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo {\n");
    
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

