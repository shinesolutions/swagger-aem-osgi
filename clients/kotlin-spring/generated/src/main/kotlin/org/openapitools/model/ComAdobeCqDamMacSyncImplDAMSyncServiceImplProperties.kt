package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
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
 * @param comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths 
 * @param comAdobeCqDamMacSyncDamsyncserviceSyncRenditions 
 * @param comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs 
 * @param comAdobeCqDamMacSyncDamsyncservicePlatform 
 */
data class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths")
    @get:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths") val comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions")
    @get:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions") val comAdobeCqDamMacSyncDamsyncserviceSyncRenditions: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms")
    @get:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms") val comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform")
    @get:JsonProperty("com.adobe.cq.dam.mac.sync.damsyncservice.platform") val comAdobeCqDamMacSyncDamsyncservicePlatform: ConfigNodePropertyDropDown? = null
) {

}

