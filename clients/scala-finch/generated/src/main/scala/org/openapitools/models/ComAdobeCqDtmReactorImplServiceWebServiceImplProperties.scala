package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param endpointUri 
 * @param connectionTimeout 
 * @param socketTimeout 
 */
case class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(endpointUri: Option[ConfigNodePropertyString],
                connectionTimeout: Option[ConfigNodePropertyInteger],
                socketTimeout: Option[ConfigNodePropertyInteger]
                )

object ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqDtmReactorImplServiceWebServiceImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties] = deriveEncoder
}
