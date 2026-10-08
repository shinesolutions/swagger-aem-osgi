package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks;

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs;

  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages;

  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern;

  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern;

  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace;

  /**
   * 
   * @return cqContentsyncPathrewritertransformerMappingLinks
   */
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }

  public void setCqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

  /**
   * 
   * @return cqContentsyncPathrewritertransformerMappingClientlibs
   */
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public void setCqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  /**
   * 
   * @return cqContentsyncPathrewritertransformerMappingImages
   */
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }

  public void setCqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

  /**
   * 
   * @return cqContentsyncPathrewritertransformerAttributePattern
   */
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }

  public void setCqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

  /**
   * 
   * @return cqContentsyncPathrewritertransformerClientlibraryPattern
   */
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  /**
   * 
   * @return cqContentsyncPathrewritertransformerClientlibraryReplace
   */
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
    return Objects.equals(this.cqContentsyncPathrewritertransformerMappingLinks, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingLinks) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerMappingClientlibs, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingClientlibs) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerMappingImages, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerMappingImages) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerAttributePattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerAttributePattern) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerClientlibraryPattern, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryPattern) &&
        Objects.equals(this.cqContentsyncPathrewritertransformerClientlibraryReplace, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.cqContentsyncPathrewritertransformerClientlibraryReplace);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
