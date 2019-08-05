package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param path 
 * @param servicePeriodranking 
 * @param authPeriodloginselectorPeriodmappings 
 * @param authPeriodloginselectorPeriodchangepwPeriodmappings 
 * @param authPeriodloginselectorPerioddefaultloginpage 
 * @param authPeriodloginselectorPerioddefaultchangepwpage 
 * @param authPeriodloginselectorPeriodhandle 
 * @param authPeriodloginselectorPeriodhandlePeriodallPeriodextensions 
 */
case class ComDayCqAuthImplLoginSelectorHandlerProperties(path: Option[ConfigNodePropertyString],
                servicePeriodranking: Option[ConfigNodePropertyInteger],
                authPeriodloginselectorPeriodmappings: Option[ConfigNodePropertyArray],
                authPeriodloginselectorPeriodchangepwPeriodmappings: Option[ConfigNodePropertyArray],
                authPeriodloginselectorPerioddefaultloginpage: Option[ConfigNodePropertyString],
                authPeriodloginselectorPerioddefaultchangepwpage: Option[ConfigNodePropertyString],
                authPeriodloginselectorPeriodhandle: Option[ConfigNodePropertyArray],
                authPeriodloginselectorPeriodhandlePeriodallPeriodextensions: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqAuthImplLoginSelectorHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqAuthImplLoginSelectorHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqAuthImplLoginSelectorHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqAuthImplLoginSelectorHandlerProperties] = deriveEncoder
}
