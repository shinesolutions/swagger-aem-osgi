/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.shinesolutions.swaggeraemosgi4j.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyInteger;
import com.shinesolutions.swaggeraemosgi4j.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-27T02:21:59.870Z[GMT]")
public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_WIDTH = "cq.dam.config.annotation.pdf.document.width";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_WIDTH)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_HEIGHT = "cq.dam.config.annotation.pdf.document.height";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_HEIGHT)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_PADDING_HORIZONTAL = "cq.dam.config.annotation.pdf.document.padding.horizontal";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_PADDING_HORIZONTAL)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_PADDING_VERTICAL = "cq.dam.config.annotation.pdf.document.padding.vertical";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_DOCUMENT_PADDING_VERTICAL)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_SIZE = "cq.dam.config.annotation.pdf.font.size";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_SIZE)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_COLOR = "cq.dam.config.annotation.pdf.font.color";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_COLOR)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_FAMILY = "cq.dam.config.annotation.pdf.font.family";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_FAMILY)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_LIGHT = "cq.dam.config.annotation.pdf.font.light";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_FONT_LIGHT)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_MARGIN_TEXT_IMAGE = "cq.dam.config.annotation.pdf.marginTextImage";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_MARGIN_TEXT_IMAGE)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_MIN_IMAGE_HEIGHT = "cq.dam.config.annotation.pdf.minImageHeight";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_MIN_IMAGE_HEIGHT)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_WIDTH = "cq.dam.config.annotation.pdf.reviewStatus.width";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_WIDTH)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_APPROVED = "cq.dam.config.annotation.pdf.reviewStatus.color.approved";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_APPROVED)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_REJECTED = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_REJECTED)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_CHANGES_REQUESTED = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_REVIEW_STATUS_COLOR_CHANGES_REQUESTED)
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_ANNOTATION_MARKER_WIDTH = "cq.dam.config.annotation.pdf.annotationMarker.width";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_ANNOTATION_MARKER_WIDTH)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth = null;

  public static final String SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_ASSET_MINHEIGHT = "cq.dam.config.annotation.pdf.asset.minheight";
  @SerializedName(SERIALIZED_NAME_CQ_DAM_CONFIG_ANNOTATION_PDF_ASSET_MINHEIGHT)
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight = null;

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
    return this;
  }

   /**
   * Get cqDamConfigAnnotationPdfDocumentWidth
   * @return cqDamConfigAnnotationPdfDocumentWidth
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
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
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAssetMinheight() {
    return cqDamConfigAnnotationPdfAssetMinheight;
  }

  public void setCqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
    this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

