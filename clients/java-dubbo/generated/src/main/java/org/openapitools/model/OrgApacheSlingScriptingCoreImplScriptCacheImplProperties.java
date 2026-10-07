package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingScriptingCoreImplScriptCacheImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("org.apache.sling.scripting.cache.size")
  private ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize;

  @JsonProperty("org.apache.sling.scripting.cache.additional_extensions")
  private ConfigNodePropertyArray orgApacheSlingScriptingCacheAdditionalExtensions;

  /**
   * 
   * @return orgApacheSlingScriptingCacheSize
   */
  public ConfigNodePropertyInteger getOrgApacheSlingScriptingCacheSize() {
    return orgApacheSlingScriptingCacheSize;
  }

  public void setOrgApacheSlingScriptingCacheSize(ConfigNodePropertyInteger orgApacheSlingScriptingCacheSize) {
    this.orgApacheSlingScriptingCacheSize = orgApacheSlingScriptingCacheSize;
  }

  /**
   * 
   * @return orgApacheSlingScriptingCacheAdditionalExtensions
   */
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
    return Objects.equals(this.orgApacheSlingScriptingCacheSize, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheSize) &&
        Objects.equals(this.orgApacheSlingScriptingCacheAdditionalExtensions, orgApacheSlingScriptingCoreImplScriptCacheImplProperties.orgApacheSlingScriptingCacheAdditionalExtensions);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
