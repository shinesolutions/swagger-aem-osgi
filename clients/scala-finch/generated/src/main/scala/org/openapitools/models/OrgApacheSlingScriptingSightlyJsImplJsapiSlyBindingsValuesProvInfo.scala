package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo] = deriveEncoder
}
