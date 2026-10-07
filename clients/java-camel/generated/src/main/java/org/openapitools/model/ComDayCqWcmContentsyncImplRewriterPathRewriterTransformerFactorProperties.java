package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {

  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks;

  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs;

  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages;

  private ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern;

  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern;

  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace;

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
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
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }

  public void setCqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
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
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public void setCqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
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
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }

  public void setCqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
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
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }

  public void setCqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
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
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
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
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryReplace() {
    return cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

  public void setCqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

