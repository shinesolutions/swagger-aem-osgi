package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplServletCompanionServletProperties   {

    private ConfigNodePropertyString moreInfo;
    private ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplServletCompanionServletProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplServletCompanionServletProperties.
     *
     * @param moreInfo moreInfo
     * @param mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
     */
    public ComDayCqDamCoreImplServletCompanionServletProperties(
        ConfigNodePropertyString moreInfo, 
        ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
    ) {
        this.moreInfo = moreInfo;
        this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    }



    /**
     * Get moreInfo
     * @return moreInfo
     */
    public ConfigNodePropertyString getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(ConfigNodePropertyString moreInfo) {
        this.moreInfo = moreInfo;
    }

    /**
     * Get mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
     * @return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
     */
    public ConfigNodePropertyString getMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket() {
        return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    }

    public void setMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
        this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplServletCompanionServletProperties {\n");
        
        sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
        sb.append("    mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket: ").append(toIndentedString(mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket)).append("\n");
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

