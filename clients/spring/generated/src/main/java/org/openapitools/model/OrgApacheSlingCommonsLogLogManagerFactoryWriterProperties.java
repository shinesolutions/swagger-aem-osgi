package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
 */

@JsonTypeName("orgApacheSlingCommonsLogLogManagerFactoryWriterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFileSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered;

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFile(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
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

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileNumber(@Nullable ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFileNumber
   * @return orgApacheSlingCommonsLogFileNumber
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file.number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public @Nullable ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  @JsonProperty("org.apache.sling.commons.log.file.number")
  public void setOrgApacheSlingCommonsLogFileNumber(@Nullable ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileSize(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFileSize
   * @return orgApacheSlingCommonsLogFileSize
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public @Nullable ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  @JsonProperty("org.apache.sling.commons.log.file.size")
  public void setOrgApacheSlingCommonsLogFileSize(@Nullable ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileBuffered(@Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
    return this;
  }

  /**
   * Get orgApacheSlingCommonsLogFileBuffered
   * @return orgApacheSlingCommonsLogFileBuffered
   */
  @Valid 
  @Schema(name = "org.apache.sling.commons.log.file.buffered", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("org.apache.sling.commons.log.file.buffered")
  public @Nullable ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogFileBuffered() {
    return orgApacheSlingCommonsLogFileBuffered;
  }

  @JsonProperty("org.apache.sling.commons.log.file.buffered")
  public void setOrgApacheSlingCommonsLogFileBuffered(@Nullable ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogLogManagerFactoryWriterProperties = (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties) o;
    return Objects.equals(this.orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileBuffered, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileBuffered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogFileBuffered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {\n");
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileNumber: ").append(toIndentedString(orgApacheSlingCommonsLogFileNumber)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileSize: ").append(toIndentedString(orgApacheSlingCommonsLogFileSize)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileBuffered: ").append(toIndentedString(orgApacheSlingCommonsLogFileBuffered)).append("\n");
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

