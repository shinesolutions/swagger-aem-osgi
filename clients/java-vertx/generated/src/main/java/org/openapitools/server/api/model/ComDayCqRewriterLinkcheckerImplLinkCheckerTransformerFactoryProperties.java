package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties   {
  
  private ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting = null;
  private ConfigNodePropertyBoolean linkcheckertransformerDisableChecking = null;
  private ConfigNodePropertyInteger linkcheckertransformerMapCacheSize = null;
  private ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck = null;
  private ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension = null;
  private ConfigNodePropertyArray linkcheckertransformerRewriteElements = null;
  private ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist = null;

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties () {

  }

  public ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties (ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting, ConfigNodePropertyBoolean linkcheckertransformerDisableChecking, ConfigNodePropertyInteger linkcheckertransformerMapCacheSize, ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck, ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension, ConfigNodePropertyArray linkcheckertransformerRewriteElements, ConfigNodePropertyArray linkcheckertransformerStripExtensionPathBlacklist) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
    this.linkcheckertransformerStripExtensionPathBlacklist = linkcheckertransformerStripExtensionPathBlacklist;
  }

    
  @JsonProperty("linkcheckertransformer.disableRewriting")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableRewriting() {
    return linkcheckertransformerDisableRewriting;
  }
  public void setLinkcheckertransformerDisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerDisableRewriting) {
    this.linkcheckertransformerDisableRewriting = linkcheckertransformerDisableRewriting;
  }

    
  @JsonProperty("linkcheckertransformer.disableChecking")
  public ConfigNodePropertyBoolean getLinkcheckertransformerDisableChecking() {
    return linkcheckertransformerDisableChecking;
  }
  public void setLinkcheckertransformerDisableChecking(ConfigNodePropertyBoolean linkcheckertransformerDisableChecking) {
    this.linkcheckertransformerDisableChecking = linkcheckertransformerDisableChecking;
  }

    
  @JsonProperty("linkcheckertransformer.mapCacheSize")
  public ConfigNodePropertyInteger getLinkcheckertransformerMapCacheSize() {
    return linkcheckertransformerMapCacheSize;
  }
  public void setLinkcheckertransformerMapCacheSize(ConfigNodePropertyInteger linkcheckertransformerMapCacheSize) {
    this.linkcheckertransformerMapCacheSize = linkcheckertransformerMapCacheSize;
  }

    
  @JsonProperty("linkcheckertransformer.strictExtensionCheck")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStrictExtensionCheck() {
    return linkcheckertransformerStrictExtensionCheck;
  }
  public void setLinkcheckertransformerStrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerStrictExtensionCheck) {
    this.linkcheckertransformerStrictExtensionCheck = linkcheckertransformerStrictExtensionCheck;
  }

    
  @JsonProperty("linkcheckertransformer.stripHtmltExtension")
  public ConfigNodePropertyBoolean getLinkcheckertransformerStripHtmltExtension() {
    return linkcheckertransformerStripHtmltExtension;
  }
  public void setLinkcheckertransformerStripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerStripHtmltExtension) {
    this.linkcheckertransformerStripHtmltExtension = linkcheckertransformerStripHtmltExtension;
  }

    
  @JsonProperty("linkcheckertransformer.rewriteElements")
  public ConfigNodePropertyArray getLinkcheckertransformerRewriteElements() {
    return linkcheckertransformerRewriteElements;
  }
  public void setLinkcheckertransformerRewriteElements(ConfigNodePropertyArray linkcheckertransformerRewriteElements) {
    this.linkcheckertransformerRewriteElements = linkcheckertransformerRewriteElements;
  }

    
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
    return Objects.equals(linkcheckertransformerDisableRewriting, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerDisableRewriting) &&
        Objects.equals(linkcheckertransformerDisableChecking, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerDisableChecking) &&
        Objects.equals(linkcheckertransformerMapCacheSize, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerMapCacheSize) &&
        Objects.equals(linkcheckertransformerStrictExtensionCheck, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStrictExtensionCheck) &&
        Objects.equals(linkcheckertransformerStripHtmltExtension, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStripHtmltExtension) &&
        Objects.equals(linkcheckertransformerRewriteElements, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerRewriteElements) &&
        Objects.equals(linkcheckertransformerStripExtensionPathBlacklist, comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.linkcheckertransformerStripExtensionPathBlacklist);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
