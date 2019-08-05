package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqDamCoreImplServletCompanionServletProperties   {
  
  private ConfigNodePropertyString moreInfo = null;
  private ConfigNodePropertyString slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket = null;

  /**
   **/
  public ComDayCqDamCoreImplServletCompanionServletProperties moreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("More Info")
  public ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }
  public void setMoreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  /**
   **/
  public ComDayCqDamCoreImplServletCompanionServletProperties slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket) {
    this.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket = slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
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
    return Objects.equals(moreInfo, comDayCqDamCoreImplServletCompanionServletProperties.moreInfo) &&
        Objects.equals(slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket, comDayCqDamCoreImplServletCompanionServletProperties.slashMntSlashOverlaySlashDamSlashGuiSlashContentSlashAssetsSlashMoreinfoHtmlSlash$LeftCurlyBracketPathRightCurlyBracket);
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

