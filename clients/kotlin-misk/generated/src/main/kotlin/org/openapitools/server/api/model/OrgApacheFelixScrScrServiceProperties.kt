package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixScrScrServiceProperties(
    val dsLoglevel: ConfigNodePropertyDropDown? = null,
    val dsFactoryEnabled: ConfigNodePropertyBoolean? = null,
    val dsDelayedKeepInstances: ConfigNodePropertyBoolean? = null,
    val dsLockTimeoutMilliseconds: ConfigNodePropertyInteger? = null,
    val dsStopTimeoutMilliseconds: ConfigNodePropertyInteger? = null,
    val dsGlobalExtender: ConfigNodePropertyBoolean? = null
)
