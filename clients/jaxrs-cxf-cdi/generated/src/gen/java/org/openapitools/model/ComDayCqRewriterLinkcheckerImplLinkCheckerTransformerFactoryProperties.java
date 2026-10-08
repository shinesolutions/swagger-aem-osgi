package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties   {
  
  private ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting;

  private ConfigNodePropertyBoolean linkcheckertransformerDisableChecking;

  private ConfigNodePropertyInteger linkcheckertransformerMapCacheSize;

  private ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck;

  private ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension;

  private ConfigNodePropertyArray linkcheckertransformerRewriteElements;

  private ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist;

  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.disableRewriting")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableRewriting() {
    return linkcheckertransformerDisableRewriting;
  }
  public void setLinkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.disableChecking")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableChecking() {
    return linkcheckertransformerDisableChecking;
  }
  public void setLinkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.mapCacheSize")
  public ConfigNodePropertyInteger getLinkcheckertransformerMapCacheSize() {
    return linkcheckertransformerMapCacheSize;
  }
  public void setLinkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.strictExtensionCheck")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStrictExtensionCheck() {
    return linkcheckertransformerStrictExtensionCheck;
  }
  public void setLinkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.stripHtmltExtension")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStripHtmltExtension() {
    return linkcheckertransformerStripHtmltExtension;
  }
  public void setLinkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.rewriteElements")
  public ConfigNodePropertyArray getLinkcheckertransformerRewriteElements() {
    return linkcheckertransformerRewriteElements;
  }
  public void setLinkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
  }


  /**
   **/
  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
  public ConfigNodePropertyArray getLinkcheckertransformerStripExtensionPathBlacklist() {
    return linkcheckertransformerStripExtensionPathBlacklist;
  }
  public void setLinkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

