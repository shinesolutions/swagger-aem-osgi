package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyFloat
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixEventadminImplEventAdminProperties(
    val orgApacheFelixEventadminThreadPoolSize: ConfigNodePropertyInteger? = null,
    val orgApacheFelixEventadminAsyncToSyncThreadRatio: ConfigNodePropertyFloat? = null,
    val orgApacheFelixEventadminTimeout: ConfigNodePropertyInteger? = null,
    val orgApacheFelixEventadminRequireTopic: ConfigNodePropertyBoolean? = null,
    val orgApacheFelixEventadminIgnoreTimeout: ConfigNodePropertyArray? = null,
    val orgApacheFelixEventadminIgnoreTopic: ConfigNodePropertyArray? = null
)
