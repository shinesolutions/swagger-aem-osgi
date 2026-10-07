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
 * @param jasperCompilerTargetVM 
 * @param jasperCompilerSourceVM 
 * @param jasperClassdebuginfo 
 * @param jasperEnablePooling 
 * @param jasperIeClassId 
 * @param jasperGenStringAsCharArray 
 * @param jasperKeepgenerated 
 * @param jasperMappedfile 
 * @param jasperTrimSpaces 
 * @param jasperDisplaySourceFragments 
 * @param defaultIsSession 
 */
data class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.compilerTargetVM")
    @get:JsonProperty("jasper.compilerTargetVM") val jasperCompilerTargetVM: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.compilerSourceVM")
    @get:JsonProperty("jasper.compilerSourceVM") val jasperCompilerSourceVM: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.classdebuginfo")
    @get:JsonProperty("jasper.classdebuginfo") val jasperClassdebuginfo: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.enablePooling")
    @get:JsonProperty("jasper.enablePooling") val jasperEnablePooling: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.ieClassId")
    @get:JsonProperty("jasper.ieClassId") val jasperIeClassId: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.genStringAsCharArray")
    @get:JsonProperty("jasper.genStringAsCharArray") val jasperGenStringAsCharArray: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.keepgenerated")
    @get:JsonProperty("jasper.keepgenerated") val jasperKeepgenerated: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.mappedfile")
    @get:JsonProperty("jasper.mappedfile") val jasperMappedfile: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.trimSpaces")
    @get:JsonProperty("jasper.trimSpaces") val jasperTrimSpaces: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("jasper.displaySourceFragments")
    @get:JsonProperty("jasper.displaySourceFragments") val jasperDisplaySourceFragments: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("default.is.session")
    @get:JsonProperty("default.is.session") val defaultIsSession: ConfigNodePropertyBoolean? = null
) {

}

