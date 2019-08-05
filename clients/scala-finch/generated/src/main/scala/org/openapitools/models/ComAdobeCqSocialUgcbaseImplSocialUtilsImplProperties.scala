package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param legacyCloudUGCPathMapping 
 */
case class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(legacyCloudUGCPathMapping: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties] = deriveEncoder
}
