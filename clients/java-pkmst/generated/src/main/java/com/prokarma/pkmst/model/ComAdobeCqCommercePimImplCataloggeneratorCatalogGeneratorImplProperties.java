package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties   {
  @JsonProperty("cq.commerce.cataloggenerator.bucketsize")
  private ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize = null;

  @JsonProperty("cq.commerce.cataloggenerator.bucketname")
  private ConfigNodePropertyString cqCommerceCataloggeneratorBucketname = null;

  @JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
  private ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties = null;

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
    return this;
  }

   /**
   * Get cqCommerceCataloggeneratorBucketsize
   * @return cqCommerceCataloggeneratorBucketsize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCqCommerceCataloggeneratorBucketsize() {
    return cqCommerceCataloggeneratorBucketsize;
  }

  public void setCqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
    return this;
  }

   /**
   * Get cqCommerceCataloggeneratorBucketname
   * @return cqCommerceCataloggeneratorBucketname
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCqCommerceCataloggeneratorBucketname() {
    return cqCommerceCataloggeneratorBucketname;
  }

  public void setCqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    return this;
  }

   /**
   * Get cqCommerceCataloggeneratorExcludedtemplateproperties
   * @return cqCommerceCataloggeneratorExcludedtemplateproperties
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqCommerceCataloggeneratorExcludedtemplateproperties() {
    return cqCommerceCataloggeneratorExcludedtemplateproperties;
  }

  public void setCqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties = (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties) o;
    return Objects.equals(this.cqCommerceCataloggeneratorBucketsize, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketsize) &&
        Objects.equals(this.cqCommerceCataloggeneratorBucketname, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketname) &&
        Objects.equals(this.cqCommerceCataloggeneratorExcludedtemplateproperties, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorExcludedtemplateproperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceCataloggeneratorBucketsize, cqCommerceCataloggeneratorBucketname, cqCommerceCataloggeneratorExcludedtemplateproperties);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

