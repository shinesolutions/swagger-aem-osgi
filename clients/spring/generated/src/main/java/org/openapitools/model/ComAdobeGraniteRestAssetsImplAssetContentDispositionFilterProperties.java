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
 * ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
 */

@JsonTypeName("comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean mimeAllowEmpty;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray mimeAllowed;

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowEmpty(@Nullable ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
    return this;
  }

  /**
   * Get mimeAllowEmpty
   * @return mimeAllowEmpty
   */
  @Valid 
  @Schema(name = "mime.allowEmpty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mime.allowEmpty")
  public @Nullable ConfigNodePropertyBoolean getMimeAllowEmpty() {
    return mimeAllowEmpty;
  }

  @JsonProperty("mime.allowEmpty")
  public void setMimeAllowEmpty(@Nullable ConfigNodePropertyBoolean mimeAllowEmpty) {
    this.mimeAllowEmpty = mimeAllowEmpty;
  }

  public ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties mimeAllowed(@Nullable ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
    return this;
  }

  /**
   * Get mimeAllowed
   * @return mimeAllowed
   */
  @Valid 
  @Schema(name = "mime.allowed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mime.allowed")
  public @Nullable ConfigNodePropertyArray getMimeAllowed() {
    return mimeAllowed;
  }

  @JsonProperty("mime.allowed")
  public void setMimeAllowed(@Nullable ConfigNodePropertyArray mimeAllowed) {
    this.mimeAllowed = mimeAllowed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties = (ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties) o;
    return Objects.equals(this.mimeAllowEmpty, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowEmpty) &&
        Objects.equals(this.mimeAllowed, comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties.mimeAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeAllowEmpty, mimeAllowed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {\n");
    sb.append("    mimeAllowEmpty: ").append(toIndentedString(mimeAllowEmpty)).append("\n");
    sb.append("    mimeAllowed: ").append(toIndentedString(mimeAllowed)).append("\n");
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

