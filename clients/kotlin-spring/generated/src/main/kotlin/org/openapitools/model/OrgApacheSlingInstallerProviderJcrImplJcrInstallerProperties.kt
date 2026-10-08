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
 * @param handlerSchemes 
 * @param slingJcrinstallFolderNameRegexp 
 * @param slingJcrinstallFolderMaxDepth 
 * @param slingJcrinstallSearchPath 
 * @param slingJcrinstallNewConfigPath 
 * @param slingJcrinstallSignalPath 
 * @param slingJcrinstallEnableWriteback 
 */
data class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("handler.schemes")
    @get:JsonProperty("handler.schemes") val handlerSchemes: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.folder.name.regexp")
    @get:JsonProperty("sling.jcrinstall.folder.name.regexp") val slingJcrinstallFolderNameRegexp: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.folder.max.depth")
    @get:JsonProperty("sling.jcrinstall.folder.max.depth") val slingJcrinstallFolderMaxDepth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.search.path")
    @get:JsonProperty("sling.jcrinstall.search.path") val slingJcrinstallSearchPath: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.new.config.path")
    @get:JsonProperty("sling.jcrinstall.new.config.path") val slingJcrinstallNewConfigPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.signal.path")
    @get:JsonProperty("sling.jcrinstall.signal.path") val slingJcrinstallSignalPath: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sling.jcrinstall.enable.writeback")
    @get:JsonProperty("sling.jcrinstall.enable.writeback") val slingJcrinstallEnableWriteback: ConfigNodePropertyBoolean? = null
) {

}

