package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2019-08-05T00:56:20.785Z[GMT]")
public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties   {
  
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks = null;
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs = null;
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern = null;
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace = null;

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }
  public void setCqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }
  public void setCqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }
  public void setCqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }
  public void setCqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }
  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  /**
   **/
  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryReplace() {
    return cqContentsyncPathrewritertransformerClientlibraryReplace;
  }
  public void setCqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

