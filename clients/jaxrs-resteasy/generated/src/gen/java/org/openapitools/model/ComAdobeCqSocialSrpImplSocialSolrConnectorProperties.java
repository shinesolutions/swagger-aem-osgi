package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties   {
  
  private ConfigNodePropertyString srpType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("srp.type")
  @Valid
  public ConfigNodePropertyString getSrpType() {
    return srpType;
  }
  public void setSrpType(ConfigNodePropertyString srpType) {
    this.srpType = srpType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties comAdobeCqSocialSrpImplSocialSolrConnectorProperties = (ComAdobeCqSocialSrpImplSocialSolrConnectorProperties) o;
    return Objects.equals(this.srpType, comAdobeCqSocialSrpImplSocialSolrConnectorProperties.srpType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srpType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {\n");
    
    sb.append("    srpType: ").append(toIndentedString(srpType)).append("\n");
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

