@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(
    @field:JsonProperty("jasper.compilerTargetVM")
    val jasperCompilerTargetVM: ConfigNodePropertyString? = null,

    @field:JsonProperty("jasper.compilerSourceVM")
    val jasperCompilerSourceVM: ConfigNodePropertyString? = null,

    @field:JsonProperty("jasper.classdebuginfo")
    val jasperClassdebuginfo: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.enablePooling")
    val jasperEnablePooling: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.ieClassId")
    val jasperIeClassId: ConfigNodePropertyString? = null,

    @field:JsonProperty("jasper.genStringAsCharArray")
    val jasperGenStringAsCharArray: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.keepgenerated")
    val jasperKeepgenerated: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.mappedfile")
    val jasperMappedfile: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.trimSpaces")
    val jasperTrimSpaces: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("jasper.displaySourceFragments")
    val jasperDisplaySourceFragments: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("default.is.session")
    val defaultIsSession: ConfigNodePropertyBoolean? = null,

)
