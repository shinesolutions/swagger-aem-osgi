package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
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
 * @param inboxImplTypeproviderRegistrypaths 
 * @param inboxImplTypeproviderLegacypaths 
 * @param inboxImplTypeproviderDefaulturlFailureitem 
 * @param inboxImplTypeproviderDefaulturlWorkitem 
 * @param inboxImplTypeproviderDefaulturlTask 
 */
data class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.impl.typeprovider.registrypaths")
    @get:JsonProperty("inbox.impl.typeprovider.registrypaths") val inboxImplTypeproviderRegistrypaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.impl.typeprovider.legacypaths")
    @get:JsonProperty("inbox.impl.typeprovider.legacypaths") val inboxImplTypeproviderLegacypaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
    @get:JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem") val inboxImplTypeproviderDefaulturlFailureitem: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
    @get:JsonProperty("inbox.impl.typeprovider.defaulturl.workitem") val inboxImplTypeproviderDefaulturlWorkitem: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("inbox.impl.typeprovider.defaulturl.task")
    @get:JsonProperty("inbox.impl.typeprovider.defaulturl.task") val inboxImplTypeproviderDefaulturlTask: ConfigNodePropertyString? = null
) {

}

