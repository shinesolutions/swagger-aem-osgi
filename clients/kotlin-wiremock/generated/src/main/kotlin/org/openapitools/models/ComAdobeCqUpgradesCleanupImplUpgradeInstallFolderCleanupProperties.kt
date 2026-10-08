@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties(
    @field:JsonProperty("delete.name.regexps")
    val deleteNameRegexps: ConfigNodePropertyArray? = null,

)
