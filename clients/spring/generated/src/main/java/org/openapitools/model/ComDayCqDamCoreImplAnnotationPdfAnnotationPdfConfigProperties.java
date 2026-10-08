package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
 */

@JsonTypeName("comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight;

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfDocumentWidth
   * @return cqDamConfigAnnotationPdfDocumentWidth
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.document.width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.document.width")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentWidth() {
    return cqDamConfigAnnotationPdfDocumentWidth;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.document.width")
  public void setCqDamConfigAnnotationPdfDocumentWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentHeight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfDocumentHeight
   * @return cqDamConfigAnnotationPdfDocumentHeight
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.document.height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.document.height")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentHeight() {
    return cqDamConfigAnnotationPdfDocumentHeight;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.document.height")
  public void setCqDamConfigAnnotationPdfDocumentHeight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingHorizontal(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfDocumentPaddingHorizontal
   * @return cqDamConfigAnnotationPdfDocumentPaddingHorizontal
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.document.padding.horizontal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingHorizontal() {
    return cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
  public void setCqDamConfigAnnotationPdfDocumentPaddingHorizontal(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingVertical(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfDocumentPaddingVertical
   * @return cqDamConfigAnnotationPdfDocumentPaddingVertical
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.document.padding.vertical", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingVertical() {
    return cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
  public void setCqDamConfigAnnotationPdfDocumentPaddingVertical(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontSize(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfFontSize
   * @return cqDamConfigAnnotationPdfFontSize
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.font.size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.font.size")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfFontSize() {
    return cqDamConfigAnnotationPdfFontSize;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.font.size")
  public void setCqDamConfigAnnotationPdfFontSize(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontColor(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfFontColor
   * @return cqDamConfigAnnotationPdfFontColor
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.font.color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.font.color")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfFontColor() {
    return cqDamConfigAnnotationPdfFontColor;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.font.color")
  public void setCqDamConfigAnnotationPdfFontColor(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontFamily(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfFontFamily
   * @return cqDamConfigAnnotationPdfFontFamily
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.font.family", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.font.family")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfFontFamily() {
    return cqDamConfigAnnotationPdfFontFamily;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.font.family")
  public void setCqDamConfigAnnotationPdfFontFamily(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontLight(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfFontLight
   * @return cqDamConfigAnnotationPdfFontLight
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.font.light", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.font.light")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfFontLight() {
    return cqDamConfigAnnotationPdfFontLight;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.font.light")
  public void setCqDamConfigAnnotationPdfFontLight(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMarginTextImage(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfMarginTextImage
   * @return cqDamConfigAnnotationPdfMarginTextImage
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.marginTextImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMarginTextImage() {
    return cqDamConfigAnnotationPdfMarginTextImage;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
  public void setCqDamConfigAnnotationPdfMarginTextImage(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMinImageHeight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfMinImageHeight
   * @return cqDamConfigAnnotationPdfMinImageHeight
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.minImageHeight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMinImageHeight() {
    return cqDamConfigAnnotationPdfMinImageHeight;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
  public void setCqDamConfigAnnotationPdfMinImageHeight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfReviewStatusWidth
   * @return cqDamConfigAnnotationPdfReviewStatusWidth
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.reviewStatus.width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfReviewStatusWidth() {
    return cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
  public void setCqDamConfigAnnotationPdfReviewStatusWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorApproved(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorApproved
   * @return cqDamConfigAnnotationPdfReviewStatusColorApproved
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.reviewStatus.color.approved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorApproved() {
    return cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
  public void setCqDamConfigAnnotationPdfReviewStatusColorApproved(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorRejected(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorRejected
   * @return cqDamConfigAnnotationPdfReviewStatusColorRejected
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorRejected() {
    return cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
  public void setCqDamConfigAnnotationPdfReviewStatusColorRejected(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorChangesRequested(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
   * @return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
  public @Nullable ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested() {
    return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
  public void setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested(@Nullable ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAnnotationMarkerWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfAnnotationMarkerWidth
   * @return cqDamConfigAnnotationPdfAnnotationMarkerWidth
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.annotationMarker.width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAnnotationMarkerWidth() {
    return cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
  public void setCqDamConfigAnnotationPdfAnnotationMarkerWidth(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAssetMinheight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
    this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
    return this;
  }

  /**
   * Get cqDamConfigAnnotationPdfAssetMinheight
   * @return cqDamConfigAnnotationPdfAssetMinheight
   */
  @Valid 
  @Schema(name = "cq.dam.config.annotation.pdf.asset.minheight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
  public @Nullable ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAssetMinheight() {
    return cqDamConfigAnnotationPdfAssetMinheight;
  }

  @JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
  public void setCqDamConfigAnnotationPdfAssetMinheight(@Nullable ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
    this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties = (ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties) o;
    return Objects.equals(this.cqDamConfigAnnotationPdfDocumentWidth, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfDocumentWidth) &&
        Objects.equals(this.cqDamConfigAnnotationPdfDocumentHeight, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfDocumentHeight) &&
        Objects.equals(this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfDocumentPaddingHorizontal) &&
        Objects.equals(this.cqDamConfigAnnotationPdfDocumentPaddingVertical, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfDocumentPaddingVertical) &&
        Objects.equals(this.cqDamConfigAnnotationPdfFontSize, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfFontSize) &&
        Objects.equals(this.cqDamConfigAnnotationPdfFontColor, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfFontColor) &&
        Objects.equals(this.cqDamConfigAnnotationPdfFontFamily, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfFontFamily) &&
        Objects.equals(this.cqDamConfigAnnotationPdfFontLight, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfFontLight) &&
        Objects.equals(this.cqDamConfigAnnotationPdfMarginTextImage, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfMarginTextImage) &&
        Objects.equals(this.cqDamConfigAnnotationPdfMinImageHeight, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfMinImageHeight) &&
        Objects.equals(this.cqDamConfigAnnotationPdfReviewStatusWidth, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfReviewStatusWidth) &&
        Objects.equals(this.cqDamConfigAnnotationPdfReviewStatusColorApproved, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfReviewStatusColorApproved) &&
        Objects.equals(this.cqDamConfigAnnotationPdfReviewStatusColorRejected, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfReviewStatusColorRejected) &&
        Objects.equals(this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) &&
        Objects.equals(this.cqDamConfigAnnotationPdfAnnotationMarkerWidth, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfAnnotationMarkerWidth) &&
        Objects.equals(this.cqDamConfigAnnotationPdfAssetMinheight, comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.cqDamConfigAnnotationPdfAssetMinheight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamConfigAnnotationPdfDocumentWidth, cqDamConfigAnnotationPdfDocumentHeight, cqDamConfigAnnotationPdfDocumentPaddingHorizontal, cqDamConfigAnnotationPdfDocumentPaddingVertical, cqDamConfigAnnotationPdfFontSize, cqDamConfigAnnotationPdfFontColor, cqDamConfigAnnotationPdfFontFamily, cqDamConfigAnnotationPdfFontLight, cqDamConfigAnnotationPdfMarginTextImage, cqDamConfigAnnotationPdfMinImageHeight, cqDamConfigAnnotationPdfReviewStatusWidth, cqDamConfigAnnotationPdfReviewStatusColorApproved, cqDamConfigAnnotationPdfReviewStatusColorRejected, cqDamConfigAnnotationPdfReviewStatusColorChangesRequested, cqDamConfigAnnotationPdfAnnotationMarkerWidth, cqDamConfigAnnotationPdfAssetMinheight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {\n");
    sb.append("    cqDamConfigAnnotationPdfDocumentWidth: ").append(toIndentedString(cqDamConfigAnnotationPdfDocumentWidth)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfDocumentHeight: ").append(toIndentedString(cqDamConfigAnnotationPdfDocumentHeight)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfDocumentPaddingHorizontal: ").append(toIndentedString(cqDamConfigAnnotationPdfDocumentPaddingHorizontal)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfDocumentPaddingVertical: ").append(toIndentedString(cqDamConfigAnnotationPdfDocumentPaddingVertical)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfFontSize: ").append(toIndentedString(cqDamConfigAnnotationPdfFontSize)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfFontColor: ").append(toIndentedString(cqDamConfigAnnotationPdfFontColor)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfFontFamily: ").append(toIndentedString(cqDamConfigAnnotationPdfFontFamily)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfFontLight: ").append(toIndentedString(cqDamConfigAnnotationPdfFontLight)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfMarginTextImage: ").append(toIndentedString(cqDamConfigAnnotationPdfMarginTextImage)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfMinImageHeight: ").append(toIndentedString(cqDamConfigAnnotationPdfMinImageHeight)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfReviewStatusWidth: ").append(toIndentedString(cqDamConfigAnnotationPdfReviewStatusWidth)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfReviewStatusColorApproved: ").append(toIndentedString(cqDamConfigAnnotationPdfReviewStatusColorApproved)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfReviewStatusColorRejected: ").append(toIndentedString(cqDamConfigAnnotationPdfReviewStatusColorRejected)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfReviewStatusColorChangesRequested: ").append(toIndentedString(cqDamConfigAnnotationPdfReviewStatusColorChangesRequested)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfAnnotationMarkerWidth: ").append(toIndentedString(cqDamConfigAnnotationPdfAnnotationMarkerWidth)).append("\n");
    sb.append("    cqDamConfigAnnotationPdfAssetMinheight: ").append(toIndentedString(cqDamConfigAnnotationPdfAssetMinheight)).append("\n");
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

