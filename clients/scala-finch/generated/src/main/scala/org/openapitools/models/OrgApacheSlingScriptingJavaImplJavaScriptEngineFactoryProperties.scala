package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param javaPeriodclassdebuginfo 
 * @param javaPeriodjavaEncoding 
 * @param javaPeriodcompilerSourceVM 
 * @param javaPeriodcompilerTargetVM 
 */
case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(javaPeriodclassdebuginfo: Option[ConfigNodePropertyBoolean],
                javaPeriodjavaEncoding: Option[ConfigNodePropertyString],
                javaPeriodcompilerSourceVM: Option[ConfigNodePropertyString],
                javaPeriodcompilerTargetVM: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties] = deriveEncoder
}
