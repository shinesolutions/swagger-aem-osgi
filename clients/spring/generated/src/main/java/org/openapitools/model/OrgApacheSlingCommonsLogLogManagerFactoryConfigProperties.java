package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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
 * OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
 */

@JsonTypeName("orgApacheSlingCommonsLogLogManagerFactoryConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsLogPattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray orgApacheSlingCommonsLogNames;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv;

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLevel(@Nullable ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogLevel
   * @return orgApacheSlingCommonsLogLevel
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.level")
  public @Nullable ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }

  @JsonProperty("org.apache.sling.commons.log.level")
  public void setOrgApacheSlingCommonsLogLevel(@Nullable ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogFile(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFile
   * @return orgApacheSlingCommonsLogFile
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  @JsonProperty("org.apache.sling.commons.log.file")
  public void setOrgApacheSlingCommonsLogFile(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogPattern(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogPattern
   * @return orgApacheSlingCommonsLogPattern
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }

  @JsonProperty("org.apache.sling.commons.log.pattern")
  public void setOrgApacheSlingCommonsLogPattern(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogNames(@Nullable ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogNames
   * @return orgApacheSlingCommonsLogNames
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.names")
  public @Nullable ConfigNodePropertyArray getOrgApacheSlingCommonsLogNames() {
    return orgApacheSlingCommonsLogNames;
  }

  @JsonProperty("org.apache.sling.commons.log.names")
  public void setOrgApacheSlingCommonsLogNames(@Nullable ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogAdditiv(@Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogAdditiv
   * @return orgApacheSlingCommonsLogAdditiv
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.additiv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.additiv")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogAdditiv() {
    return orgApacheSlingCommonsLogAdditiv;
  }

  @JsonProperty("org.apache.sling.commons.log.additiv")
  public void setOrgApacheSlingCommonsLogAdditiv(@Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLogManagerFactoryConfigProperties = (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties) o;
    return Objects.equals(this.orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(this.orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(this.orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogNames) &&
        Objects.equals(this.orgApacheSlingCommonsLogAdditiv, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogAdditiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogAdditiv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {\n");
    sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
    sb.append("    orgApacheSlingCommonsLogNames: ").append(toIndentedString(orgApacheSlingCommonsLogNames)).append("\n");
    sb.append("    orgApacheSlingCommonsLogAdditiv: ").append(toIndentedString(orgApacheSlingCommonsLogAdditiv)).append("\n");
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

