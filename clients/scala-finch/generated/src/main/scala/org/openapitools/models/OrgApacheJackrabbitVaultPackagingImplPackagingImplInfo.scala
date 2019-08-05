package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties]
                )

object OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo {
    /**
     * Creates the codec for converting OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = deriveEncoder
}
