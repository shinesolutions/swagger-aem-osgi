package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost 
 * @param servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences 
 */
case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(servicePeriodmaxUnderscorelinksUnderscoreperUnderscorehost: Option[ConfigNodePropertyInteger],
                servicePeriodsaveUnderscoreexternalUnderscorelinkUnderscorereferences: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties] = deriveEncoder
}
