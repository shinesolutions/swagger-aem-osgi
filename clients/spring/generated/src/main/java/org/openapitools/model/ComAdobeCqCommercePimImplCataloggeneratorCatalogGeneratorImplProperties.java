package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
 */

@JsonTypeName("comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cqCommerceCataloggeneratorBucketname;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties;

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketsize(@Nullable ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
    return this;
  }

  /**
   * Get cqCommerceCataloggeneratorBucketsize
   * @return cqCommerceCataloggeneratorBucketsize
   */
  @Valid 
  @Schema(name = "cq.commerce.cataloggenerator.bucketsize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.cataloggenerator.bucketsize")
  public @Nullable ConfigNodePropertyInteger getCqCommerceCataloggeneratorBucketsize() {
    return cqCommerceCataloggeneratorBucketsize;
  }

  @JsonProperty("cq.commerce.cataloggenerator.bucketsize")
  public void setCqCommerceCataloggeneratorBucketsize(@Nullable ConfigNodePropertyInteger cqCommerceCataloggeneratorBucketsize) {
    this.cqCommerceCataloggeneratorBucketsize = cqCommerceCataloggeneratorBucketsize;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorBucketname(@Nullable ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
    return this;
  }

  /**
   * Get cqCommerceCataloggeneratorBucketname
   * @return cqCommerceCataloggeneratorBucketname
   */
  @Valid 
  @Schema(name = "cq.commerce.cataloggenerator.bucketname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.cataloggenerator.bucketname")
  public @Nullable ConfigNodePropertyString getCqCommerceCataloggeneratorBucketname() {
    return cqCommerceCataloggeneratorBucketname;
  }

  @JsonProperty("cq.commerce.cataloggenerator.bucketname")
  public void setCqCommerceCataloggeneratorBucketname(@Nullable ConfigNodePropertyString cqCommerceCataloggeneratorBucketname) {
    this.cqCommerceCataloggeneratorBucketname = cqCommerceCataloggeneratorBucketname;
  }

  public ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties cqCommerceCataloggeneratorExcludedtemplateproperties(@Nullable ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
    this.cqCommerceCataloggeneratorExcludedtemplateproperties = cqCommerceCataloggeneratorExcludedtemplateproperties;
    return this;
  }

  /**
   * Get cqCommerceCataloggeneratorExcludedtemplateproperties
   * @return cqCommerceCataloggeneratorExcludedtemplateproperties
   */
  @Valid 
  @Schema(name = "cq.commerce.cataloggenerator.excludedtemplateproperties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
  public @Nullable ConfigNodePropertyArray getCqCommerceCataloggeneratorExcludedtemplateproperties() {
    return cqCommerceCataloggeneratorExcludedtemplateproperties;
  }

  @JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
  public void setCqCommerceCataloggeneratorExcludedtemplateproperties(@Nullable ConfigNodePropertyArray cqCommerceCataloggeneratorExcludedtemplateproperties) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

