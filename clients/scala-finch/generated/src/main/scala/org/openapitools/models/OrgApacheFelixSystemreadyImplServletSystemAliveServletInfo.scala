package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = deriveEncoder
}
