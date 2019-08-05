package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param automoderationPeriodsequence 
 * @param automoderationPeriodonfailurestop 
 */
case class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(automoderationPeriodsequence: Option[ConfigNodePropertyArray],
                automoderationPeriodonfailurestop: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties] = deriveEncoder
}
