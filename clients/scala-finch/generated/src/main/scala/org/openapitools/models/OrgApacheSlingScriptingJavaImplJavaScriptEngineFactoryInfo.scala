package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = deriveEncoder
}
