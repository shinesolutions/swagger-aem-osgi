package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
 */

@JsonTypeName("comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean accepted;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ranked;

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties accepted(@Nullable ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * Get accepted
   * @return accepted
   */
  @Valid 
  @Schema(name = "accepted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accepted")
  public @Nullable ConfigNodePropertyBoolean getAccepted() {
    return accepted;
  }

  @JsonProperty("accepted")
  public void setAccepted(@Nullable ConfigNodePropertyBoolean accepted) {
    this.accepted = accepted;
  }

  public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties ranked(@Nullable ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
    return this;
  }

  /**
   * Get ranked
   * @return ranked
   */
  @Valid 
  @Schema(name = "ranked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranked")
  public @Nullable ConfigNodePropertyInteger getRanked() {
    return ranked;
  }

  @JsonProperty("ranked")
  public void setRanked(@Nullable ConfigNodePropertyInteger ranked) {
    this.ranked = ranked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties = (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties) o;
    return Objects.equals(this.accepted, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.accepted) &&
        Objects.equals(this.ranked, comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.ranked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, ranked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    ranked: ").append(toIndentedString(ranked)).append("\n");
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

