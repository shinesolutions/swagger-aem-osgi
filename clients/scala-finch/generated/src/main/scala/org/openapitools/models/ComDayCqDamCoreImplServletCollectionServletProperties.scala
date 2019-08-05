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
 * @param cqPerioddamPeriodbatchPeriodcollectionPeriodproperties 
 * @param cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections 
 */
case class ComDayCqDamCoreImplServletCollectionServletProperties(cqPerioddamPeriodbatchPeriodcollectionPeriodproperties: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplServletCollectionServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCollectionServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCollectionServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCollectionServletProperties] = deriveEncoder
}
