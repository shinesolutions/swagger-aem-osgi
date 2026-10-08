package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
 */

@JsonTypeName("comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent;

  public ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties cqDamDetectAssetMimeFromContent(@Nullable ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
    return this;
  }

  /**
   * Get cqDamDetectAssetMimeFromContent
   * @return cqDamDetectAssetMimeFromContent
   */
  @Valid 
  @Schema(name = "cq.dam.detect.asset.mime.from.content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.detect.asset.mime.from.content")
  public @Nullable ConfigNodePropertyBoolean getCqDamDetectAssetMimeFromContent() {
    return cqDamDetectAssetMimeFromContent;
  }

  @JsonProperty("cq.dam.detect.asset.mime.from.content")
  public void setCqDamDetectAssetMimeFromContent(@Nullable ConfigNodePropertyBoolean cqDamDetectAssetMimeFromContent) {
    this.cqDamDetectAssetMimeFromContent = cqDamDetectAssetMimeFromContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties = (ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties) o;
    return Objects.equals(this.cqDamDetectAssetMimeFromContent, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.cqDamDetectAssetMimeFromContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamDetectAssetMimeFromContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties {\n");
    sb.append("    cqDamDetectAssetMimeFromContent: ").append(toIndentedString(cqDamDetectAssetMimeFromContent)).append("\n");
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

