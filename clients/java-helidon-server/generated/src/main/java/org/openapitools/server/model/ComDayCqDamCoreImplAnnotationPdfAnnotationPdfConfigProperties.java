package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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
     * Default constructor.
     */
    public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.
     *
     * @param cqDamConfigAnnotationPdfDocumentWidth cqDamConfigAnnotationPdfDocumentWidth
     * @param cqDamConfigAnnotationPdfDocumentHeight cqDamConfigAnnotationPdfDocumentHeight
     * @param cqDamConfigAnnotationPdfDocumentPaddingHorizontal cqDamConfigAnnotationPdfDocumentPaddingHorizontal
     * @param cqDamConfigAnnotationPdfDocumentPaddingVertical cqDamConfigAnnotationPdfDocumentPaddingVertical
     * @param cqDamConfigAnnotationPdfFontSize cqDamConfigAnnotationPdfFontSize
     * @param cqDamConfigAnnotationPdfFontColor cqDamConfigAnnotationPdfFontColor
     * @param cqDamConfigAnnotationPdfFontFamily cqDamConfigAnnotationPdfFontFamily
     * @param cqDamConfigAnnotationPdfFontLight cqDamConfigAnnotationPdfFontLight
     * @param cqDamConfigAnnotationPdfMarginTextImage cqDamConfigAnnotationPdfMarginTextImage
     * @param cqDamConfigAnnotationPdfMinImageHeight cqDamConfigAnnotationPdfMinImageHeight
     * @param cqDamConfigAnnotationPdfReviewStatusWidth cqDamConfigAnnotationPdfReviewStatusWidth
     * @param cqDamConfigAnnotationPdfReviewStatusColorApproved cqDamConfigAnnotationPdfReviewStatusColorApproved
     * @param cqDamConfigAnnotationPdfReviewStatusColorRejected cqDamConfigAnnotationPdfReviewStatusColorRejected
     * @param cqDamConfigAnnotationPdfReviewStatusColorChangesRequested cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
     * @param cqDamConfigAnnotationPdfAnnotationMarkerWidth cqDamConfigAnnotationPdfAnnotationMarkerWidth
     * @param cqDamConfigAnnotationPdfAssetMinheight cqDamConfigAnnotationPdfAssetMinheight
     */
    public ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties(
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected, 
        ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth, 
        ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight
    ) {
        this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
        this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
        this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
        this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
        this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
        this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
        this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
        this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
        this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
        this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
        this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
        this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
        this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
        this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
        this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
        this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
    }



    /**
     * Get cqDamConfigAnnotationPdfDocumentWidth
     * @return cqDamConfigAnnotationPdfDocumentWidth
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentWidth() {
        return cqDamConfigAnnotationPdfDocumentWidth;
    }

    public void setCqDamConfigAnnotationPdfDocumentWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentWidth) {
        this.cqDamConfigAnnotationPdfDocumentWidth = cqDamConfigAnnotationPdfDocumentWidth;
    }

    /**
     * Get cqDamConfigAnnotationPdfDocumentHeight
     * @return cqDamConfigAnnotationPdfDocumentHeight
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentHeight() {
        return cqDamConfigAnnotationPdfDocumentHeight;
    }

    public void setCqDamConfigAnnotationPdfDocumentHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentHeight) {
        this.cqDamConfigAnnotationPdfDocumentHeight = cqDamConfigAnnotationPdfDocumentHeight;
    }

    /**
     * Get cqDamConfigAnnotationPdfDocumentPaddingHorizontal
     * @return cqDamConfigAnnotationPdfDocumentPaddingHorizontal
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingHorizontal() {
        return cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
    }

    public void setCqDamConfigAnnotationPdfDocumentPaddingHorizontal(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingHorizontal) {
        this.cqDamConfigAnnotationPdfDocumentPaddingHorizontal = cqDamConfigAnnotationPdfDocumentPaddingHorizontal;
    }

    /**
     * Get cqDamConfigAnnotationPdfDocumentPaddingVertical
     * @return cqDamConfigAnnotationPdfDocumentPaddingVertical
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfDocumentPaddingVertical() {
        return cqDamConfigAnnotationPdfDocumentPaddingVertical;
    }

    public void setCqDamConfigAnnotationPdfDocumentPaddingVertical(ConfigNodePropertyInteger cqDamConfigAnnotationPdfDocumentPaddingVertical) {
        this.cqDamConfigAnnotationPdfDocumentPaddingVertical = cqDamConfigAnnotationPdfDocumentPaddingVertical;
    }

    /**
     * Get cqDamConfigAnnotationPdfFontSize
     * @return cqDamConfigAnnotationPdfFontSize
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfFontSize() {
        return cqDamConfigAnnotationPdfFontSize;
    }

    public void setCqDamConfigAnnotationPdfFontSize(ConfigNodePropertyInteger cqDamConfigAnnotationPdfFontSize) {
        this.cqDamConfigAnnotationPdfFontSize = cqDamConfigAnnotationPdfFontSize;
    }

    /**
     * Get cqDamConfigAnnotationPdfFontColor
     * @return cqDamConfigAnnotationPdfFontColor
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontColor() {
        return cqDamConfigAnnotationPdfFontColor;
    }

    public void setCqDamConfigAnnotationPdfFontColor(ConfigNodePropertyString cqDamConfigAnnotationPdfFontColor) {
        this.cqDamConfigAnnotationPdfFontColor = cqDamConfigAnnotationPdfFontColor;
    }

    /**
     * Get cqDamConfigAnnotationPdfFontFamily
     * @return cqDamConfigAnnotationPdfFontFamily
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontFamily() {
        return cqDamConfigAnnotationPdfFontFamily;
    }

    public void setCqDamConfigAnnotationPdfFontFamily(ConfigNodePropertyString cqDamConfigAnnotationPdfFontFamily) {
        this.cqDamConfigAnnotationPdfFontFamily = cqDamConfigAnnotationPdfFontFamily;
    }

    /**
     * Get cqDamConfigAnnotationPdfFontLight
     * @return cqDamConfigAnnotationPdfFontLight
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfFontLight() {
        return cqDamConfigAnnotationPdfFontLight;
    }

    public void setCqDamConfigAnnotationPdfFontLight(ConfigNodePropertyString cqDamConfigAnnotationPdfFontLight) {
        this.cqDamConfigAnnotationPdfFontLight = cqDamConfigAnnotationPdfFontLight;
    }

    /**
     * Get cqDamConfigAnnotationPdfMarginTextImage
     * @return cqDamConfigAnnotationPdfMarginTextImage
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMarginTextImage() {
        return cqDamConfigAnnotationPdfMarginTextImage;
    }

    public void setCqDamConfigAnnotationPdfMarginTextImage(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMarginTextImage) {
        this.cqDamConfigAnnotationPdfMarginTextImage = cqDamConfigAnnotationPdfMarginTextImage;
    }

    /**
     * Get cqDamConfigAnnotationPdfMinImageHeight
     * @return cqDamConfigAnnotationPdfMinImageHeight
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfMinImageHeight() {
        return cqDamConfigAnnotationPdfMinImageHeight;
    }

    public void setCqDamConfigAnnotationPdfMinImageHeight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfMinImageHeight) {
        this.cqDamConfigAnnotationPdfMinImageHeight = cqDamConfigAnnotationPdfMinImageHeight;
    }

    /**
     * Get cqDamConfigAnnotationPdfReviewStatusWidth
     * @return cqDamConfigAnnotationPdfReviewStatusWidth
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfReviewStatusWidth() {
        return cqDamConfigAnnotationPdfReviewStatusWidth;
    }

    public void setCqDamConfigAnnotationPdfReviewStatusWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfReviewStatusWidth) {
        this.cqDamConfigAnnotationPdfReviewStatusWidth = cqDamConfigAnnotationPdfReviewStatusWidth;
    }

    /**
     * Get cqDamConfigAnnotationPdfReviewStatusColorApproved
     * @return cqDamConfigAnnotationPdfReviewStatusColorApproved
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorApproved() {
        return cqDamConfigAnnotationPdfReviewStatusColorApproved;
    }

    public void setCqDamConfigAnnotationPdfReviewStatusColorApproved(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorApproved) {
        this.cqDamConfigAnnotationPdfReviewStatusColorApproved = cqDamConfigAnnotationPdfReviewStatusColorApproved;
    }

    /**
     * Get cqDamConfigAnnotationPdfReviewStatusColorRejected
     * @return cqDamConfigAnnotationPdfReviewStatusColorRejected
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorRejected() {
        return cqDamConfigAnnotationPdfReviewStatusColorRejected;
    }

    public void setCqDamConfigAnnotationPdfReviewStatusColorRejected(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorRejected) {
        this.cqDamConfigAnnotationPdfReviewStatusColorRejected = cqDamConfigAnnotationPdfReviewStatusColorRejected;
    }

    /**
     * Get cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
     * @return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested
     */
    public ConfigNodePropertyString getCqDamConfigAnnotationPdfReviewStatusColorChangesRequested() {
        return cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
    }

    public void setCqDamConfigAnnotationPdfReviewStatusColorChangesRequested(ConfigNodePropertyString cqDamConfigAnnotationPdfReviewStatusColorChangesRequested) {
        this.cqDamConfigAnnotationPdfReviewStatusColorChangesRequested = cqDamConfigAnnotationPdfReviewStatusColorChangesRequested;
    }

    /**
     * Get cqDamConfigAnnotationPdfAnnotationMarkerWidth
     * @return cqDamConfigAnnotationPdfAnnotationMarkerWidth
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAnnotationMarkerWidth() {
        return cqDamConfigAnnotationPdfAnnotationMarkerWidth;
    }

    public void setCqDamConfigAnnotationPdfAnnotationMarkerWidth(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAnnotationMarkerWidth) {
        this.cqDamConfigAnnotationPdfAnnotationMarkerWidth = cqDamConfigAnnotationPdfAnnotationMarkerWidth;
    }

    /**
     * Get cqDamConfigAnnotationPdfAssetMinheight
     * @return cqDamConfigAnnotationPdfAssetMinheight
     */
    public ConfigNodePropertyInteger getCqDamConfigAnnotationPdfAssetMinheight() {
        return cqDamConfigAnnotationPdfAssetMinheight;
    }

    public void setCqDamConfigAnnotationPdfAssetMinheight(ConfigNodePropertyInteger cqDamConfigAnnotationPdfAssetMinheight) {
        this.cqDamConfigAnnotationPdfAssetMinheight = cqDamConfigAnnotationPdfAssetMinheight;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

