package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeCqAddressImplLocationLocationListServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeCqAddressImplLocationLocationListServletProperties   {
  @JsonProperty("cq.address.location.default.maxResults")
  private ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults = null;

  public ComAdobeCqAddressImplLocationLocationListServletProperties cqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
    this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
    return this;
  }

  /**
   * Get cqAddressLocationDefaultMaxResults
   * @return cqAddressLocationDefaultMaxResults
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getCqAddressLocationDefaultMaxResults() {
    return cqAddressLocationDefaultMaxResults;
  }

  public void setCqAddressLocationDefaultMaxResults(ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
    this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

