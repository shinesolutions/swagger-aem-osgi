package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties   {
  
  private ConfigNodePropertyInteger length = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("length")
  public ConfigNodePropertyInteger getLength() {
    return length;
  }
  public void setLength(ConfigNodePropertyInteger length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties = (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties) o;
    return Objects.equals(length, orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

