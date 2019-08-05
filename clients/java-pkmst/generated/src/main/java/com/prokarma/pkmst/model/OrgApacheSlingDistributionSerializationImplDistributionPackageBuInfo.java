package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo   {
  @JsonProperty("pid")
  private String pid = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("properties")
  private OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties properties = null;

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo pid(String pid) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo title(String title) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo description(String description) {
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

  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo properties(OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties properties) {
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
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo = (OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo) o;
    return Objects.equals(this.pid, orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.pid) &&
        Objects.equals(this.title, orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.title) &&
        Objects.equals(this.description, orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.description) &&
        Objects.equals(this.properties, orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo {\n");
    
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

