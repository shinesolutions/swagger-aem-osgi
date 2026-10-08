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
 * ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
 */

@JsonTypeName("comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean legacyCloudUGCPathMapping;

  public ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties legacyCloudUGCPathMapping(@Nullable ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
    return this;
  }

  /**
   * Get legacyCloudUGCPathMapping
   * @return legacyCloudUGCPathMapping
   */
  @Valid 
  @Schema(name = "legacyCloudUGCPathMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("legacyCloudUGCPathMapping")
  public @Nullable ConfigNodePropertyBoolean getLegacyCloudUGCPathMapping() {
    return legacyCloudUGCPathMapping;
  }

  @JsonProperty("legacyCloudUGCPathMapping")
  public void setLegacyCloudUGCPathMapping(@Nullable ConfigNodePropertyBoolean legacyCloudUGCPathMapping) {
    this.legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties = (ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties) o;
    return Objects.equals(this.legacyCloudUGCPathMapping, comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.legacyCloudUGCPathMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyCloudUGCPathMapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {\n");
    sb.append("    legacyCloudUGCPathMapping: ").append(toIndentedString(legacyCloudUGCPathMapping)).append("\n");
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

