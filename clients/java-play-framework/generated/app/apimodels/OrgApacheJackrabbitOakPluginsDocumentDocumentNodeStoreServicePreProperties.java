package apimodels;

import apimodels.ConfigNodePropertyArray;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties   {
  @JsonProperty("persistentCacheIncludes")
  private ConfigNodePropertyArray persistentCacheIncludes = null;

  public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties persistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
    return this;
  }

   /**
   * Get persistentCacheIncludes
   * @return persistentCacheIncludes
  **/
  @Valid
  public ConfigNodePropertyArray getPersistentCacheIncludes() {
    return persistentCacheIncludes;
  }

  public void setPersistentCacheIncludes(ConfigNodePropertyArray persistentCacheIncludes) {
    this.persistentCacheIncludes = persistentCacheIncludes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

