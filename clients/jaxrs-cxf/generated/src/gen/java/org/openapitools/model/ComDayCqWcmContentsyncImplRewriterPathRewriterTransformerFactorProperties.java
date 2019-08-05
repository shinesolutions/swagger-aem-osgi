package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace = null;
 /**
   * Get cqContentsyncPathrewritertransformerMappingLinks
   * @return cqContentsyncPathrewritertransformerMappingLinks
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.links")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingLinks() {
    return cqContentsyncPathrewritertransformerMappingLinks;
  }

  public void setCqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingLinks(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingLinks) {
    this.cqContentsyncPathrewritertransformerMappingLinks = cqContentsyncPathrewritertransformerMappingLinks;
    return this;
  }

 /**
   * Get cqContentsyncPathrewritertransformerMappingClientlibs
   * @return cqContentsyncPathrewritertransformerMappingClientlibs
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.clientlibs")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingClientlibs() {
    return cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public void setCqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingClientlibs(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingClientlibs) {
    this.cqContentsyncPathrewritertransformerMappingClientlibs = cqContentsyncPathrewritertransformerMappingClientlibs;
    return this;
  }

 /**
   * Get cqContentsyncPathrewritertransformerMappingImages
   * @return cqContentsyncPathrewritertransformerMappingImages
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.mapping.images")
  public ConfigNodePropertyArray getCqContentsyncPathrewritertransformerMappingImages() {
    return cqContentsyncPathrewritertransformerMappingImages;
  }

  public void setCqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerMappingImages(ConfigNodePropertyArray cqContentsyncPathrewritertransformerMappingImages) {
    this.cqContentsyncPathrewritertransformerMappingImages = cqContentsyncPathrewritertransformerMappingImages;
    return this;
  }

 /**
   * Get cqContentsyncPathrewritertransformerAttributePattern
   * @return cqContentsyncPathrewritertransformerAttributePattern
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.attribute.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerAttributePattern() {
    return cqContentsyncPathrewritertransformerAttributePattern;
  }

  public void setCqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerAttributePattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerAttributePattern) {
    this.cqContentsyncPathrewritertransformerAttributePattern = cqContentsyncPathrewritertransformerAttributePattern;
    return this;
  }

 /**
   * Get cqContentsyncPathrewritertransformerClientlibraryPattern
   * @return cqContentsyncPathrewritertransformerClientlibraryPattern
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.pattern")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryPattern() {
    return cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public void setCqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryPattern(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryPattern) {
    this.cqContentsyncPathrewritertransformerClientlibraryPattern = cqContentsyncPathrewritertransformerClientlibraryPattern;
    return this;
  }

 /**
   * Get cqContentsyncPathrewritertransformerClientlibraryReplace
   * @return cqContentsyncPathrewritertransformerClientlibraryReplace
  **/
  @JsonProperty("cq.contentsync.pathrewritertransformer.clientlibrary.replace")
  public ConfigNodePropertyString getCqContentsyncPathrewritertransformerClientlibraryReplace() {
    return cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

  public void setCqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
  }

  public ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties cqContentsyncPathrewritertransformerClientlibraryReplace(ConfigNodePropertyString cqContentsyncPathrewritertransformerClientlibraryReplace) {
    this.cqContentsyncPathrewritertransformerClientlibraryReplace = cqContentsyncPathrewritertransformerClientlibraryReplace;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

