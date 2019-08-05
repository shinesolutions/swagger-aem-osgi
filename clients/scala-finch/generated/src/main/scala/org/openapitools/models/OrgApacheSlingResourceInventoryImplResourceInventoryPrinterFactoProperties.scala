package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param felixPeriodinventoryPeriodprinterPeriodname 
 * @param felixPeriodinventoryPeriodprinterPeriodtitle 
 * @param path 
 */
case class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties(felixPeriodinventoryPeriodprinterPeriodname: Option[ConfigNodePropertyString],
                felixPeriodinventoryPeriodprinterPeriodtitle: Option[ConfigNodePropertyString],
                path: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
    /**
     * Creates the codec for converting OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties] = deriveEncoder
}
