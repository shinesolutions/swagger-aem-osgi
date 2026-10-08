@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
    @field:JsonProperty("parameter.whitelist")
    val parameterWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("parameter.whitelist.prefixes")
    val parameterWhitelistPrefixes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("binary.parameter.whitelist")
    val binaryParameterWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("modifier.whitelist")
    val modifierWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("operation.whitelist")
    val operationWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("operation.whitelist.prefixes")
    val operationWhitelistPrefixes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("typehint.whitelist")
    val typehintWhitelist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("resourcetype.whitelist")
    val resourcetypeWhitelist: ConfigNodePropertyArray? = null,

)
