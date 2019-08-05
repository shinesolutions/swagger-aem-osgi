package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComDayCqDamCoreImplServletCompanionServletProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComDayCqDamCoreImplServletCompanionServletProperties   {
  @JsonProperty("More Info")
  private ConfigNodePropertyString moreInfo = null;

  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  private ConfigNodePropertyString slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket = null;

  public ComDayCqDamCoreImplServletCompanionServletProperties moreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Get moreInfo
   * @return moreInfo
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  public ComDayCqDamCoreImplServletCompanionServletProperties slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket) {
    this.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket = slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket;
    return this;
  }

   /**
   * Get slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket
   * @return slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket() {
    return slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket;
  }

  public void setSlashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket) {
    this.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket = slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamCoreImplServletCompanionServletProperties comDayCqDamCoreImplServletCompanionServletProperties = (ComDayCqDamCoreImplServletCompanionServletProperties) o;
    return Objects.equals(this.moreInfo, comDayCqDamCoreImplServletCompanionServletProperties.moreInfo) &&
        Objects.equals(this.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket, comDayCqDamCoreImplServletCompanionServletProperties.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreInfo, slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamCoreImplServletCompanionServletProperties {\n");
    
    sb.append("    moreInfo: ").append(toIndentedString(moreInfo)).append("\n");
    sb.append("    slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket: ").append(toIndentedString(slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket)).append("\n");
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

