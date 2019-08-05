package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault 
 * @param cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault 
 * @param cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources 
 */
case class ComDayCqDamCoreImplServletBatchMetadataServletProperties(cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplServletBatchMetadataServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletBatchMetadataServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletBatchMetadataServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletBatchMetadataServletProperties] = deriveEncoder
}
