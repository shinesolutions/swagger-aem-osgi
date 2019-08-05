package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadyImplServicesCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheFelixSystemreadyImplServicesCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadyImplServicesCheckProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheFelixSystemreadyImplServicesCheckInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServicesCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServicesCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServicesCheckInfo] = deriveEncoder
}
