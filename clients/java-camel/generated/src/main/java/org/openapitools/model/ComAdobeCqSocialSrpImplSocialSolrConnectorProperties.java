package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
 */

@JsonTypeName("comAdobeCqSocialSrpImplSocialSolrConnectorProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {

  private ConfigNodePropertyString srpType;

  public ComAdobeCqSocialSrpImplSocialSolrConnectorProperties srpType(ConfigNodePropertyString srpType) {
    this.srpType = srpType;
    return this;
  }

  /**
   * Get srpType
   * @return srpType
   */
  @Valid 
  @Schema(name = "srp.type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("srp.type")
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

