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
 * @param versionmanagerPeriodcreateVersionOnActivation 
 * @param versionmanagerPeriodpurgingEnabled 
 * @param versionmanagerPeriodpurgePaths 
 * @param versionmanagerPeriodivPaths 
 * @param versionmanagerPeriodmaxAgeDays 
 * @param versionmanagerPeriodmaxNumberVersions 
 * @param versionmanagerPeriodminNumberVersions 
 */
case class ComDayCqWcmCoreImplVersionManagerImplProperties(versionmanagerPeriodcreateVersionOnActivation: Option[ConfigNodePropertyBoolean],
                versionmanagerPeriodpurgingEnabled: Option[ConfigNodePropertyBoolean],
                versionmanagerPeriodpurgePaths: Option[ConfigNodePropertyArray],
                versionmanagerPeriodivPaths: Option[ConfigNodePropertyArray],
                versionmanagerPeriodmaxAgeDays: Option[ConfigNodePropertyInteger],
                versionmanagerPeriodmaxNumberVersions: Option[ConfigNodePropertyInteger],
                versionmanagerPeriodminNumberVersions: Option[ConfigNodePropertyInteger]
                )

object ComDayCqWcmCoreImplVersionManagerImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplVersionManagerImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplVersionManagerImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplVersionManagerImplProperties] = deriveEncoder
}
