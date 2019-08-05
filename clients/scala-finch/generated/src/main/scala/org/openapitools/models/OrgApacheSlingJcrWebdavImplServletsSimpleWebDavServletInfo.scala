package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = deriveEncoder
}
