package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties]
                )

object OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo] = deriveEncoder
}
