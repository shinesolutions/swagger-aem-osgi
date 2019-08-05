package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties   {
  
  private ConfigNodePropertyArray mimeTypes = null;

  /**
   **/
  
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

