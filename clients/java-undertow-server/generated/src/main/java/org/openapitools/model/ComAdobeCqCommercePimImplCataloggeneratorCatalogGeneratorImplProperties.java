/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-10-07T12:53:42.280804918Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties   {
  
  private ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize;
  private ConfigNodePropertyString cqCommerceCataloggeneratorBucketname;
  private ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties;

  /**
   */
  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.cataloggenerator.bucketsize")
  public ConfigNodePropertyInteger getCqCommerceCataloggeneratorBucketsize() {
    return cqCommerceCataloggeneratorBucketsize;
  }
  public void setCqCommerceCataloggeneratorBucketsize(ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
  }

  /**
   */
  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.cataloggenerator.bucketname")
  public ConfigNodePropertyString getCqCommerceCataloggeneratorBucketname() {
    return cqCommerceCataloggeneratorBucketname;
  }
  public void setCqCommerceCataloggeneratorBucketname(ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
  }

  /**
   */
  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
  public ConfigNodePropertyArray getCqCommerceCataloggeneratorExcludedtemplateproperties() {
    return cqCommerceCataloggeneratorExcludedtemplateproperties;
  }
  public void setCqCommerceCataloggeneratorExcludedtemplateproperties(ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties = (ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties) o;
    return Objects.equals(cqCommerceCataloggeneratorBucketsize, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketsize) &&
        Objects.equals(cqCommerceCataloggeneratorBucketname, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketname) &&
        Objects.equals(cqCommerceCataloggeneratorExcludedtemplateproperties, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorExcludedtemplateproperties);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

