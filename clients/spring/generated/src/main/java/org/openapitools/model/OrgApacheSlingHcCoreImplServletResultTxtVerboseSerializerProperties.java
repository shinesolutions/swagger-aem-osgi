package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
 */

@JsonTypeName("orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger totalWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger colWidthName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger colWidthResult;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger colWidthTiming;

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties totalWidth(@Nullable ConfigNodePropertyInteger totalWidth) {
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
  public @Nullable ConfigNodePropertyInteger getTotalWidth() {
    return totalWidth;
  }

  @JsonProperty("totalWidth")
  public void setTotalWidth(@Nullable ConfigNodePropertyInteger totalWidth) {
    this.totalWidth = totalWidth;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthName(@Nullable ConfigNodePropertyInteger colWidthName) {
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
  public @Nullable ConfigNodePropertyInteger getColWidthName() {
    return colWidthName;
  }

  @JsonProperty("colWidthName")
  public void setColWidthName(@Nullable ConfigNodePropertyInteger colWidthName) {
    this.colWidthName = colWidthName;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthResult(@Nullable ConfigNodePropertyInteger colWidthResult) {
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
  public @Nullable ConfigNodePropertyInteger getColWidthResult() {
    return colWidthResult;
  }

  @JsonProperty("colWidthResult")
  public void setColWidthResult(@Nullable ConfigNodePropertyInteger colWidthResult) {
    this.colWidthResult = colWidthResult;
  }

  public OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties colWidthTiming(@Nullable ConfigNodePropertyInteger colWidthTiming) {
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
  public @Nullable ConfigNodePropertyInteger getColWidthTiming() {
    return colWidthTiming;
  }

  @JsonProperty("colWidthTiming")
  public void setColWidthTiming(@Nullable ConfigNodePropertyInteger colWidthTiming) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

