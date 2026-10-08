package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {

  private ConfigNodePropertyInteger totalWidth;

  private ConfigNodePropertyInteger colWidthName;

  private ConfigNodePropertyInteger colWidthResult;

  private ConfigNodePropertyInteger colWidthTiming;

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties totalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
    return this;
  }

  /**
   * Get totalWidth
   * @return totalWidth
   */
  @Valid 
  @Schema(name = "totalWidth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalWidth")
  public ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }

  public void setTotalWidth(ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
    return this;
  }

  /**
   * Get colWidthName
   * @return colWidthName
   */
  @Valid 
  @Schema(name = "colWidthName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colWidthName")
  public ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }

  public void setColWidthName(ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
    return this;
  }

  /**
   * Get colWidthResult
   * @return colWidthResult
   */
  @Valid 
  @Schema(name = "colWidthResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colWidthResult")
  public ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }

  public void setColWidthResult(ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
    return this;
  }

  /**
   * Get colWidthTiming
   * @return colWidthTiming
   */
  @Valid 
  @Schema(name = "colWidthTiming", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("colWidthTiming")
  public ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }

  public void setColWidthTiming(ConfigNodePropertyInteger colWidthTiming) {
    this.colWidthTiming = colWidthTiming;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties = (OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties) o;
    return Objects.equals(this.totalWidth, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.totalWidth) &&
        Objects.equals(this.colWidthName, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthName) &&
        Objects.equals(this.colWidthResult, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthResult) &&
        Objects.equals(this.colWidthTiming, orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties.colWidthTiming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalWidth, colWidthName, colWidthResult, colWidthTiming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {\n");
    sb.append("    totalWidth: ").append(toIndentedString(totalWidth)).append("\n");
    sb.append("    colWidthName: ").append(toIndentedString(colWidthName)).append("\n");
    sb.append("    colWidthResult: ").append(toIndentedString(colWidthResult)).append("\n");
    sb.append("    colWidthTiming: ").append(toIndentedString(colWidthTiming)).append("\n");
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

