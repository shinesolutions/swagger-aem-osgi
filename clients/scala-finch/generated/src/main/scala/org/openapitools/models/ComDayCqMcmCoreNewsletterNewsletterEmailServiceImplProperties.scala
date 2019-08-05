package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param fromPeriodaddress 
 * @param senderPeriodhost 
 * @param maxPeriodbouncePeriodcount 
 */
case class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(fromPeriodaddress: Option[ConfigNodePropertyString],
                senderPeriodhost: Option[ConfigNodePropertyString],
                maxPeriodbouncePeriodcount: Option[ConfigNodePropertyString]
                )

object ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {
    /**
     * Creates the codec for converting ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties] = deriveEncoder
}
