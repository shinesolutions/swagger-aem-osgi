@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties(
    @field:JsonProperty("cq.dam.webdav.version.linking.enable")
    val cqDamWebdavVersionLinkingEnable: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.dam.webdav.version.linking.scheduler.period")
    val cqDamWebdavVersionLinkingSchedulerPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.dam.webdav.version.linking.staging.timeout")
    val cqDamWebdavVersionLinkingStagingTimeout: ConfigNodePropertyInteger? = null,

)
