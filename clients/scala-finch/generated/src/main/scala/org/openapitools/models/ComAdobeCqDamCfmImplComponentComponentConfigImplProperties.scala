package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param damPeriodcfmPeriodcomponentPeriodresourceType 
 * @param damPeriodcfmPeriodcomponentPeriodfileReferenceProp 
 * @param damPeriodcfmPeriodcomponentPeriodelementsProp 
 * @param damPeriodcfmPeriodcomponentPeriodvariationProp 
 */
case class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties(damPeriodcfmPeriodcomponentPeriodresourceType: Option[ConfigNodePropertyString],
                damPeriodcfmPeriodcomponentPeriodfileReferenceProp: Option[ConfigNodePropertyString],
                damPeriodcfmPeriodcomponentPeriodelementsProp: Option[ConfigNodePropertyString],
                damPeriodcfmPeriodcomponentPeriodvariationProp: Option[ConfigNodePropertyString]
                )

object ComAdobeCqDamCfmImplComponentComponentConfigImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplComponentComponentConfigImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplComponentComponentConfigImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplComponentComponentConfigImplProperties] = deriveEncoder
}
