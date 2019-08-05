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
 * @param redirectPeriodenabled 
 * @param redirectPeriodstatsPeriodenabled 
 * @param redirectPeriodextensions 
 * @param redirectPeriodpaths 
 */
case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(redirectPeriodenabled: Option[ConfigNodePropertyBoolean],
                redirectPeriodstatsPeriodenabled: Option[ConfigNodePropertyBoolean],
                redirectPeriodextensions: Option[ConfigNodePropertyArray],
                redirectPeriodpaths: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
    /**
     * Creates the codec for converting ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties] = deriveEncoder
}
