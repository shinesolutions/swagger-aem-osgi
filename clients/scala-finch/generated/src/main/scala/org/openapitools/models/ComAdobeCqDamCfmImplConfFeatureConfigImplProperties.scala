package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param damPeriodcfmPeriodresourceTypes 
 * @param damPeriodcfmPeriodreferenceProperties 
 */
case class ComAdobeCqDamCfmImplConfFeatureConfigImplProperties(damPeriodcfmPeriodresourceTypes: Option[ConfigNodePropertyArray],
                damPeriodcfmPeriodreferenceProperties: Option[ConfigNodePropertyArray]
                )

object ComAdobeCqDamCfmImplConfFeatureConfigImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplConfFeatureConfigImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties] = deriveEncoder
}
