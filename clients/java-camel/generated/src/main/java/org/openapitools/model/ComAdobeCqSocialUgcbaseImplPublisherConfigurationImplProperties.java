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
 * ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties {

  private ConfigNodePropertyBoolean isPrimaryPublisher;

  public ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties isPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher) {
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
  public ConfigNodePropertyBoolean getIsPrimaryPublisher() {
    return isPrimaryPublisher;
  }

  public void setIsPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

