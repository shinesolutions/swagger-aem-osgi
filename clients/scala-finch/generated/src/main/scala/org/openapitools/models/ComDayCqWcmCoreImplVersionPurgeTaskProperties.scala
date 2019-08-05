package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param versionpurgePeriodpaths 
 * @param versionpurgePeriodrecursive 
 * @param versionpurgePeriodmaxVersions 
 * @param versionpurgePeriodminVersions 
 * @param versionpurgePeriodmaxAgeDays 
 */
case class ComDayCqWcmCoreImplVersionPurgeTaskProperties(versionpurgePeriodpaths: Option[ConfigNodePropertyArray],
                versionpurgePeriodrecursive: Option[ConfigNodePropertyBoolean],
                versionpurgePeriodmaxVersions: Option[ConfigNodePropertyInteger],
                versionpurgePeriodminVersions: Option[ConfigNodePropertyInteger],
                versionpurgePeriodmaxAgeDays: Option[ConfigNodePropertyInteger]
                )

object ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVersionPurgeTaskProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVersionPurgeTaskProperties] = deriveEncoder
}
