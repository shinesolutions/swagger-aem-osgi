package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param cqCommerceCataloggeneratorBucketsize 
 * @param cqCommerceCataloggeneratorBucketname 
 * @param cqCommerceCataloggeneratorExcludedtemplateproperties 
 */
data class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.commerce.cataloggenerator.bucketsize")
    @get:JsonProperty("cq.commerce.cataloggenerator.bucketsize") val cqCommerceCataloggeneratorBucketsize: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.commerce.cataloggenerator.bucketname")
    @get:JsonProperty("cq.commerce.cataloggenerator.bucketname") val cqCommerceCataloggeneratorBucketname: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties")
    @get:JsonProperty("cq.commerce.cataloggenerator.excludedtemplateproperties") val cqCommerceCataloggeneratorExcludedtemplateproperties: ConfigNodePropertyArray? = null
) {

}

