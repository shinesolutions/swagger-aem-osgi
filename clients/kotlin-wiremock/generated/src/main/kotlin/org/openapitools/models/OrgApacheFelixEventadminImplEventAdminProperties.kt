@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixEventadminImplEventAdminProperties(
    @field:JsonProperty("org.apache.felix.eventadmin.ThreadPoolSize")
    val orgApacheFelixEventadminThreadPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.eventadmin.AsyncToSyncThreadRatio")
    val orgApacheFelixEventadminAsyncToSyncThreadRatio: ConfigNodePropertyFloat? = null,

    @field:JsonProperty("org.apache.felix.eventadmin.Timeout")
    val orgApacheFelixEventadminTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("org.apache.felix.eventadmin.RequireTopic")
    val orgApacheFelixEventadminRequireTopic: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("org.apache.felix.eventadmin.IgnoreTimeout")
    val orgApacheFelixEventadminIgnoreTimeout: ConfigNodePropertyArray? = null,

    @field:JsonProperty("org.apache.felix.eventadmin.IgnoreTopic")
    val orgApacheFelixEventadminIgnoreTopic: ConfigNodePropertyArray? = null,

)
