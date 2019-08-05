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
 * @param schedulerPeriodperiod 
 * @param schedulerPeriodconcurrent 
 * @param goodUnderscorelinkUnderscoretestUnderscoreinterval 
 * @param badUnderscorelinkUnderscoretestUnderscoreinterval 
 * @param linkUnderscoreunusedUnderscoreinterval 
 * @param connectionPeriodtimeout 
 */
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(schedulerPeriodperiod: Option[ConfigNodePropertyInteger],
                schedulerPeriodconcurrent: Option[ConfigNodePropertyBoolean],
                goodUnderscorelinkUnderscoretestUnderscoreinterval: Option[ConfigNodePropertyInteger],
                badUnderscorelinkUnderscoretestUnderscoreinterval: Option[ConfigNodePropertyInteger],
                linkUnderscoreunusedUnderscoreinterval: Option[ConfigNodePropertyInteger],
                connectionPeriodtimeout: Option[ConfigNodePropertyInteger]
                )

object ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
    /**
     * Creates the codec for converting ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties] = deriveEncoder
}
