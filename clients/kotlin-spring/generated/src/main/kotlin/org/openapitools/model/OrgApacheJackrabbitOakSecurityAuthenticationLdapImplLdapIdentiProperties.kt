package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConfigNodePropertyArray
import org.openapitools.model.ConfigNodePropertyBoolean
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
 * @param providerName 
 * @param hostName 
 * @param hostPort 
 * @param hostSsl 
 * @param hostTls 
 * @param hostNoCertCheck 
 * @param bindDn 
 * @param bindPassword 
 * @param searchTimeout 
 * @param adminPoolMaxActive 
 * @param adminPoolLookupOnValidate 
 * @param userPoolMaxActive 
 * @param userPoolLookupOnValidate 
 * @param userBaseDN 
 * @param userObjectclass 
 * @param userIdAttribute 
 * @param userExtraFilter 
 * @param userMakeDnPath 
 * @param groupBaseDN 
 * @param groupObjectclass 
 * @param groupNameAttribute 
 * @param groupExtraFilter 
 * @param groupMakeDnPath 
 * @param groupMemberAttribute 
 * @param useUidForExtId 
 * @param customattributes 
 */
data class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("provider.name")
    @get:JsonProperty("provider.name") val providerName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("host.name")
    @get:JsonProperty("host.name") val hostName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("host.port")
    @get:JsonProperty("host.port") val hostPort: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("host.ssl")
    @get:JsonProperty("host.ssl") val hostSsl: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("host.tls")
    @get:JsonProperty("host.tls") val hostTls: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("host.noCertCheck")
    @get:JsonProperty("host.noCertCheck") val hostNoCertCheck: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bind.dn")
    @get:JsonProperty("bind.dn") val bindDn: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bind.password")
    @get:JsonProperty("bind.password") val bindPassword: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("searchTimeout")
    @get:JsonProperty("searchTimeout") val searchTimeout: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("adminPool.maxActive")
    @get:JsonProperty("adminPool.maxActive") val adminPoolMaxActive: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("adminPool.lookupOnValidate")
    @get:JsonProperty("adminPool.lookupOnValidate") val adminPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("userPool.maxActive")
    @get:JsonProperty("userPool.maxActive") val userPoolMaxActive: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("userPool.lookupOnValidate")
    @get:JsonProperty("userPool.lookupOnValidate") val userPoolLookupOnValidate: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.baseDN")
    @get:JsonProperty("user.baseDN") val userBaseDN: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.objectclass")
    @get:JsonProperty("user.objectclass") val userObjectclass: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.idAttribute")
    @get:JsonProperty("user.idAttribute") val userIdAttribute: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.extraFilter")
    @get:JsonProperty("user.extraFilter") val userExtraFilter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.makeDnPath")
    @get:JsonProperty("user.makeDnPath") val userMakeDnPath: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.baseDN")
    @get:JsonProperty("group.baseDN") val groupBaseDN: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.objectclass")
    @get:JsonProperty("group.objectclass") val groupObjectclass: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.nameAttribute")
    @get:JsonProperty("group.nameAttribute") val groupNameAttribute: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.extraFilter")
    @get:JsonProperty("group.extraFilter") val groupExtraFilter: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.makeDnPath")
    @get:JsonProperty("group.makeDnPath") val groupMakeDnPath: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.memberAttribute")
    @get:JsonProperty("group.memberAttribute") val groupMemberAttribute: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("useUidForExtId")
    @get:JsonProperty("useUidForExtId") val useUidForExtId: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customattributes")
    @get:JsonProperty("customattributes") val customattributes: ConfigNodePropertyArray? = null
) {

}

