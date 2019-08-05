package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param parameterPeriodwhitelist 
 * @param parameterPeriodwhitelistPeriodprefixes 
 * @param binaryPeriodparameterPeriodwhitelist 
 * @param modifierPeriodwhitelist 
 * @param operationPeriodwhitelist 
 * @param operationPeriodwhitelistPeriodprefixes 
 * @param typehintPeriodwhitelist 
 * @param resourcetypePeriodwhitelist 
 */
case class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties(parameterPeriodwhitelist: Option[ConfigNodePropertyArray],
                parameterPeriodwhitelistPeriodprefixes: Option[ConfigNodePropertyArray],
                binaryPeriodparameterPeriodwhitelist: Option[ConfigNodePropertyArray],
                modifierPeriodwhitelist: Option[ConfigNodePropertyArray],
                operationPeriodwhitelist: Option[ConfigNodePropertyArray],
                operationPeriodwhitelistPeriodprefixes: Option[ConfigNodePropertyArray],
                typehintPeriodwhitelist: Option[ConfigNodePropertyArray],
                resourcetypePeriodwhitelist: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties] = deriveEncoder
}
