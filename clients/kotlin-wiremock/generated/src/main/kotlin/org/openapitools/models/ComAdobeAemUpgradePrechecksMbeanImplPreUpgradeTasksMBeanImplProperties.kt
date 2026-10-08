@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(
    @field:JsonProperty("pre-upgrade.maintenance.tasks")
    val preUpgradeMaintenanceTasks: ConfigNodePropertyArray? = null,

    @field:JsonProperty("pre-upgrade.hc.tags")
    val preUpgradeHcTags: ConfigNodePropertyArray? = null,

)
