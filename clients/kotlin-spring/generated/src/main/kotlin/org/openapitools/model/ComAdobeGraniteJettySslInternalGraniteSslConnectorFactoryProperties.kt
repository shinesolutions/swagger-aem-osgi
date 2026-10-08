package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyDropDown
import org.openapitools.model.ConfigNodePropertyInteger
import org.openapitools.model.ConfigNodePropertyString
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param comAdobeGraniteJettySslPort 
 * @param comAdobeGraniteJettySslKeystoreUser 
 * @param comAdobeGraniteJettySslKeystorePassword 
 * @param comAdobeGraniteJettySslCiphersuitesExcluded 
 * @param comAdobeGraniteJettySslCiphersuitesIncluded 
 * @param comAdobeGraniteJettySslClientCertificate 
 */
data class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.port")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.port") val comAdobeGraniteJettySslPort: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.keystore.user")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.keystore.user") val comAdobeGraniteJettySslKeystoreUser: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.keystore.password")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.keystore.password") val comAdobeGraniteJettySslKeystorePassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.excluded") val comAdobeGraniteJettySslCiphersuitesExcluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.ciphersuites.included") val comAdobeGraniteJettySslCiphersuitesIncluded: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("com.adobe.granite.jetty.ssl.client.certificate")
    @get:JsonProperty("com.adobe.granite.jetty.ssl.client.certificate") val comAdobeGraniteJettySslClientCertificate: ConfigNodePropertyDropDown? = null
) {

}

