package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected;

  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth;

  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight;

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentWidth() {
    return cqDamConfigAnnotationPdfDocumentWidth;
  }

  public void setCqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentHeight() {
    return cqDamConfigAnnotationPdfDocumentHeight;
  }

  public void setCqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingHorizontal() {
    return cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  public void setCqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingVertical() {
    return cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  public void setCqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfFontSize() {
    return cqDamConfigAnnotationPdfFontSize;
  }

  public void setCqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontColor() {
    return cqDamConfigAnnotationPdfFontColor;
  }

  public void setCqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontFamily() {
    return cqDamConfigAnnotationPdfFontFamily;
  }

  public void setCqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontLight() {
    return cqDamConfigAnnotationPdfFontLight;
  }

  public void setCqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMarginTextImage() {
    return cqDamConfigAnnotationPdfMarginTextImage;
  }

  public void setCqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMinImageHeight() {
    return cqDamConfigAnnotationPdfMinImageHeight;
  }

  public void setCqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfReviewStatusWidth() {
    return cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorApproved() {
    return cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorRejected() {
    return cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
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
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested() {
    return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAnnotationMarkerWidth() {
    return cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  public void setCqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
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
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAssetMinheight() {
    return cqDamConfigAnnotationPdfAssetMinheight;
  }

  public void setCqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

