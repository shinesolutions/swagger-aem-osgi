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
 * @param handlerName 
 * @param userExpirationTime 
 * @param userAutoMembership 
 * @param userPropertyMapping 
 * @param userPathPrefix 
 * @param userMembershipExpTime 
 * @param userMembershipNestingDepth 
 * @param userDynamicMembership 
 * @param userDisableMissing 
 * @param groupExpirationTime 
 * @param groupAutoMembership 
 * @param groupPropertyMapping 
 * @param groupPathPrefix 
 * @param enableRFC7613UsercaseMappedProfile 
 */
data class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("handler.name")
    @get:JsonProperty("handler.name") val handlerName: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.expirationTime")
    @get:JsonProperty("user.expirationTime") val userExpirationTime: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.autoMembership")
    @get:JsonProperty("user.autoMembership") val userAutoMembership: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.propertyMapping")
    @get:JsonProperty("user.propertyMapping") val userPropertyMapping: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.pathPrefix")
    @get:JsonProperty("user.pathPrefix") val userPathPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.membershipExpTime")
    @get:JsonProperty("user.membershipExpTime") val userMembershipExpTime: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.membershipNestingDepth")
    @get:JsonProperty("user.membershipNestingDepth") val userMembershipNestingDepth: ConfigNodePropertyInteger? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.dynamicMembership")
    @get:JsonProperty("user.dynamicMembership") val userDynamicMembership: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user.disableMissing")
    @get:JsonProperty("user.disableMissing") val userDisableMissing: ConfigNodePropertyBoolean? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.expirationTime")
    @get:JsonProperty("group.expirationTime") val groupExpirationTime: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.autoMembership")
    @get:JsonProperty("group.autoMembership") val groupAutoMembership: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.propertyMapping")
    @get:JsonProperty("group.propertyMapping") val groupPropertyMapping: ConfigNodePropertyArray? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("group.pathPrefix")
    @get:JsonProperty("group.pathPrefix") val groupPathPrefix: ConfigNodePropertyString? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("enableRFC7613UsercaseMappedProfile")
    @get:JsonProperty("enableRFC7613UsercaseMappedProfile") val enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean? = null
) {

}

