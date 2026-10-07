package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamCoreImplServletCompanionServletProperties
 */

@JsonTypeName("comDayCqDamCoreImplServletCompanionServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamCoreImplServletCompanionServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString moreInfo;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;

  public ComDayCqDamCoreImplServletCompanionServletProperties moreInfo(@Nullable ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
    return this;
  }

  /**
   * Get moreInfo
   * @return moreInfo
   */
  @Valid 
  @Schema(name = "More Info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("More Info")
  public @Nullable ConfigNodePropertyString getMoreInfo() {
    return moreInfo;
  }

  @JsonProperty("More Info")
  public void setMoreInfo(@Nullable ConfigNodePropertyString moreInfo) {
    this.moreInfo = moreInfo;
  }

  public ComDayCqDamCoreImplServletCompanionServletProperties mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(@Nullable ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
    this.mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket = mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
    return this;
  }

  /**
   * Get mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
   * @return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket
   */
  @Valid 
  @Schema(name = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  public @Nullable ConfigNodePropertyString getMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket() {
    return mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket;
  }

  @JsonProperty("/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}")
  public void setMntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket(@Nullable ConfigNodePropertyString mntOverlayDamGuiContentAssetsMoreinfoHtml$LeftCurlyBracketPathRightCurlyBracket) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

