package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param rootmappingPeriodtarget 
 */
case class ComDayCqCommonsServletsRootMappingServletProperties(rootmappingPeriodtarget: Option[ConfigNodePropertyString]
                )

object ComDayCqCommonsServletsRootMappingServletProperties {
    /**
     * Creates the codec for converting ComDayCqCommonsServletsRootMappingServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCommonsServletsRootMappingServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCommonsServletsRootMappingServletProperties] = deriveEncoder
}
