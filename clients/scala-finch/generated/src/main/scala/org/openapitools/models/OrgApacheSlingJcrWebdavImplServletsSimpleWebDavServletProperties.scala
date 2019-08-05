package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param davPeriodroot 
 * @param davPeriodcreateMinusabsoluteMinusuri 
 * @param davPeriodrealm 
 * @param collectionPeriodtypes 
 * @param filterPeriodprefixes 
 * @param filterPeriodtypes 
 * @param filterPerioduris 
 * @param typePeriodcollections 
 * @param typePeriodnoncollections 
 * @param typePeriodcontent 
 */
case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(davPeriodroot: Option[ConfigNodePropertyString],
                davPeriodcreateMinusabsoluteMinusuri: Option[ConfigNodePropertyBoolean],
                davPeriodrealm: Option[ConfigNodePropertyString],
                collectionPeriodtypes: Option[ConfigNodePropertyArray],
                filterPeriodprefixes: Option[ConfigNodePropertyArray],
                filterPeriodtypes: Option[ConfigNodePropertyString],
                filterPerioduris: Option[ConfigNodePropertyString],
                typePeriodcollections: Option[ConfigNodePropertyString],
                typePeriodnoncollections: Option[ConfigNodePropertyString],
                typePeriodcontent: Option[ConfigNodePropertyString]
                )

object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
    /**
     * Creates the codec for converting OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties] = deriveEncoder
}
