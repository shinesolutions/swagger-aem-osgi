package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean

/**
 * 
 * @param cqPeriodsearchpromotePeriodconfighandlerPeriodenabled 
 */
case class ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties(cqPeriodsearchpromotePeriodconfighandlerPeriodenabled: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties] = deriveEncoder
}
