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
 * ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
 */

@JsonTypeName("comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamAllowAllMime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqDamAllowedAssetMimes;

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowAllMime(@Nullable ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
    return this;
  }

  /**
   * Get cqDamAllowAllMime
   * @return cqDamAllowAllMime
   */
  @Valid 
  @Schema(name = "cq.dam.allow.all.mime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.allow.all.mime")
  public @Nullable ConfigNodePropertyBoolean getCqDamAllowAllMime() {
    return cqDamAllowAllMime;
  }

  @JsonProperty("cq.dam.allow.all.mime")
  public void setCqDamAllowAllMime(@Nullable ConfigNodePropertyBoolean cqDamAllowAllMime) {
    this.cqDamAllowAllMime = cqDamAllowAllMime;
  }

  public ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties cqDamAllowedAssetMimes(@Nullable ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
    return this;
  }

  /**
   * Get cqDamAllowedAssetMimes
   * @return cqDamAllowedAssetMimes
   */
  @Valid 
  @Schema(name = "cq.dam.allowed.asset.mimes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.allowed.asset.mimes")
  public @Nullable ConfigNodePropertyArray getCqDamAllowedAssetMimes() {
    return cqDamAllowedAssetMimes;
  }

  @JsonProperty("cq.dam.allowed.asset.mimes")
  public void setCqDamAllowedAssetMimes(@Nullable ConfigNodePropertyArray cqDamAllowedAssetMimes) {
    this.cqDamAllowedAssetMimes = cqDamAllowedAssetMimes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties = (ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties) o;
    return Objects.equals(this.cqDamAllowAllMime, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowAllMime) &&
        Objects.equals(this.cqDamAllowedAssetMimes, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.cqDamAllowedAssetMimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamAllowAllMime, cqDamAllowedAssetMimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties {\n");
    sb.append("    cqDamAllowAllMime: ").append(toIndentedString(cqDamAllowAllMime)).append("\n");
    sb.append("    cqDamAllowedAssetMimes: ").append(toIndentedString(cqDamAllowedAssetMimes)).append("\n");
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

