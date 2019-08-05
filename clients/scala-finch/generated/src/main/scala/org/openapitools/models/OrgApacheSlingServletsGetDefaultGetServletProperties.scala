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
 * @param aliases 
 * @param index 
 * @param indexPeriodfiles 
 * @param enablePeriodhtml 
 * @param enablePeriodjson 
 * @param enablePeriodtxt 
 * @param enablePeriodxml 
 * @param jsonPeriodmaximumresults 
 * @param ecmaSuport 
 */
case class OrgApacheSlingServletsGetDefaultGetServletProperties(aliases: Option[ConfigNodePropertyArray],
                index: Option[ConfigNodePropertyBoolean],
                indexPeriodfiles: Option[ConfigNodePropertyArray],
                enablePeriodhtml: Option[ConfigNodePropertyBoolean],
                enablePeriodjson: Option[ConfigNodePropertyBoolean],
                enablePeriodtxt: Option[ConfigNodePropertyBoolean],
                enablePeriodxml: Option[ConfigNodePropertyBoolean],
                jsonPeriodmaximumresults: Option[ConfigNodePropertyInteger],
                ecmaSuport: Option[ConfigNodePropertyBoolean]
                )

object OrgApacheSlingServletsGetDefaultGetServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingServletsGetDefaultGetServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingServletsGetDefaultGetServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingServletsGetDefaultGetServletProperties] = deriveEncoder
}
