package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo   {
  
  private String pid;
  private String title;
  private String description;
  private OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties properties;

  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo () {

  }

  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo (String pid, String title, String description, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties properties) {
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
  public OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties getProperties() {
    return properties;
  }
  public void setProperties(OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties properties) {
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
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo = (OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo) o;
    return Objects.equals(pid, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.pid) &&
        Objects.equals(title, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.title) &&
        Objects.equals(description, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.description) &&
        Objects.equals(properties, orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, title, description, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo {\n");
    
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
