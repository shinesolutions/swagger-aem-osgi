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
 * @param cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties 
 * @param cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit 
 */
case class ComDayCqDamCoreImplServletCollectionsServletProperties(cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties: Option[ConfigNodePropertyArray],
                cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit: Option[ConfigNodePropertyInteger]
                )

object ComDayCqDamCoreImplServletCollectionsServletProperties {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplServletCollectionsServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplServletCollectionsServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplServletCollectionsServletProperties] = deriveEncoder
}
