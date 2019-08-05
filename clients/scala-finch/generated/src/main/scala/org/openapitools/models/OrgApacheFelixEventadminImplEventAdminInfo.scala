package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixEventadminImplEventAdminProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheFelixEventadminImplEventAdminInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixEventadminImplEventAdminProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheFelixEventadminImplEventAdminInfo {
    /**
     * Creates the codec for converting OrgApacheFelixEventadminImplEventAdminInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixEventadminImplEventAdminInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixEventadminImplEventAdminInfo] = deriveEncoder
}
