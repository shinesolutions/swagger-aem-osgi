package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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
  @Valid
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
  @Valid
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
  @Valid
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
    return Objects.equals(cqCommerceCataloggeneratorBucketsize, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketsize) &&
        Objects.equals(cqCommerceCataloggeneratorBucketname, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorBucketname) &&
        Objects.equals(cqCommerceCataloggeneratorExcludedtemplateproperties, comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties.cqCommerceCataloggeneratorExcludedtemplateproperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqCommerceCataloggeneratorBucketsize, cqCommerceCataloggeneratorBucketname, cqCommerceCataloggeneratorExcludedtemplateproperties);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

