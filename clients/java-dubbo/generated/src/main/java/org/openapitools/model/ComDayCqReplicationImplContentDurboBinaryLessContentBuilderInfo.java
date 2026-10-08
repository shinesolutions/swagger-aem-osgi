package org.openapitools.model;

import org.openapitools.model.ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties properties;

  /**
   * 
   * @return pid
   */
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  /**
   * 
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * 
   * @return properties
   */
  public ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties getProperties() {
    return properties;
  }

  public void setProperties(ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties properties) {
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
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo = (ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo) o;
    return Objects.equals(this.pid, comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.pid) &&
        Objects.equals(this.title, comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.title) &&
        Objects.equals(this.description, comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.description) &&
        Objects.equals(this.properties, comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo {\n");
    
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
