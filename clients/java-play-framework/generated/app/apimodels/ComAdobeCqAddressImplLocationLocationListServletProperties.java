package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqAddressImplLocationLocationListServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqAddressImplLocationLocationListServletProperties   {
  @JsonProperty("cq.address.location.default.maxResults")
  @Valid

  private ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults;

  public ComAdobeCqAddressImplLocationLocationListServletProperties cqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
    this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
    return this;
  }

   /**
   * Get cqAddressLocationDefaultMaxResults
   * @return cqAddressLocationDefaultMaxResults
  **/
  public ConfigNodePropertyInteger getCqAddressLocationDefaultMaxResults() {
    return cqAddressLocationDefaultMaxResults;
  }

  public void setCqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
    this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAddressImplLocationLocationListServletProperties comAdobeCqAddressImplLocationLocationListServletProperties = (ComAdobeCqAddressImplLocationLocationListServletProperties) o;
    return Objects.equals(cqAddressLocationDefaultMaxResults, comAdobeCqAddressImplLocationLocationListServletProperties.cqAddressLocationDefaultMaxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAddressLocationDefaultMaxResults);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAddressImplLocationLocationListServletProperties {\n");
    
    sb.append("    cqAddressLocationDefaultMaxResults: ").append(toIndentedString(cqAddressLocationDefaultMaxResults)).append("\n");
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

