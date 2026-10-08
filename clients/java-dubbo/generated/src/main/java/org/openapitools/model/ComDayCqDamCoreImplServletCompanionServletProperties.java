package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqDamCoreImplServletCompanionServletProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("More Info")
  private ConfigNodePropertyString moreInfo;

  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  private ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;

  /**
   * 
   * @return moreInfo
   */
  public ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }

  public void setMoreInfo(ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  /**
   * 
   * @return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
