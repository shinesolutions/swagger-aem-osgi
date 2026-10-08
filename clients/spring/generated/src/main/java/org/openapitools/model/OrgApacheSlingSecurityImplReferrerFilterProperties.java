package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * OrgApacheSlingSecurityImplReferrerFilterProperties
 */

@JsonTypeName("orgApacheSlingSecurityImplReferrerFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingSecurityImplReferrerFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean allowEmpty;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray allowHosts;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray allowHostsRegexp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray filterMethods;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray excludeAgentsRegexp;

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowEmpty(@Nullable ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
    return this;
  }

  /**
   * Get allowEmpty
   * @return allowEmpty
   */
  @Valid 
  @Schema(name = "allow.empty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow.empty")
  public @Nullable ConfigNodePropertyBoolean getAllowEmpty() {
    return allowEmpty;
  }

  @JsonProperty("allow.empty")
  public void setAllowEmpty(@Nullable ConfigNodePropertyBoolean allowEmpty) {
    this.allowEmpty = allowEmpty;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHosts(@Nullable ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
    return this;
  }

  /**
   * Get allowHosts
   * @return allowHosts
   */
  @Valid 
  @Schema(name = "allow.hosts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow.hosts")
  public @Nullable ConfigNodePropertyArray getAllowHosts() {
    return allowHosts;
  }

  @JsonProperty("allow.hosts")
  public void setAllowHosts(@Nullable ConfigNodePropertyArray allowHosts) {
    this.allowHosts = allowHosts;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties allowHostsRegexp(@Nullable ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
    return this;
  }

  /**
   * Get allowHostsRegexp
   * @return allowHostsRegexp
   */
  @Valid 
  @Schema(name = "allow.hosts.regexp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allow.hosts.regexp")
  public @Nullable ConfigNodePropertyArray getAllowHostsRegexp() {
    return allowHostsRegexp;
  }

  @JsonProperty("allow.hosts.regexp")
  public void setAllowHostsRegexp(@Nullable ConfigNodePropertyArray allowHostsRegexp) {
    this.allowHostsRegexp = allowHostsRegexp;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties filterMethods(@Nullable ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
    return this;
  }

  /**
   * Get filterMethods
   * @return filterMethods
   */
  @Valid 
  @Schema(name = "filter.methods", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filter.methods")
  public @Nullable ConfigNodePropertyArray getFilterMethods() {
    return filterMethods;
  }

  @JsonProperty("filter.methods")
  public void setFilterMethods(@Nullable ConfigNodePropertyArray filterMethods) {
    this.filterMethods = filterMethods;
  }

  public OrgApacheSlingSecurityImplReferrerFilterProperties excludeAgentsRegexp(@Nullable ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
    return this;
  }

  /**
   * Get excludeAgentsRegexp
   * @return excludeAgentsRegexp
   */
  @Valid 
  @Schema(name = "exclude.agents.regexp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exclude.agents.regexp")
  public @Nullable ConfigNodePropertyArray getExcludeAgentsRegexp() {
    return excludeAgentsRegexp;
  }

  @JsonProperty("exclude.agents.regexp")
  public void setExcludeAgentsRegexp(@Nullable ConfigNodePropertyArray excludeAgentsRegexp) {
    this.excludeAgentsRegexp = excludeAgentsRegexp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingSecurityImplReferrerFilterProperties orgApacheSlingSecurityImplReferrerFilterProperties = (OrgApacheSlingSecurityImplReferrerFilterProperties) o;
    return Objects.equals(this.allowEmpty, orgApacheSlingSecurityImplReferrerFilterProperties.allowEmpty) &&
        Objects.equals(this.allowHosts, orgApacheSlingSecurityImplReferrerFilterProperties.allowHosts) &&
        Objects.equals(this.allowHostsRegexp, orgApacheSlingSecurityImplReferrerFilterProperties.allowHostsRegexp) &&
        Objects.equals(this.filterMethods, orgApacheSlingSecurityImplReferrerFilterProperties.filterMethods) &&
        Objects.equals(this.excludeAgentsRegexp, orgApacheSlingSecurityImplReferrerFilterProperties.excludeAgentsRegexp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowEmpty, allowHosts, allowHostsRegexp, filterMethods, excludeAgentsRegexp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingSecurityImplReferrerFilterProperties {\n");
    sb.append("    allowEmpty: ").append(toIndentedString(allowEmpty)).append("\n");
    sb.append("    allowHosts: ").append(toIndentedString(allowHosts)).append("\n");
    sb.append("    allowHostsRegexp: ").append(toIndentedString(allowHostsRegexp)).append("\n");
    sb.append("    filterMethods: ").append(toIndentedString(filterMethods)).append("\n");
    sb.append("    excludeAgentsRegexp: ").append(toIndentedString(excludeAgentsRegexp)).append("\n");
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

