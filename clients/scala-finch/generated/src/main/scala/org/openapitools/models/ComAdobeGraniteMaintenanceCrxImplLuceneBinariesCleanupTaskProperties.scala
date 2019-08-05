package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param jobPeriodtopics 
 */
case class ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties(jobPeriodtopics: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties] = deriveEncoder
}
