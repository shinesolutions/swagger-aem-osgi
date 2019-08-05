package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight = null;
 /**
   * Get cqDamConfigAnnotationPdfDocumentWidth
   * @return cqDamConfigAnnotationPdfDocumentWidth
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.document.width")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentWidth() {
    return cqDamConfigAnnotationPdfDocumentWidth;
  }

  public void setCqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfDocumentHeight
   * @return cqDamConfigAnnotationPdfDocumentHeight
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.document.height")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentHeight() {
    return cqDamConfigAnnotationPdfDocumentHeight;
  }

  public void setCqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfDocumentPaddingHorizontal
   * @return cqDamConfigAnnotationPdfDocumentPaddingHorizontal
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingHorizontal() {
    return cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  public void setCqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfDocumentPaddingVertical
   * @return cqDamConfigAnnotationPdfDocumentPaddingVertical
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingVertical() {
    return cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  public void setCqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfFontSize
   * @return cqDamConfigAnnotationPdfFontSize
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.font.size")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfFontSize() {
    return cqDamConfigAnnotationPdfFontSize;
  }

  public void setCqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfFontColor
   * @return cqDamConfigAnnotationPdfFontColor
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.font.color")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontColor() {
    return cqDamConfigAnnotationPdfFontColor;
  }

  public void setCqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfFontFamily
   * @return cqDamConfigAnnotationPdfFontFamily
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.font.family")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontFamily() {
    return cqDamConfigAnnotationPdfFontFamily;
  }

  public void setCqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfFontLight
   * @return cqDamConfigAnnotationPdfFontLight
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.font.light")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontLight() {
    return cqDamConfigAnnotationPdfFontLight;
  }

  public void setCqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfMarginTextImage
   * @return cqDamConfigAnnotationPdfMarginTextImage
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMarginTextImage() {
    return cqDamConfigAnnotationPdfMarginTextImage;
  }

  public void setCqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfMinImageHeight
   * @return cqDamConfigAnnotationPdfMinImageHeight
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMinImageHeight() {
    return cqDamConfigAnnotationPdfMinImageHeight;
  }

  public void setCqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfReviewStatusWidth
   * @return cqDamConfigAnnotationPdfReviewStatusWidth
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfReviewStatusWidth() {
    return cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorApproved
   * @return cqDamConfigAnnotationPdfReviewStatusColorApproved
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorApproved() {
    return cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorRejected
   * @return cqDamConfigAnnotationPdfReviewStatusColorRejected
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorRejected() {
    return cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
   * @return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested() {
    return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  public void setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfAnnotationMarkerWidth
   * @return cqDamConfigAnnotationPdfAnnotationMarkerWidth
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAnnotationMarkerWidth() {
    return cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  public void setCqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
    return this;
  }

 /**
   * Get cqDamConfigAnnotationPdfAssetMinheight
   * @return cqDamConfigAnnotationPdfAssetMinheight
  **/
  @JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAssetMinheight() {
    return cqDamConfigAnnotationPdfAssetMinheight;
  }

  public void setCqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
    this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
  }

  public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties cqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
    this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

