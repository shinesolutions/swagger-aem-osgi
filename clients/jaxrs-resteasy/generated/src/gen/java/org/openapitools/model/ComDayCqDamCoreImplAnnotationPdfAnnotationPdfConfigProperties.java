package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties   {
  
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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.document.width")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentWidth() {
    return cqDamConfigAnnotationPdfDocumentWidth;
  }
  public void setCqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
    this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.document.height")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentHeight() {
    return cqDamConfigAnnotationPdfDocumentHeight;
  }
  public void setCqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
    this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.horizontal")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingHorizontal() {
    return cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }
  public void setCqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
    this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.document.padding.vertical")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingVertical() {
    return cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }
  public void setCqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
    this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.font.size")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfFontSize() {
    return cqDamConfigAnnotationPdfFontSize;
  }
  public void setCqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
    this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.font.color")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontColor() {
    return cqDamConfigAnnotationPdfFontColor;
  }
  public void setCqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
    this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.font.family")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontFamily() {
    return cqDamConfigAnnotationPdfFontFamily;
  }
  public void setCqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
    this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.font.light")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontLight() {
    return cqDamConfigAnnotationPdfFontLight;
  }
  public void setCqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
    this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.marginTextImage")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMarginTextImage() {
    return cqDamConfigAnnotationPdfMarginTextImage;
  }
  public void setCqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
    this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.minImageHeight")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMinImageHeight() {
    return cqDamConfigAnnotationPdfMinImageHeight;
  }
  public void setCqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
    this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.width")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfReviewStatusWidth() {
    return cqDamConfigAnnotationPdfReviewStatusWidth;
  }
  public void setCqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
    this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.approved")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorApproved() {
    return cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }
  public void setCqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
    this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.rejected")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorRejected() {
    return cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }
  public void setCqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
    this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")
  @Valid
  public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested() {
    return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }
  public void setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
    this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.annotationMarker.width")
  @Valid
  public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAnnotationMarkerWidth() {
    return cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }
  public void setCqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
    this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.dam.config.annotation.pdf.asset.minheight")
  @Valid
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

