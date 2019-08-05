package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param servicePeriodranking 
 */
case class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties(servicePeriodranking: Option[ConfigNodePropertyInteger]
                )

object OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties] = deriveEncoder
}
