package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param alloworigin 
 * @param alloworiginregexp 
 * @param allowedpaths 
 * @param exposedheaders 
 * @param maxage 
 * @param supportedheaders 
 * @param supportedmethods 
 * @param supportscredentials 
 */
case class ComAdobeGraniteCorsImplCORSPolicyImplProperties(alloworigin: Option[ConfigNodePropertyArray],
                alloworiginregexp: Option[ConfigNodePropertyArray],
                allowedpaths: Option[ConfigNodePropertyArray],
                exposedheaders: Option[ConfigNodePropertyArray],
                maxage: Option[ConfigNodePropertyInteger],
                supportedheaders: Option[ConfigNodePropertyArray],
                supportedmethods: Option[ConfigNodePropertyArray],
                supportscredentials: Option[ConfigNodePropertyBoolean]
                )

object ComAdobeGraniteCorsImplCORSPolicyImplProperties {
    /**
     * Creates the codec for converting ComAdobeGraniteCorsImplCORSPolicyImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteCorsImplCORSPolicyImplProperties] = deriveEncoder
}
