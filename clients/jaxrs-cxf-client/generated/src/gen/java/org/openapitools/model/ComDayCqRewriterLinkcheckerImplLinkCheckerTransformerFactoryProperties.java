package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean linkcheckertransformerDisableChecking = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger linkcheckertransformerMapCacheSize = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray linkcheckertransformerRewriteElements = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist = null;
 /**
   * Get linkcheckertransformerDisableRewriting
   * @return linkcheckertransformerDisableRewriting
  **/
  @JsonProperty("linkcheckertransformer.disableRewriting")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableRewriting() {
    return linkcheckertransformerDisableRewriting;
  }

  public void setLinkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
    return this;
  }

 /**
   * Get linkcheckertransformerDisableChecking
   * @return linkcheckertransformerDisableChecking
  **/
  @JsonProperty("linkcheckertransformer.disableChecking")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableChecking() {
    return linkcheckertransformerDisableChecking;
  }

  public void setLinkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
    return this;
  }

 /**
   * Get linkcheckertransformerMapCacheSize
   * @return linkcheckertransformerMapCacheSize
  **/
  @JsonProperty("linkcheckertransformer.mapCacheSize")
  public ConfigNodePropertyInteger getLinkcheckertransformerMapCacheSize() {
    return linkcheckertransformerMapCacheSize;
  }

  public void setLinkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
    return this;
  }

 /**
   * Get linkcheckertransformerStrictExtensionCheck
   * @return linkcheckertransformerStrictExtensionCheck
  **/
  @JsonProperty("linkcheckertransformer.strictExtensionCheck")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStrictExtensionCheck() {
    return linkcheckertransformerStrictExtensionCheck;
  }

  public void setLinkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
    return this;
  }

 /**
   * Get linkcheckertransformerStripHtmltExtension
   * @return linkcheckertransformerStripHtmltExtension
  **/
  @JsonProperty("linkcheckertransformer.stripHtmltExtension")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStripHtmltExtension() {
    return linkcheckertransformerStripHtmltExtension;
  }

  public void setLinkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
    return this;
  }

 /**
   * Get linkcheckertransformerRewriteElements
   * @return linkcheckertransformerRewriteElements
  **/
  @JsonProperty("linkcheckertransformer.rewriteElements")
  public ConfigNodePropertyArray getLinkcheckertransformerRewriteElements() {
    return linkcheckertransformerRewriteElements;
  }

  public void setLinkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
    return this;
  }

 /**
   * Get linkcheckertransformerStripExtensionPathBlacklist
   * @return linkcheckertransformerStripExtensionPathBlacklist
  **/
  @JsonProperty("linkcheckertransformer.stripExtensionPathBlacklist")
  public ConfigNodePropertyArray getLinkcheckertransformerStripExtensionPathBlacklist() {
    return linkcheckertransformerStripExtensionPathBlacklist;
  }

  public void setLinkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties linkcheckertransformerStripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

