@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqAccountApiAccountManagementServiceProperties(
    @field:JsonProperty("cq.accountmanager.token.validity.period")
    val cqAccountmanagerTokenValidityPeriod: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("cq.accountmanager.config.requestnewaccount.mail")
    val cqAccountmanagerConfigRequestnewaccountMail: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.accountmanager.config.requestnewpwd.mail")
    val cqAccountmanagerConfigRequestnewpwdMail: ConfigNodePropertyString? = null,

)
