package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo   {
  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties properties;

  @JsonProperty("additionalProperties")
  private String additionalProperties;

  @JsonProperty("bundle_location")
  private String bundleLocation;

  @JsonProperty("service_location")
  private String serviceLocation;

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo pid(String pid) {
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

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo title(String title) {
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

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo description(String description) {
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

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo properties(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @ApiModelProperty(value = "")
  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties properties) {
    this.properties = properties;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo additionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * Get additionalProperties
   * @return additionalProperties
   */
  @ApiModelProperty(value = "")
  public String getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(String additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo bundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
    return this;
  }

  /**
   * Get bundleLocation
   * @return bundleLocation
   */
  @ApiModelProperty(value = "")
  public String getBundleLocation() {
    return bundleLocation;
  }

  public void setBundleLocation(String bundleLocation) {
    this.bundleLocation = bundleLocation;
  }

  public OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo serviceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
    return this;
  }

  /**
   * Get serviceLocation
   * @return serviceLocation
   */
  @ApiModelProperty(value = "")
  public String getServiceLocation() {
    return serviceLocation;
  }

  public void setServiceLocation(String serviceLocation) {
    this.serviceLocation = serviceLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo = (OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo) o;
    return Objects.equals(this.pid, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.pid) &&
        Objects.equals(this.title, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.title) &&
        Objects.equals(this.description, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.description) &&
        Objects.equals(this.properties, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.properties) &&
        Objects.equals(this.additionalProperties, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.additionalProperties) &&
        Objects.equals(this.bundleLocation, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.bundleLocation) &&
        Objects.equals(this.serviceLocation, orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.serviceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties, additionalProperties, bundleLocation, serviceLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo {\n");
    
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    bundleLocation: ").append(toIndentedString(bundleLocation)).append("\n");
    sb.append("    serviceLocation: ").append(toIndentedString(serviceLocation)).append("\n");
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

