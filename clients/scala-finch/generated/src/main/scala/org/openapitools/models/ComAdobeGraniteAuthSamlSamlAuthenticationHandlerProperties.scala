package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 * @param idpUrl 
 * @param idpCertAlias 
 * @param idpHttpRedirect 
 * @param serviceProviderEntityId 
 * @param assertionConsumerServiceURL 
 * @param spPrivateKeyAlias 
 * @param keyStorePassword 
 * @param defaultRedirectUrl 
 * @param userIDAttribute 
 * @param useEncryption 
 * @param createUser 
 * @param userIntermediatePath 
 * @param addGroupMemberships 
 * @param groupMembershipAttribute 
 * @param defaultGroups 
 * @param nameIdFormat 
 * @param synchronizeAttributes 
 * @param handleLogout 
 * @param logoutUrl 
 * @param clockTolerance 
 * @param digestMethod 
 * @param signatureMethod 
 * @param identitySyncType 
 * @param idpIdentifier 
 */
case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties(path: Option[ConfigNodePropertyArray],
                servicePeriodranking: Option[ConfigNodePropertyInteger],
                idpUrl: Option[ConfigNodePropertyString],
                idpCertAlias: Option[ConfigNodePropertyString],
                idpHttpRedirect: Option[ConfigNodePropertyBoolean],
                serviceProviderEntityId: Option[ConfigNodePropertyString],
                assertionConsumerServiceURL: Option[ConfigNodePropertyString],
                spPrivateKeyAlias: Option[ConfigNodePropertyString],
                keyStorePassword: Option[ConfigNodePropertyString],
                defaultRedirectUrl: Option[ConfigNodePropertyString],
                userIDAttribute: Option[ConfigNodePropertyString],
                useEncryption: Option[ConfigNodePropertyBoolean],
                createUser: Option[ConfigNodePropertyBoolean],
                userIntermediatePath: Option[ConfigNodePropertyString],
                addGroupMemberships: Option[ConfigNodePropertyBoolean],
                groupMembershipAttribute: Option[ConfigNodePropertyString],
                defaultGroups: Option[ConfigNodePropertyArray],
                nameIdFormat: Option[ConfigNodePropertyString],
                synchronizeAttributes: Option[ConfigNodePropertyArray],
                handleLogout: Option[ConfigNodePropertyBoolean],
                logoutUrl: Option[ConfigNodePropertyString],
                clockTolerance: Option[ConfigNodePropertyInteger],
                digestMethod: Option[ConfigNodePropertyString],
                signatureMethod: Option[ConfigNodePropertyString],
                identitySyncType: Option[ConfigNodePropertyDropDown],
                idpIdentifier: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties] = deriveEncoder
}
