package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadyImplComponentsCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixSystemreadyImplComponentsCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadyImplComponentsCheckProperties]
                )

object OrgApacheFelixSystemreadyImplComponentsCheckInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplComponentsCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplComponentsCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplComponentsCheckInfo] = deriveEncoder
}
