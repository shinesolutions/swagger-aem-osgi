package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-10-07T12:53:12.340274163Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingXssImplXSSFilterImplProperties   {
  @JsonProperty("policyPath")
  private ConfigNodePropertyString policyPath;

  /**
   **/
  public OrgApacheSlingXssImplXSSFilterImplProperties policyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("policyPath")
  public ConfigNodePropertyString getPolicyPath() {
    return policyPath;
  }
  public void setPolicyPath(ConfigNodePropertyString policyPath) {
    this.policyPath = policyPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingXssImplXSSFilterImplProperties orgApacheSlingXssImplXSSFilterImplProperties = (OrgApacheSlingXssImplXSSFilterImplProperties) o;
    return Objects.equals(policyPath, orgApacheSlingXssImplXSSFilterImplProperties.policyPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingXssImplXSSFilterImplProperties {\n");
    
    sb.append("    policyPath: ").append(toIndentedString(policyPath)).append("\n");
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

