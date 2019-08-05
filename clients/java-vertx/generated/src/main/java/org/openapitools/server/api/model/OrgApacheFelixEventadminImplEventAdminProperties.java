package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyFloat;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheFelixEventadminImplEventAdminProperties   {
  
  private ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize = null;
  private ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio = null;
  private ConfigNodePropertyInteger orgApacheFelixEventadminTimeout = null;
  private ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic = null;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout = null;
  private ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic = null;

  public OrgApacheFelixEventadminImplEventAdminProperties () {

  }

  public OrgApacheFelixEventadminImplEventAdminProperties (ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize, ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio, ConfigNodePropertyInteger orgApacheFelixEventadminTimeout, ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic, ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout, ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminThreadPoolSize() {
    return orgApacheFelixEventadminThreadPoolSize;
  }
  public void setOrgApacheFelixEventadminThreadPoolSize(ConfigNodePropertyInteger orgApacheFelixEventadminThreadPoolSize) {
    this.orgApacheFelixEventadminThreadPoolSize = orgApacheFelixEventadminThreadPoolSize;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
  public ConfigNodePropertyFloat getOrgApacheFelixEventadminAsyncToSyncThreadRatio() {
    return orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }
  public void setOrgApacheFelixEventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgApacheFelixEventadminAsyncToSyncThreadRatio) {
    this.orgApacheFelixEventadminAsyncToSyncThreadRatio = orgApacheFelixEventadminAsyncToSyncThreadRatio;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.Timeout")
  public ConfigNodePropertyInteger getOrgApacheFelixEventadminTimeout() {
    return orgApacheFelixEventadminTimeout;
  }
  public void setOrgApacheFelixEventadminTimeout(ConfigNodePropertyInteger orgApacheFelixEventadminTimeout) {
    this.orgApacheFelixEventadminTimeout = orgApacheFelixEventadminTimeout;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.RequireTopic")
  public ConfigNodePropertyBoolean getOrgApacheFelixEventadminRequireTopic() {
    return orgApacheFelixEventadminRequireTopic;
  }
  public void setOrgApacheFelixEventadminRequireTopic(ConfigNodePropertyBoolean orgApacheFelixEventadminRequireTopic) {
    this.orgApacheFelixEventadminRequireTopic = orgApacheFelixEventadminRequireTopic;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTimeout() {
    return orgApacheFelixEventadminIgnoreTimeout;
  }
  public void setOrgApacheFelixEventadminIgnoreTimeout(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTimeout) {
    this.orgApacheFelixEventadminIgnoreTimeout = orgApacheFelixEventadminIgnoreTimeout;
  }

    
  @JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
  public ConfigNodePropertyArray getOrgApacheFelixEventadminIgnoreTopic() {
    return orgApacheFelixEventadminIgnoreTopic;
  }
  public void setOrgApacheFelixEventadminIgnoreTopic(ConfigNodePropertyArray orgApacheFelixEventadminIgnoreTopic) {
    this.orgApacheFelixEventadminIgnoreTopic = orgApacheFelixEventadminIgnoreTopic;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixEventadminImplEventAdminProperties orgApacheFelixEventadminImplEventAdminProperties = (OrgApacheFelixEventadminImplEventAdminProperties) o;
    return Objects.equals(orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminThreadPoolSize) &&
        Objects.equals(orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminAsyncToSyncThreadRatio) &&
        Objects.equals(orgApacheFelixEventadminTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminTimeout) &&
        Objects.equals(orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminRequireTopic) &&
        Objects.equals(orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTimeout) &&
        Objects.equals(orgApacheFelixEventadminIgnoreTopic, orgApacheFelixEventadminImplEventAdminProperties.orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheFelixEventadminThreadPoolSize, orgApacheFelixEventadminAsyncToSyncThreadRatio, orgApacheFelixEventadminTimeout, orgApacheFelixEventadminRequireTopic, orgApacheFelixEventadminIgnoreTimeout, orgApacheFelixEventadminIgnoreTopic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixEventadminImplEventAdminProperties {\n");
    
    sb.append("    orgApacheFelixEventadminThreadPoolSize: ").append(toIndentedString(orgApacheFelixEventadminThreadPoolSize)).append("\n");
    sb.append("    orgApacheFelixEventadminAsyncToSyncThreadRatio: ").append(toIndentedString(orgApacheFelixEventadminAsyncToSyncThreadRatio)).append("\n");
    sb.append("    orgApacheFelixEventadminTimeout: ").append(toIndentedString(orgApacheFelixEventadminTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminRequireTopic: ").append(toIndentedString(orgApacheFelixEventadminRequireTopic)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTimeout: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTimeout)).append("\n");
    sb.append("    orgApacheFelixEventadminIgnoreTopic: ").append(toIndentedString(orgApacheFelixEventadminIgnoreTopic)).append("\n");
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
