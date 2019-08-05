package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = deriveEncoder
}
