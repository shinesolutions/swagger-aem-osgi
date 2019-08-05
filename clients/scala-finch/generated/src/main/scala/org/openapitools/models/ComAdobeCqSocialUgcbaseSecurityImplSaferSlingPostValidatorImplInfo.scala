package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties]
                )

object ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo] = deriveEncoder
}
