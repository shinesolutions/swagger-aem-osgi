package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
 */

@JsonTypeName("comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray deletePathRegexps;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString deleteSql2Query;

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deletePathRegexps(@Nullable ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
    return this;
  }

  /**
   * Get deletePathRegexps
   * @return deletePathRegexps
   */
  @Valid 
  @Schema(name = "delete.path.regexps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete.path.regexps")
  public @Nullable ConfigNodePropertyArray getDeletePathRegexps() {
    return deletePathRegexps;
  }

  @JsonProperty("delete.path.regexps")
  public void setDeletePathRegexps(@Nullable ConfigNodePropertyArray deletePathRegexps) {
    this.deletePathRegexps = deletePathRegexps;
  }

  public ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties deleteSql2Query(@Nullable ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
    return this;
  }

  /**
   * Get deleteSql2Query
   * @return deleteSql2Query
   */
  @Valid 
  @Schema(name = "delete.sql2.query", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("delete.sql2.query")
  public @Nullable ConfigNodePropertyString getDeleteSql2Query() {
    return deleteSql2Query;
  }

  @JsonProperty("delete.sql2.query")
  public void setDeleteSql2Query(@Nullable ConfigNodePropertyString deleteSql2Query) {
    this.deleteSql2Query = deleteSql2Query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties = (ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties) o;
    return Objects.equals(this.deletePathRegexps, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deletePathRegexps) &&
        Objects.equals(this.deleteSql2Query, comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.deleteSql2Query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletePathRegexps, deleteSql2Query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {\n");
    sb.append("    deletePathRegexps: ").append(toIndentedString(deletePathRegexps)).append("\n");
    sb.append("    deleteSql2Query: ").append(toIndentedString(deleteSql2Query)).append("\n");
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

