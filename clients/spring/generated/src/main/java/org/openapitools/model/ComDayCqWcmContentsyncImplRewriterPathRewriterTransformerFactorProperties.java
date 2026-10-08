package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
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
 * ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
 */

@JsonTypeName("comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace;

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingLinks(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerMappingLinks
   * @return cqContentsyncPathrewritertransformerMappingLinks
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.mapping.links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  public @Nullable ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  public void setCqContentsyncPathrewritertransformerMappingLinks(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingClientlibs(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerMappingClientlibs
   * @return cqContentsyncPathrewritertransformerMappingClientlibs
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.mapping.clientlibs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  public @Nullable ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  public void setCqContentsyncPathrewritertransformerMappingClientlibs(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingImages(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerMappingImages
   * @return cqContentsyncPathrewritertransformerMappingImages
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.mapping.images", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  public @Nullable ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  public void setCqContentsyncPathrewritertransformerMappingImages(@Nullable ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerAttributePattern(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerAttributePattern
   * @return cqContentsyncPathrewritertransformerAttributePattern
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.attribute.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  public @Nullable ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  public void setCqContentsyncPathrewritertransformerAttributePattern(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryPattern(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerClientlibraryPattern
   * @return cqContentsyncPathrewritertransformerClientlibraryPattern
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.clientlibrary.pattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  public @Nullable ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryReplace(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
    return this;
  }

  /**
   * Get cqContentsyncPathrewritertransformerClientlibraryReplace
   * @return cqContentsyncPathrewritertransformerClientlibraryReplace
   */
  @Valid 
  @Schema(name = "cq.contentsync.pathrewritertransformer.clientlibrary.replace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  public @Nullable ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryReplace() {
    return cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  public void setCqContentsyncPathrewritertransformerClientlibraryReplace(@Nullable ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties = (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties) o;
    return Objects.equals(this.cqContentsyncPathrewritertransformerMappingLinks, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingLinks) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerMappingClientlibs, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingClientlibs) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerMappingImages, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingImages) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerAttributePattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerAttributePattern) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerClientlibraryPattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryPattern) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerClientlibraryReplace, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryReplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqContentsyncPathrewritertransformerMappingLinks, cqContentsyncPathrewritertransformerMappingClientlibs, cqContentsyncPathrewritertransformerMappingImages, cqContentsyncPathrewritertransformerAttributePattern, cqContentsyncPathrewritertransformerClientlibraryPattern, cqContentsyncPathrewritertransformerClientlibraryReplace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {\n");
    sb.append("    cqContentsyncPathrewritertransformerMappingLinks: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingLinks)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerMappingClientlibs: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingClientlibs)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerMappingImages: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingImages)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerAttributePattern: ").append(toIndentedString(cqContentsyncPathrewritertransformerAttributePattern)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerClientlibraryPattern: ").append(toIndentedString(cqContentsyncPathrewritertransformerClientlibraryPattern)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerClientlibraryReplace: ").append(toIndentedString(cqContentsyncPathrewritertransformerClientlibraryReplace)).append("\n");
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

