package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
 */

@JsonTypeName("comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ugCLimit;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger ugcLimitDuration;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray domains;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray toList;

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties enable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
    return this;
  }

  /**
   * Get enable
   * @return enable
   */
  @Valid 
  @Schema(name = "enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable")
  public @Nullable ConfigNodePropertyBoolean getEnable() {
    return enable;
  }

  @JsonProperty("enable")
  public void setEnable(@Nullable ConfigNodePropertyBoolean enable) {
    this.enable = enable;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugCLimit(@Nullable ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
    return this;
  }

  /**
   * Get ugCLimit
   * @return ugCLimit
   */
  @Valid 
  @Schema(name = "UGCLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UGCLimit")
  public @Nullable ConfigNodePropertyInteger getUgCLimit() {
    return ugCLimit;
  }

  @JsonProperty("UGCLimit")
  public void setUgCLimit(@Nullable ConfigNodePropertyInteger ugCLimit) {
    this.ugCLimit = ugCLimit;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties ugcLimitDuration(@Nullable ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
    return this;
  }

  /**
   * Get ugcLimitDuration
   * @return ugcLimitDuration
   */
  @Valid 
  @Schema(name = "ugcLimitDuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ugcLimitDuration")
  public @Nullable ConfigNodePropertyInteger getUgcLimitDuration() {
    return ugcLimitDuration;
  }

  @JsonProperty("ugcLimitDuration")
  public void setUgcLimitDuration(@Nullable ConfigNodePropertyInteger ugcLimitDuration) {
    this.ugcLimitDuration = ugcLimitDuration;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties domains(@Nullable ConfigNodePropertyArray domains) {
    this.domains = domains;
    return this;
  }

  /**
   * Get domains
   * @return domains
   */
  @Valid 
  @Schema(name = "domains", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domains")
  public @Nullable ConfigNodePropertyArray getDomains() {
    return domains;
  }

  @JsonProperty("domains")
  public void setDomains(@Nullable ConfigNodePropertyArray domains) {
    this.domains = domains;
  }

  public ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties toList(@Nullable ConfigNodePropertyArray toList) {
    this.toList = toList;
    return this;
  }

  /**
   * Get toList
   * @return toList
   */
  @Valid 
  @Schema(name = "toList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toList")
  public @Nullable ConfigNodePropertyArray getToList() {
    return toList;
  }

  @JsonProperty("toList")
  public void setToList(@Nullable ConfigNodePropertyArray toList) {
    this.toList = toList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties = (ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties) o;
    return Objects.equals(this.enable, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.enable) &&
        Objects.equals(this.ugCLimit, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugCLimit) &&
        Objects.equals(this.ugcLimitDuration, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.ugcLimitDuration) &&
        Objects.equals(this.domains, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.domains) &&
        Objects.equals(this.toList, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.toList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable, ugCLimit, ugcLimitDuration, domains, toList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
    sb.append("    ugCLimit: ").append(toIndentedString(ugCLimit)).append("\n");
    sb.append("    ugcLimitDuration: ").append(toIndentedString(ugcLimitDuration)).append("\n");
    sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
    sb.append("    toList: ").append(toIndentedString(toList)).append("\n");
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

