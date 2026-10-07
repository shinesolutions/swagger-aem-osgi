package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties   {
  @JsonProperty("length")
  private ConfigNodePropertyInteger length;

  public OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties length(ConfigNodePropertyInteger length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getLength() {
    return length;
  }

  public void setLength(ConfigNodePropertyInteger length) {
    this.length = length;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties = (OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties) o;
    return Objects.equals(this.length, orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties.length);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

