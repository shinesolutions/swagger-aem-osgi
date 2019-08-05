package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param watchwordsPeriodpositive 
 * @param watchwordsPeriodnegative 
 * @param watchwordsPeriodpath 
 * @param sentimentPeriodpath 
 */
case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(watchwordsPeriodpositive: Option[ConfigNodePropertyArray],
                watchwordsPeriodnegative: Option[ConfigNodePropertyArray],
                watchwordsPeriodpath: Option[ConfigNodePropertyString],
                sentimentPeriodpath: Option[ConfigNodePropertyString]
                )

object ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
    /**
     * Creates the codec for converting ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] = deriveEncoder
}
