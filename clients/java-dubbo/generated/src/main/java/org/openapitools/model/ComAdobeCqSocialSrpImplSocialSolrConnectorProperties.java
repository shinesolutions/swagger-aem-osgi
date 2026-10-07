package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("srp.type")
  private ConfigNodePropertyString srpType;

  /**
   * 
   * @return srpType
   */
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
