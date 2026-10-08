package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param defaultTransportAgentToWorkerPrefix 
 * @param defaultTransportAgentToMasterPrefix 
 * @param defaultTransportInputPackage 
 * @param defaultTransportOutputPackage 
 * @param defaultTransportReplicationSynchronous 
 * @param defaultTransportContentpackage 
 * @param offloadingTransporterDefaultEnabled 
 */
data class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.agent-to-worker.prefix")
    @get:JsonProperty("default.transport.agent-to-worker.prefix") val defaultTransportAgentToWorkerPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.agent-to-master.prefix")
    @get:JsonProperty("default.transport.agent-to-master.prefix") val defaultTransportAgentToMasterPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.input.package")
    @get:JsonProperty("default.transport.input.package") val defaultTransportInputPackage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.output.package")
    @get:JsonProperty("default.transport.output.package") val defaultTransportOutputPackage: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.replication.synchronous")
    @get:JsonProperty("default.transport.replication.synchronous") val defaultTransportReplicationSynchronous: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.transport.contentpackage")
    @get:JsonProperty("default.transport.contentpackage") val defaultTransportContentpackage: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("offloading.transporter.default.enabled")
    @get:JsonProperty("offloading.transporter.default.enabled") val offloadingTransporterDefaultEnabled: ConfigNodePropertyBoolean? = null
) {

}

