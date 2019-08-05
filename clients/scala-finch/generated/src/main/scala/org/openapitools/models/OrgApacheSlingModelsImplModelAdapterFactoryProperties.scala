package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodlistener 
 * @param osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect 
 * @param maxPeriodrecursionPerioddepth 
 * @param cleanupPeriodjobPeriodperiod 
 */
case class OrgApacheSlingModelsImplModelAdapterFactoryProperties(osgiPeriodhttpPeriodwhiteboardPeriodlistener: Option[ConfigNodePropertyString],
                osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[ConfigNodePropertyString],
                maxPeriodrecursionPerioddepth: Option[ConfigNodePropertyInteger],
                cleanupPeriodjobPeriodperiod: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingModelsImplModelAdapterFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingModelsImplModelAdapterFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingModelsImplModelAdapterFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingModelsImplModelAdapterFactoryProperties] = deriveEncoder
}
