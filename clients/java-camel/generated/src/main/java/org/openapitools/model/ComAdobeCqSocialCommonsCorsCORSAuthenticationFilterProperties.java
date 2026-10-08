package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {

  private ConfigNodePropertyBoolean corsEnabling;

  public ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties corsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
    return this;
  }

  /**
   * Get corsEnabling
   * @return corsEnabling
   */
  @Valid 
  @Schema(name = "cors.enabling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cors.enabling")
  public ConfigNodePropertyBoolean getCorsEnabling() {
    return corsEnabling;
  }

  public void setCorsEnabling(ConfigNodePropertyBoolean corsEnabling) {
    this.corsEnabling = corsEnabling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties = (ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties) o;
    return Objects.equals(this.corsEnabling, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.corsEnabling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corsEnabling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {\n");
    sb.append("    corsEnabling: ").append(toIndentedString(corsEnabling)).append("\n");
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

