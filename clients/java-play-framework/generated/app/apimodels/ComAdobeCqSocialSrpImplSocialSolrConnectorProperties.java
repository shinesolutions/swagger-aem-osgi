package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties   {
  @JsonProperty("srp.type")
  @Valid

  private ConfigNodePropertyString srpType;

  public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties srpType(ConfigNodePropertyString srpType) {
    this.srpType = srpType;
    return this;
  }

   /**
   * Get srpType
   * @return srpType
  **/
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
    return Objects.equals(srpType, comAdobeCqSocialSrpImplSocialSolrConnectorProperties.srpType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srpType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

