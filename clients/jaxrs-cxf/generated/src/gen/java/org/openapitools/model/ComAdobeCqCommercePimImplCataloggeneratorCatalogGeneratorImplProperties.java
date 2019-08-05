package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
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

public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqCommerceCataloggeneratorBucketname = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties = null;
 /**
   * Get cqCommerceCataloggeneratorBucketsize
   * @return cqCommerceCataloggeneratorBucketsize
  **/
  @JsonProperty("cq.commerce.cataloggenerator.bucketsize")
  public ConfigNodePropertyInteger getCqCommerceCataloggeneratorBucketsize() {
    return cqCommerceCataloggeneratorBucketsize;
  }

  public void setCqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
    return this;
  }

 /**
   * Get cqCommerceCataloggeneratorBucketname
   * @return cqCommerceCataloggeneratorBucketname
  **/
  @JsonProperty("cq.commerce.cataloggenerator.bucketname")
  public ConfigNodePropertyString getCqCommerceCataloggeneratorBucketname() {
    return cqCommerceCataloggeneratorBucketname;
  }

  public void setCqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
    return this;
  }

 /**
   * Get cqCommerceCataloggeneratorExcludedtemplateproperties
   * @return cqCommerceCataloggeneratorExcludedtemplateproperties
  **/
  @JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
  public ConfigNodePropertyArray getCqCommerceCataloggeneratorExcludedtemplateproperties() {
    return cqCommerceCataloggeneratorExcludedtemplateproperties;
  }

  public void setCqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {\n");
    
    sb.append("    cqCommerceCataloggeneratorBucketsize: ").append(toIndentedString(cqCommerceCataloggeneratorBucketsize)).append("\n");
    sb.append("    cqCommerceCataloggeneratorBucketname: ").append(toIndentedString(cqCommerceCataloggeneratorBucketname)).append("\n");
    sb.append("    cqCommerceCataloggeneratorExcludedtemplateproperties: ").append(toIndentedString(cqCommerceCataloggeneratorExcludedtemplateproperties)).append("\n");
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

