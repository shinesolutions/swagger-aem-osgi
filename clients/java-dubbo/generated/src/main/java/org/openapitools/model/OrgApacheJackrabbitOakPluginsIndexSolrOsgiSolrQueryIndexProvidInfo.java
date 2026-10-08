package org.openapitools.model;

import org.openapitools.model.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("pid")
  private String pid;

  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("properties")
  private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties properties;

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
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties getProperties() {
    return properties;
  }

  public void setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties properties) {
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
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo) o;
    return Objects.equals(this.pid, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.pid) &&
        Objects.equals(this.title, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.title) &&
        Objects.equals(this.description, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.description) &&
        Objects.equals(this.properties, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo {\n");
    
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
