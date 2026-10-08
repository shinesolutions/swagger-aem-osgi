package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqAddressImplLocationLocationListServletProperties
 */

@JsonTypeName("comAdobeCqAddressImplLocationLocationListServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqAddressImplLocationLocationListServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults;

  public ComAdobeCqAddressImplLocationLocationListServletProperties cqAddressLocationDefaultMaxResults(@Nullable ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
    this.cqAddressLocationDefaultMaxResults = cqAddressLocationDefaultMaxResults;
    return this;
  }

  /**
   * Get cqAddressLocationDefaultMaxResults
   * @return cqAddressLocationDefaultMaxResults
   */
  @Valid 
  @Schema(name = "cq.address.location.default.maxResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.address.location.default.maxResults")
  public @Nullable ConfigNodePropertyInteger getCqAddressLocationDefaultMaxResults() {
    return cqAddressLocationDefaultMaxResults;
  }

  @JsonProperty("cq.address.location.default.maxResults")
  public void setCqAddressLocationDefaultMaxResults(@Nullable ConfigNodePropertyInteger cqAddressLocationDefaultMaxResults) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

