package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties   {
  
  private ConfigNodePropertyString dir = null;

  public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties () {

  }

  public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties (ConfigNodePropertyString dir) {
    this.dir = dir;
  }

    
  @JsonProperty("dir")
  public ConfigNodePropertyString getDir() {
    return dir;
  }
  public void setDir(ConfigNodePropertyString dir) {
    this.dir = dir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties = (OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties) o;
    return Objects.equals(dir, orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.dir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dir);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {\n");
    
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
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
