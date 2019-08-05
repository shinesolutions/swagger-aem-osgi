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
 * @param preservePeriodhierarchyPeriodnodes 
 * @param ignorePeriodversioning 
 * @param importPeriodacl 
 * @param savePeriodthreshold 
 * @param preservePerioduserPeriodpaths 
 * @param preservePerioduuid 
 * @param preservePerioduuidPeriodnodetypes 
 * @param preservePerioduuidPeriodsubtrees 
 * @param autoPeriodcommit 
 */
case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(preservePeriodhierarchyPeriodnodes: Option[ConfigNodePropertyBoolean],
                ignorePeriodversioning: Option[ConfigNodePropertyBoolean],
                importPeriodacl: Option[ConfigNodePropertyBoolean],
                savePeriodthreshold: Option[ConfigNodePropertyInteger],
                preservePerioduserPeriodpaths: Option[ConfigNodePropertyBoolean],
                preservePerioduuid: Option[ConfigNodePropertyBoolean],
                preservePerioduuidPeriodnodetypes: Option[ConfigNodePropertyArray],
                preservePerioduuidPeriodsubtrees: Option[ConfigNodePropertyArray],
                autoPeriodcommit: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties {
    /**
     * Creates the codec for converting ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties] = deriveEncoder
}
