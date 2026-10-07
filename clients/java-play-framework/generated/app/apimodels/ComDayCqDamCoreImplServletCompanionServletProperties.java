package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqDamCoreImplServletCompanionServletProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqDamCoreImplServletCompanionServletProperties   {
  @JsonProperty("More Info")
  @Valid

  private ConfigNodePropertyString moreInfo;

  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  @Valid

  private ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;

  public ComDayCqDamCoreImplServletCompanionServletProperties moreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

   /**
   * Get moreInfo
   * @return moreInfo
  **/
  public ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  public ComDayCqDamCoreImplServletCompanionServletProperties mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
    this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    return this;
  }

   /**
   * Get mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
   * @return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
  **/
  public ConfigNodePropertyString getMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket() {
    return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
  }

  public void setMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
    this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
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
    return Objects.equals(moreInfo, comDayCqDamCoreImplServletCompanionServletProperties.moreInfo) &&
        Objects.equals(mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket, comDayCqDamCoreImplServletCompanionServletProperties.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moreInfo, mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

