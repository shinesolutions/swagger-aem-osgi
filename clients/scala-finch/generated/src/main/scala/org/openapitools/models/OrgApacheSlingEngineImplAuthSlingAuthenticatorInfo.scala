package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo {
    /**
     * Creates the codec for converting OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = deriveEncoder
}
