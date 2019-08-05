package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param tokenPeriodrequiredPeriodattr 
 * @param tokenPeriodalternatePeriodurl 
 * @param tokenPeriodencapsulated 
 * @param skipPeriodtokenPeriodrefresh 
 */
case class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(path: Option[ConfigNodePropertyString],
                tokenPeriodrequiredPeriodattr: Option[ConfigNodePropertyDropDown],
                tokenPeriodalternatePeriodurl: Option[ConfigNodePropertyString],
                tokenPeriodencapsulated: Option[ConfigNodePropertyBoolean],
                skipPeriodtokenPeriodrefresh: Option[ConfigNodePropertyArray]
                )

object ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
    /**
     * Creates the codec for converting ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties] = deriveEncoder
}
