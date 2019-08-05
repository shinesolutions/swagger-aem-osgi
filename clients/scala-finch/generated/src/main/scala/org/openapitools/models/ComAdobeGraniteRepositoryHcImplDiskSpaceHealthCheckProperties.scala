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
 * @param hcPeriodtags 
 * @param diskPeriodspacePeriodwarnPeriodthreshold 
 * @param diskPeriodspacePerioderrorPeriodthreshold 
 */
case class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties(hcPeriodtags: Option[ConfigNodePropertyArray],
                diskPeriodspacePeriodwarnPeriodthreshold: Option[ConfigNodePropertyInteger],
                diskPeriodspacePerioderrorPeriodthreshold: Option[ConfigNodePropertyInteger]
                )

object ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties] = deriveEncoder
}
