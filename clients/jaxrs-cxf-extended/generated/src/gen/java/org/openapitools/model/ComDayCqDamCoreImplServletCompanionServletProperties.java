package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamCoreImplServletCompanionServletProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString moreInfo;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
 /**
  * Get moreInfo
  * @return moreInfo
  */
  @JsonProperty("More Info")
  public ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }

  /**
   * Sets the <code>moreInfo</code> property.
   */
 public void setMoreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  /**
   * Sets the <code>moreInfo</code> property.
   */
  public ComDayCqDamCoreImplServletCompanionServletProperties moreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

 /**
  * Get mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
  * @return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
  */
  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  public ConfigNodePropertyString getMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket() {
    return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
  }

  /**
   * Sets the <code>mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket</code> property.
   */
 public void setMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
    this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
  }

  /**
   * Sets the <code>mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket</code> property.
   */
  public ComDayCqDamCoreImplServletCompanionServletProperties mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
    this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCompanionServletProperties comDayCqDamCoreImplServletCompanionServletProperties = (ComDayCqDamCoreImplServletCompanionServletProperties) o;
    return Objects.equals(this.moreInfo, comDayCqDamCoreImplServletCompanionServletProperties.moreInfo) &&
        Objects.equals(this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket, comDayCqDamCoreImplServletCompanionServletProperties.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreInfo, mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket);
  }

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

