package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = deriveEncoder
}
