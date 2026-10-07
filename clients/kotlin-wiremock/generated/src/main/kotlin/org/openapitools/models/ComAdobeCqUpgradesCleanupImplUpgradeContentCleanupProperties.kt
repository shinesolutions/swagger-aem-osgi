@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(
    @field:JsonProperty("delete.path.regexps")
    val deletePathRegexps: ConfigNodePropertyArray? = null,

    @field:JsonProperty("delete.sql2.query")
    val deleteSql2Query: ConfigNodePropertyString? = null,

)
