package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties   {
  
  private ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize = null;
  private ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions = null;

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties () {

  }

  public OrgApacheSlingScriptingCoreImplScriptCacheImplProperties (ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize, ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
    this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
  }

    
  @JsonProperty("org.apache.sling.scripting.cache.size")
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingCacheSize() {
    return orgApacheSlingScriptingCacheSize;
  }
  public void setOrgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
  }

    
  @JsonProperty("org.apache.sling.scripting.cache.additional_extensions")
  public ConfigNodePropertyArray getOrgApacheSlingScriptingCacheAdditionalExtensions() {
    return orgApacheSlingScriptingCacheAdditionalExtensions;
  }
  public void setOrgApacheSlingScriptingCacheAdditionalExtensions(ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions) {
    this.orgApacheSlingScriptingCacheAdditionalExtensions = orgApacheSlingScriptingCacheAdditionalExtensions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties orgApacheSlingScriptingCoreImplScriptCacheImplProperties = (OrgApacheSlingScriptingCoreImplScriptCacheImplProperties) o;
    return Objects.equals(orgApacheSlingScriptingCacheSize, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheSize) &&
        Objects.equals(orgApacheSlingScriptingCacheAdditionalExtensions, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheAdditionalExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingScriptingCacheSize, orgApacheSlingScriptingCacheAdditionalExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties {\n");
    
    sb.append("    orgApacheSlingScriptingCacheSize: ").append(toIndentedString(orgApacheSlingScriptingCacheSize)).append("\n");
    sb.append("    orgApacheSlingScriptingCacheAdditionalExtensions: ").append(toIndentedString(orgApacheSlingScriptingCacheAdditionalExtensions)).append("\n");
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
