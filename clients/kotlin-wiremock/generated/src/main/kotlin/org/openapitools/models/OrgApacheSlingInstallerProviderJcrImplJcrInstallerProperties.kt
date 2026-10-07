@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(
    @field:JsonProperty("handler.schemes")
    val handlerSchemes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.jcrinstall.folder.name.regexp")
    val slingJcrinstallFolderNameRegexp: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.jcrinstall.folder.max.depth")
    val slingJcrinstallFolderMaxDepth: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("sling.jcrinstall.search.path")
    val slingJcrinstallSearchPath: ConfigNodePropertyArray? = null,

    @field:JsonProperty("sling.jcrinstall.new.config.path")
    val slingJcrinstallNewConfigPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.jcrinstall.signal.path")
    val slingJcrinstallSignalPath: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.jcrinstall.enable.writeback")
    val slingJcrinstallEnableWriteback: ConfigNodePropertyBoolean? = null,

)
