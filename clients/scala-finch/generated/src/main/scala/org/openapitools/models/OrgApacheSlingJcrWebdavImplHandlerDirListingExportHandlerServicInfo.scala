package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties]
                )

object OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo] = deriveEncoder
}
