package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
 */

@JsonTypeName("orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString alias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString davProtectedhandlers;

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties alias(@Nullable ConfigNodePropertyString alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
   */
  @Valid 
  @Schema(name = "alias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alias")
  public @Nullable ConfigNodePropertyString getAlias() {
    return alias;
  }

  @JsonProperty("alias")
  public void setAlias(@Nullable ConfigNodePropertyString alias) {
    this.alias = alias;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davCreateAbsoluteUri(@Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
    return this;
  }

  /**
   * Get davCreateAbsoluteUri
   * @return davCreateAbsoluteUri
   */
  @Valid 
  @Schema(name = "dav.create-absolute-uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dav.create-absolute-uri")
  public @Nullable ConfigNodePropertyBoolean getDavCreateAbsoluteUri() {
    return davCreateAbsoluteUri;
  }

  @JsonProperty("dav.create-absolute-uri")
  public void setDavCreateAbsoluteUri(@Nullable ConfigNodePropertyBoolean davCreateAbsoluteUri) {
    this.davCreateAbsoluteUri = davCreateAbsoluteUri;
  }

  public OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties davProtectedhandlers(@Nullable ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
    return this;
  }

  /**
   * Get davProtectedhandlers
   * @return davProtectedhandlers
   */
  @Valid 
  @Schema(name = "dav.protectedhandlers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dav.protectedhandlers")
  public @Nullable ConfigNodePropertyString getDavProtectedhandlers() {
    return davProtectedhandlers;
  }

  @JsonProperty("dav.protectedhandlers")
  public void setDavProtectedhandlers(@Nullable ConfigNodePropertyString davProtectedhandlers) {
    this.davProtectedhandlers = davProtectedhandlers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties = (OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties) o;
    return Objects.equals(this.alias, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.alias) &&
        Objects.equals(this.davCreateAbsoluteUri, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davCreateAbsoluteUri) &&
        Objects.equals(this.davProtectedhandlers, orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.davProtectedhandlers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, davCreateAbsoluteUri, davProtectedhandlers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    davCreateAbsoluteUri: ").append(toIndentedString(davCreateAbsoluteUri)).append("\n");
    sb.append("    davProtectedhandlers: ").append(toIndentedString(davProtectedhandlers)).append("\n");
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

