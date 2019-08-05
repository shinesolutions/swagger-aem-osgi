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
 * @param illegalCharMapping 
 * @param pageSubTreeActivationCheck 
 */
case class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(illegalCharMapping: Option[ConfigNodePropertyString],
                pageSubTreeActivationCheck: Option[ConfigNodePropertyBoolean]
                )

object ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties] = deriveEncoder
}
