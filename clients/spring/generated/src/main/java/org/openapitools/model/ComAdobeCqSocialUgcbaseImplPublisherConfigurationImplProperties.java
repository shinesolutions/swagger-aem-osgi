package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean isPrimaryPublisher;

  public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties isPrimaryPublisher(@Nullable ConfigNodePropertyBoolean isPrimaryPublisher) {
    this.isPrimaryPublisher = isPrimaryPublisher;
    return this;
  }

  /**
   * Get isPrimaryPublisher
   * @return isPrimaryPublisher
   */
  @Valid 
  @Schema(name = "isPrimaryPublisher", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isPrimaryPublisher")
  public @Nullable ConfigNodePropertyBoolean getIsPrimaryPublisher() {
    return isPrimaryPublisher;
  }

  @JsonProperty("isPrimaryPublisher")
  public void setIsPrimaryPublisher(@Nullable ConfigNodePropertyBoolean isPrimaryPublisher) {
    this.isPrimaryPublisher = isPrimaryPublisher;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties = (ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties) o;
    return Objects.equals(this.isPrimaryPublisher, comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.isPrimaryPublisher);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimaryPublisher);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {\n");
    sb.append("    isPrimaryPublisher: ").append(toIndentedString(isPrimaryPublisher)).append("\n");
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

