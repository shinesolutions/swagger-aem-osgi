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
 * @param jasperPeriodcompilerTargetVM 
 * @param jasperPeriodcompilerSourceVM 
 * @param jasperPeriodclassdebuginfo 
 * @param jasperPeriodenablePooling 
 * @param jasperPeriodieClassId 
 * @param jasperPeriodgenStringAsCharArray 
 * @param jasperPeriodkeepgenerated 
 * @param jasperPeriodmappedfile 
 * @param jasperPeriodtrimSpaces 
 * @param jasperPerioddisplaySourceFragments 
 * @param defaultPeriodisPeriodsession 
 */
case class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties(jasperPeriodcompilerTargetVM: Option[ConfigNodePropertyString],
                jasperPeriodcompilerSourceVM: Option[ConfigNodePropertyString],
                jasperPeriodclassdebuginfo: Option[ConfigNodePropertyBoolean],
                jasperPeriodenablePooling: Option[ConfigNodePropertyBoolean],
                jasperPeriodieClassId: Option[ConfigNodePropertyString],
                jasperPeriodgenStringAsCharArray: Option[ConfigNodePropertyBoolean],
                jasperPeriodkeepgenerated: Option[ConfigNodePropertyBoolean],
                jasperPeriodmappedfile: Option[ConfigNodePropertyBoolean],
                jasperPeriodtrimSpaces: Option[ConfigNodePropertyBoolean],
                jasperPerioddisplaySourceFragments: Option[ConfigNodePropertyBoolean],
                defaultPeriodisPeriodsession: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties] = deriveEncoder
}
