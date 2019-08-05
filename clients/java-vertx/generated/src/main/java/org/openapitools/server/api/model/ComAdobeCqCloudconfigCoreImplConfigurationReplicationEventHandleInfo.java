package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo   {
  
  private String pid = null;
  private String title = null;
  private String description = null;
  private ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties properties = null;

  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo () {

  }

  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo (String pid, String title, String description, ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties properties) {
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
  public ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties getProperties() {
    return properties;
  }
  public void setProperties(ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties properties) {
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
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo = (ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo) o;
    return Objects.equals(pid, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.pid) &&
        Objects.equals(title, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.title) &&
        Objects.equals(description, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.description) &&
        Objects.equals(properties, comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo {\n");
    
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
