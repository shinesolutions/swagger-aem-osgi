package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
 */

@JsonTypeName("comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableChecking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger linkcheckertransformerMapCacheSize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray linkcheckertransformerRewriteElements;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableRewriting(@Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
    return this;
  }

  /**
   * Get linkcheckertransformerDisableRewriting
   * @return linkcheckertransformerDisableRewriting
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.disableRewriting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.disableRewriting")
  public @Nullable ConfigNodePropertyBoolean getLinkcheckertransformerDisableRewriting() {
    return linkcheckertransformerDisableRewriting;
  }

  @JsonProperty("linkcheckertransformer.disableRewriting")
  public void setLinkcheckertransformerDisableRewriting(@Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableChecking(@Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
    return this;
  }

  /**
   * Get linkcheckertransformerDisableChecking
   * @return linkcheckertransformerDisableChecking
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.disableChecking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.disableChecking")
  public @Nullable ConfigNodePropertyBoolean getLinkcheckertransformerDisableChecking() {
    return linkcheckertransformerDisableChecking;
  }

  @JsonProperty("linkcheckertransformer.disableChecking")
  public void setLinkcheckertransformerDisableChecking(@Nullable ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerMapCacheSize(@Nullable ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
    return this;
  }

  /**
   * Get linkcheckertransformerMapCacheSize
   * @return linkcheckertransformerMapCacheSize
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.mapCacheSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.mapCacheSize")
  public @Nullable ConfigNodePropertyInteger getLinkcheckertransformerMapCacheSize() {
    return linkcheckertransformerMapCacheSize;
  }

  @JsonProperty("linkcheckertransformer.mapCacheSize")
  public void setLinkcheckertransformerMapCacheSize(@Nullable ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStrictExtensionCheck(@Nullable ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
    return this;
  }

  /**
   * Get linkcheckertransformerStrictExtensionCheck
   * @return linkcheckertransformerStrictExtensionCheck
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.strictExtensionCheck", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.strictExtensionCheck")
  public @Nullable ConfigNodePropertyBoolean getLinkcheckertransformerStrictExtensionCheck() {
    return linkcheckertransformerStrictExtensionCheck;
  }

  @JsonProperty("linkcheckertransformer.strictExtensionCheck")
  public void setLinkcheckertransformerStrictExtensionCheck(@Nullable ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripHtmltExtension(@Nullable ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
    return this;
  }

  /**
   * Get linkcheckertransformerStripHtmltExtension
   * @return linkcheckertransformerStripHtmltExtension
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.stripHtmltExtension", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.stripHtmltExtension")
  public @Nullable ConfigNodePropertyBoolean getLinkcheckertransformerStripHtmltExtension() {
    return linkcheckertransformerStripHtmltExtension;
  }

  @JsonProperty("linkcheckertransformer.stripHtmltExtension")
  public void setLinkcheckertransformerStripHtmltExtension(@Nullable ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerRewriteElements(@Nullable ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
    return this;
  }

  /**
   * Get linkcheckertransformerRewriteElements
   * @return linkcheckertransformerRewriteElements
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.rewriteElements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.rewriteElements")
  public @Nullable ConfigNodePropertyArray getLinkcheckertransformerRewriteElements() {
    return linkcheckertransformerRewriteElements;
  }

  @JsonProperty("linkcheckertransformer.rewriteElements")
  public void setLinkcheckertransformerRewriteElements(@Nullable ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripExtensionPathBlacklist(@Nullable ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
    return this;
  }

  /**
   * Get linkcheckertransformerStripExtensionPathBlacklist
   * @return linkcheckertransformerStripExtensionPathBlacklist
   */
  @Valid 
  @Schema(name = "linkcheckertransformer.stripExtensionPathBlacklist", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
  public @Nullable ConfigNodePropertyArray getLinkcheckertransformerStripExtensionPathBlacklist() {
    return linkcheckertransformerStripExtensionPathBlacklist;
  }

  @JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
  public void setLinkcheckertransformerStripExtensionPathBlacklist(@Nullable ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties = (ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties) o;
    return Objects.equals(this.linkcheckertransformerDisableRewriting, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerDisableRewriting) &&
        Objects.equals(this.linkcheckertransformerDisableChecking, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerDisableChecking) &&
        Objects.equals(this.linkcheckertransformerMapCacheSize, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerMapCacheSize) &&
        Objects.equals(this.linkcheckertransformerStrictExtensionCheck, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStrictExtensionCheck) &&
        Objects.equals(this.linkcheckertransformerStripHtmltExtension, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStripHtmltExtension) &&
        Objects.equals(this.linkcheckertransformerRewriteElements, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerRewriteElements) &&
        Objects.equals(this.linkcheckertransformerStripExtensionPathBlacklist, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStripExtensionPathBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkcheckertransformerDisableRewriting, linkcheckertransformerDisableChecking, linkcheckertransformerMapCacheSize, linkcheckertransformerStrictExtensionCheck, linkcheckertransformerStripHtmltExtension, linkcheckertransformerRewriteElements, linkcheckertransformerStripExtensionPathBlacklist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {\n");
    sb.append("    linkcheckertransformerDisableRewriting: ").append(toIndentedString(linkcheckertransformerDisableRewriting)).append("\n");
    sb.append("    linkcheckertransformerDisableChecking: ").append(toIndentedString(linkcheckertransformerDisableChecking)).append("\n");
    sb.append("    linkcheckertransformerMapCacheSize: ").append(toIndentedString(linkcheckertransformerMapCacheSize)).append("\n");
    sb.append("    linkcheckertransformerStrictExtensionCheck: ").append(toIndentedString(linkcheckertransformerStrictExtensionCheck)).append("\n");
    sb.append("    linkcheckertransformerStripHtmltExtension: ").append(toIndentedString(linkcheckertransformerStripHtmltExtension)).append("\n");
    sb.append("    linkcheckertransformerRewriteElements: ").append(toIndentedString(linkcheckertransformerRewriteElements)).append("\n");
    sb.append("    linkcheckertransformerStripExtensionPathBlacklist: ").append(toIndentedString(linkcheckertransformerStripExtensionPathBlacklist)).append("\n");
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

