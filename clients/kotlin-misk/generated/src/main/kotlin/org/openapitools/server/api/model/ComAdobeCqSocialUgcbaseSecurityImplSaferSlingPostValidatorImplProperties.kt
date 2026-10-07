package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(
    val parameterWhitelist: ConfigNodePropertyArray? = null,
    val parameterWhitelistPrefixes: ConfigNodePropertyArray? = null,
    val binaryParameterWhitelist: ConfigNodePropertyArray? = null,
    val modifierWhitelist: ConfigNodePropertyArray? = null,
    val operationWhitelist: ConfigNodePropertyArray? = null,
    val operationWhitelistPrefixes: ConfigNodePropertyArray? = null,
    val typehintWhitelist: ConfigNodePropertyArray? = null,
    val resourcetypeWhitelist: ConfigNodePropertyArray? = null
)
