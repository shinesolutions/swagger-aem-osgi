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
 * @param servicePeriodranking 
 * @param typePeriodcollections 
 * @param typePeriodnoncollections 
 * @param typePeriodcontent 
 */
case class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(servicePeriodranking: Option[ConfigNodePropertyInteger],
                typePeriodcollections: Option[ConfigNodePropertyString],
                typePeriodnoncollections: Option[ConfigNodePropertyString],
                typePeriodcontent: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties] = deriveEncoder
}
