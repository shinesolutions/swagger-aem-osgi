package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyArray mimeTypes = null;

  public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties () {

  }

  public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties (ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }

    
  @JsonProperty("mime.types")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }
  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties = (OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties) o;
    return Objects.equals(mimeTypes, orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties.mimeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {\n");
    
    sb.append("    mimeTypes: ").append(toIndentedString(mimeTypes)).append("\n");
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
