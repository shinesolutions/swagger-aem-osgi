package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.OrgApacheFelixSystemreadyImplComponentsCheckProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheFelixSystemreadyImplComponentsCheckInfo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheFelixSystemreadyImplComponentsCheckInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private OrgApacheFelixSystemreadyImplComponentsCheckProperties properties;

  public OrgApacheFelixSystemreadyImplComponentsCheckInfo pid(String pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @ApiModelProperty(value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public OrgApacheFelixSystemreadyImplComponentsCheckInfo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrgApacheFelixSystemreadyImplComponentsCheckInfo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrgApacheFelixSystemreadyImplComponentsCheckInfo properties(OrgApacheFelixSystemreadyImplComponentsCheckProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @ApiModelProperty(value = "")
  public OrgApacheFelixSystemreadyImplComponentsCheckProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheFelixSystemreadyImplComponentsCheckProperties properties) {
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
    OrgApacheFelixSystemreadyImplComponentsCheckInfo orgApacheFelixSystemreadyImplComponentsCheckInfo = (OrgApacheFelixSystemreadyImplComponentsCheckInfo) o;
    return Objects.equals(this.pid, orgApacheFelixSystemreadyImplComponentsCheckInfo.pid) &&
        Objects.equals(this.title, orgApacheFelixSystemreadyImplComponentsCheckInfo.title) &&
        Objects.equals(this.description, orgApacheFelixSystemreadyImplComponentsCheckInfo.description) &&
        Objects.equals(this.properties, orgApacheFelixSystemreadyImplComponentsCheckInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplComponentsCheckInfo {\n");
    
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

