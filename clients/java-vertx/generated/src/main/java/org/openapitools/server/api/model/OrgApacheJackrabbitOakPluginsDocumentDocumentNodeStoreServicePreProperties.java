package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties   {
  
  private ConfigNodePropertyArray persistentCacheIncludes = null;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties () {

  }

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties (ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }

    
  @JsonProperty("persistentCacheIncludes")
  public ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }
  public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties = (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties) o;
    return Objects.equals(persistentCacheIncludes, orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties.persistentCacheIncludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(persistentCacheIncludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties {\n");
    
    sb.append("    persistentCacheIncludes: ").append(toIndentedString(persistentCacheIncludes)).append("\n");
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
