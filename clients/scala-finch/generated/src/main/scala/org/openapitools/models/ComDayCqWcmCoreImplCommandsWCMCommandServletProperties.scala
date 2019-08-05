package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param wcmcommandservletPerioddeleteUnderscorewhitelist 
 */
case class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties(wcmcommandservletPerioddeleteUnderscorewhitelist: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplCommandsWCMCommandServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplCommandsWCMCommandServletProperties] = deriveEncoder
}
