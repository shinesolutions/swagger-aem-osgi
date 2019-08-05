package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties   {
  @JsonProperty("mime.types")
  private ConfigNodePropertyArray mimeTypes = null;

  /**
   **/
  public OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties mimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mime.types")
  public ConfigNodePropertyArray getMimeTypes() {
    return mimeTypes;
  }
  public void setMimeTypes(ConfigNodePropertyArray mimeTypes) {
    this.mimeTypes = mimeTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

