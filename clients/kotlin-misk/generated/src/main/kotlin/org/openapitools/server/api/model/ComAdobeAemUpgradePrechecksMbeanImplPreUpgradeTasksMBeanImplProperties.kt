package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties(
    val preUpgradeMaintenanceTasks: ConfigNodePropertyArray? = null,
    val preUpgradeHcTags: ConfigNodePropertyArray? = null
)
