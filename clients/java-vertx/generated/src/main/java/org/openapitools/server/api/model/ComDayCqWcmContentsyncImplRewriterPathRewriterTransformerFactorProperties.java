package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties   {
  
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks = null;
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs = null;
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace = null;

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties () {

  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties (ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks, ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs, ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages, ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern, ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern, ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }
  public void setCqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }
  public void setCqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }
  public void setCqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }
  public void setCqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }
  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

    
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryReplace() {
    return cqContentsyncPathrewritertransformerClientlibraryReplace;
  }
  public void setCqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties = (ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties) o;
    return Objects.equals(cqContentsyncPathrewritertransformerMappingLinks, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingLinks) &&
        Objects.equals(cqContentsyncPathrewritertransformerMappingClientlibs, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingClientlibs) &&
        Objects.equals(cqContentsyncPathrewritertransformerMappingImages, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingImages) &&
        Objects.equals(cqContentsyncPathrewritertransformerAttributePattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerAttributePattern) &&
        Objects.equals(cqContentsyncPathrewritertransformerClientlibraryPattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryPattern) &&
        Objects.equals(cqContentsyncPathrewritertransformerClientlibraryReplace, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryReplace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqContentsyncPathrewritertransformerMappingLinks, cqContentsyncPathrewritertransformerMappingClientlibs, cqContentsyncPathrewritertransformerMappingImages, cqContentsyncPathrewritertransformerAttributePattern, cqContentsyncPathrewritertransformerClientlibraryPattern, cqContentsyncPathrewritertransformerClientlibraryReplace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {\n");
    
    sb.append("    cqContentsyncPathrewritertransformerMappingLinks: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingLinks)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerMappingClientlibs: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingClientlibs)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerMappingImages: ").append(toIndentedString(cqContentsyncPathrewritertransformerMappingImages)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerAttributePattern: ").append(toIndentedString(cqContentsyncPathrewritertransformerAttributePattern)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerClientlibraryPattern: ").append(toIndentedString(cqContentsyncPathrewritertransformerClientlibraryPattern)).append("\n");
    sb.append("    cqContentsyncPathrewritertransformerClientlibraryReplace: ").append(toIndentedString(cqContentsyncPathrewritertransformerClientlibraryReplace)).append("\n");
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
