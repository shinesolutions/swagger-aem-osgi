package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param connectorPingTimeout 
 * @param connectorPingInterval 
 * @param discoveryLiteCheckInterval 
 * @param clusterSyncServiceTimeout 
 * @param clusterSyncServiceInterval 
 * @param enableSyncToken 
 * @param minEventDelay 
 * @param socketConnectTimeout 
 * @param soTimeout 
 * @param topologyConnectorUrls 
 * @param topologyConnectorWhitelist 
 * @param autoStopLocalLoopEnabled 
 * @param gzipConnectorRequestsEnabled 
 * @param hmacEnabled 
 * @param enableEncryption 
 * @param sharedKey 
 * @param hmacSharedKeyTTL 
 * @param backoffStandbyFactor 
 * @param backoffStableFactor 
 */
data class OrgApacheSlingDiscoveryOakConfigProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connectorPingTimeout")
    @get:JsonProperty("connectorPingTimeout") val connectorPingTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("connectorPingInterval")
    @get:JsonProperty("connectorPingInterval") val connectorPingInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("discoveryLiteCheckInterval")
    @get:JsonProperty("discoveryLiteCheckInterval") val discoveryLiteCheckInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("clusterSyncServiceTimeout")
    @get:JsonProperty("clusterSyncServiceTimeout") val clusterSyncServiceTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("clusterSyncServiceInterval")
    @get:JsonProperty("clusterSyncServiceInterval") val clusterSyncServiceInterval: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableSyncToken")
    @get:JsonProperty("enableSyncToken") val enableSyncToken: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("minEventDelay")
    @get:JsonProperty("minEventDelay") val minEventDelay: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("socketConnectTimeout")
    @get:JsonProperty("socketConnectTimeout") val socketConnectTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("soTimeout")
    @get:JsonProperty("soTimeout") val soTimeout: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("topologyConnectorUrls")
    @get:JsonProperty("topologyConnectorUrls") val topologyConnectorUrls: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("topologyConnectorWhitelist")
    @get:JsonProperty("topologyConnectorWhitelist") val topologyConnectorWhitelist: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("autoStopLocalLoopEnabled")
    @get:JsonProperty("autoStopLocalLoopEnabled") val autoStopLocalLoopEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("gzipConnectorRequestsEnabled")
    @get:JsonProperty("gzipConnectorRequestsEnabled") val gzipConnectorRequestsEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hmacEnabled")
    @get:JsonProperty("hmacEnabled") val hmacEnabled: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableEncryption")
    @get:JsonProperty("enableEncryption") val enableEncryption: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sharedKey")
    @get:JsonProperty("sharedKey") val sharedKey: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hmacSharedKeyTTL")
    @get:JsonProperty("hmacSharedKeyTTL") val hmacSharedKeyTTL: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("backoffStandbyFactor")
    @get:JsonProperty("backoffStandbyFactor") val backoffStandbyFactor: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("backoffStableFactor")
    @get:JsonProperty("backoffStableFactor") val backoffStableFactor: ConfigNodePropertyString? = null
) {

}

