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
 * ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
 */

@JsonTypeName("comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds;

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesEnabled(@Nullable ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
    return this;
  }

  /**
   * Get cqSocialContentFragmentsServicesEnabled
   * @return cqSocialContentFragmentsServicesEnabled
   */
  @Valid 
  @Schema(name = "cq.social.content.fragments.services.enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.social.content.fragments.services.enabled")
  public @Nullable ConfigNodePropertyBoolean getCqSocialContentFragmentsServicesEnabled() {
    return cqSocialContentFragmentsServicesEnabled;
  }

  @JsonProperty("cq.social.content.fragments.services.enabled")
  public void setCqSocialContentFragmentsServicesEnabled(@Nullable ConfigNodePropertyBoolean cqSocialContentFragmentsServicesEnabled) {
    this.cqSocialContentFragmentsServicesEnabled = cqSocialContentFragmentsServicesEnabled;
  }

  public ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties cqSocialContentFragmentsServicesWaitTimeSeconds(@Nullable ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
    return this;
  }

  /**
   * Get cqSocialContentFragmentsServicesWaitTimeSeconds
   * @return cqSocialContentFragmentsServicesWaitTimeSeconds
   */
  @Valid 
  @Schema(name = "cq.social.content.fragments.services.waitTimeSeconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
  public @Nullable ConfigNodePropertyInteger getCqSocialContentFragmentsServicesWaitTimeSeconds() {
    return cqSocialContentFragmentsServicesWaitTimeSeconds;
  }

  @JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
  public void setCqSocialContentFragmentsServicesWaitTimeSeconds(@Nullable ConfigNodePropertyInteger cqSocialContentFragmentsServicesWaitTimeSeconds) {
    this.cqSocialContentFragmentsServicesWaitTimeSeconds = cqSocialContentFragmentsServicesWaitTimeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties = (ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties) o;
    return Objects.equals(this.cqSocialContentFragmentsServicesEnabled, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesEnabled) &&
        Objects.equals(this.cqSocialContentFragmentsServicesWaitTimeSeconds, comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.cqSocialContentFragmentsServicesWaitTimeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqSocialContentFragmentsServicesEnabled, cqSocialContentFragmentsServicesWaitTimeSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {\n");
    sb.append("    cqSocialContentFragmentsServicesEnabled: ").append(toIndentedString(cqSocialContentFragmentsServicesEnabled)).append("\n");
    sb.append("    cqSocialContentFragmentsServicesWaitTimeSeconds: ").append(toIndentedString(cqSocialContentFragmentsServicesWaitTimeSeconds)).append("\n");
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

