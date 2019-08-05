package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param externalizerPerioddomains 
 * @param externalizerPeriodhost 
 * @param externalizerPeriodcontextpath 
 * @param externalizerPeriodencodedpath 
 */
case class ComDayCqCommonsImplExternalizerImplProperties(externalizerPerioddomains: Option[ConfigNodePropertyArray],
                externalizerPeriodhost: Option[ConfigNodePropertyString],
                externalizerPeriodcontextpath: Option[ConfigNodePropertyString],
                externalizerPeriodencodedpath: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqCommonsImplExternalizerImplProperties {
    /**
     * Creates the codec for converting ComDayCqCommonsImplExternalizerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCommonsImplExternalizerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCommonsImplExternalizerImplProperties] = deriveEncoder
}
