package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties]
                )

object OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo {
    /**
     * Creates the codec for converting OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = deriveEncoder
}
