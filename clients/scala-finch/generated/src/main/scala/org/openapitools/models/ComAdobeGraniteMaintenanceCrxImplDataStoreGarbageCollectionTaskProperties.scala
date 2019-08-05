package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param granitePeriodmaintenancePeriodmandatory 
 * @param jobPeriodtopics 
 */
case class ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(granitePeriodmaintenancePeriodmandatory: Option[ConfigNodePropertyBoolean],
                jobPeriodtopics: Option[ConfigNodePropertyString]
                )

object ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties] = deriveEncoder
}
