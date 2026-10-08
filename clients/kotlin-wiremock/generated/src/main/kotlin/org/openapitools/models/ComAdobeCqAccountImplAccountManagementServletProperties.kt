@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqAccountImplAccountManagementServletProperties(
    @field:JsonProperty("cq.accountmanager.config.informnewaccount.mail")
    val cqAccountmanagerConfigInformnewaccountMail: ConfigNodePropertyString? = null,

    @field:JsonProperty("cq.accountmanager.config.informnewpwd.mail")
    val cqAccountmanagerConfigInformnewpwdMail: ConfigNodePropertyString? = null,

)
