package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqPollingImporterImplManagedPollingImporterImplProperties
 */

@JsonTypeName("comDayCqPollingImporterImplManagedPollingImporterImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString importerUser;

  public ComDayCqPollingImporterImplManagedPollingImporterImplProperties importerUser(@Nullable ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }

  /**
   * Get importerUser
   * @return importerUser
   */
  @Valid 
  @Schema(name = "importer.user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("importer.user")
  public @Nullable ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  @JsonProperty("importer.user")
  public void setImporterUser(@Nullable ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties comDayCqPollingImporterImplManagedPollingImporterImplProperties = (ComDayCqPollingImporterImplManagedPollingImporterImplProperties) o;
    return Objects.equals(this.importerUser, comDayCqPollingImporterImplManagedPollingImporterImplProperties.importerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importerUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {\n");
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
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

