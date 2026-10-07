package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqAddressImplLocationLocationListServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.address.location.default.maxResults")
  private ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults;

  /**
   * 
   * @return cqAddressLocationDefaultMaxResults
   */
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
    return Objects.equals(this.cqAddressLocationDefaultMaxResults, comAdobeCqAddressImplLocationLocationListServletProperties.cqAddressLocationDefaultMaxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqAddressLocationDefaultMaxResults);
  }

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
