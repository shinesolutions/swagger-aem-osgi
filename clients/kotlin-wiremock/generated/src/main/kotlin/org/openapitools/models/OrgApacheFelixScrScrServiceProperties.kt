@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixScrScrServiceProperties(
    @field:JsonProperty("ds.loglevel")
    val dsLoglevel: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("ds.factory.enabled")
    val dsFactoryEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ds.delayed.keepInstances")
    val dsDelayedKeepInstances: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("ds.lock.timeout.milliseconds")
    val dsLockTimeoutMilliseconds: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ds.stop.timeout.milliseconds")
    val dsStopTimeoutMilliseconds: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("ds.global.extender")
    val dsGlobalExtender: ConfigNodePropertyBoolean? = null,

)
