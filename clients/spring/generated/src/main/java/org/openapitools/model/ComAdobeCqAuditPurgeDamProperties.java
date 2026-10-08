package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
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
 * ComAdobeCqAuditPurgeDamProperties
 */

@JsonTypeName("comAdobeCqAuditPurgeDamProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqAuditPurgeDamProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString auditlogRuleName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString auditlogRuleContentpath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger auditlogRuleMinimumage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown auditlogRuleTypes;

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleName(@Nullable ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
    return this;
  }

  /**
   * Get auditlogRuleName
   * @return auditlogRuleName
   */
  @Valid 
  @Schema(name = "auditlog.rule.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlog.rule.name")
  public @Nullable ConfigNodePropertyString getAuditlogRuleName() {
    return auditlogRuleName;
  }

  @JsonProperty("auditlog.rule.name")
  public void setAuditlogRuleName(@Nullable ConfigNodePropertyString auditlogRuleName) {
    this.auditlogRuleName = auditlogRuleName;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleContentpath(@Nullable ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
    return this;
  }

  /**
   * Get auditlogRuleContentpath
   * @return auditlogRuleContentpath
   */
  @Valid 
  @Schema(name = "auditlog.rule.contentpath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlog.rule.contentpath")
  public @Nullable ConfigNodePropertyString getAuditlogRuleContentpath() {
    return auditlogRuleContentpath;
  }

  @JsonProperty("auditlog.rule.contentpath")
  public void setAuditlogRuleContentpath(@Nullable ConfigNodePropertyString auditlogRuleContentpath) {
    this.auditlogRuleContentpath = auditlogRuleContentpath;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleMinimumage(@Nullable ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
    return this;
  }

  /**
   * Get auditlogRuleMinimumage
   * @return auditlogRuleMinimumage
   */
  @Valid 
  @Schema(name = "auditlog.rule.minimumage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlog.rule.minimumage")
  public @Nullable ConfigNodePropertyInteger getAuditlogRuleMinimumage() {
    return auditlogRuleMinimumage;
  }

  @JsonProperty("auditlog.rule.minimumage")
  public void setAuditlogRuleMinimumage(@Nullable ConfigNodePropertyInteger auditlogRuleMinimumage) {
    this.auditlogRuleMinimumage = auditlogRuleMinimumage;
  }

  public ComAdobeCqAuditPurgeDamProperties auditlogRuleTypes(@Nullable ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
    return this;
  }

  /**
   * Get auditlogRuleTypes
   * @return auditlogRuleTypes
   */
  @Valid 
  @Schema(name = "auditlog.rule.types", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditlog.rule.types")
  public @Nullable ConfigNodePropertyDropDown getAuditlogRuleTypes() {
    return auditlogRuleTypes;
  }

  @JsonProperty("auditlog.rule.types")
  public void setAuditlogRuleTypes(@Nullable ConfigNodePropertyDropDown auditlogRuleTypes) {
    this.auditlogRuleTypes = auditlogRuleTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqAuditPurgeDamProperties comAdobeCqAuditPurgeDamProperties = (ComAdobeCqAuditPurgeDamProperties) o;
    return Objects.equals(this.auditlogRuleName, comAdobeCqAuditPurgeDamProperties.auditlogRuleName) &&
        Objects.equals(this.auditlogRuleContentpath, comAdobeCqAuditPurgeDamProperties.auditlogRuleContentpath) &&
        Objects.equals(this.auditlogRuleMinimumage, comAdobeCqAuditPurgeDamProperties.auditlogRuleMinimumage) &&
        Objects.equals(this.auditlogRuleTypes, comAdobeCqAuditPurgeDamProperties.auditlogRuleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditlogRuleName, auditlogRuleContentpath, auditlogRuleMinimumage, auditlogRuleTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqAuditPurgeDamProperties {\n");
    sb.append("    auditlogRuleName: ").append(toIndentedString(auditlogRuleName)).append("\n");
    sb.append("    auditlogRuleContentpath: ").append(toIndentedString(auditlogRuleContentpath)).append("\n");
    sb.append("    auditlogRuleMinimumage: ").append(toIndentedString(auditlogRuleMinimumage)).append("\n");
    sb.append("    auditlogRuleTypes: ").append(toIndentedString(auditlogRuleTypes)).append("\n");
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

