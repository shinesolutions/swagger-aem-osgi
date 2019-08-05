package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param datasourcePeriodname 
 * @param datasourcePeriodsvcPeriodpropPeriodname 
 * @param datasourcePeriodjndiPeriodname 
 * @param jndiPeriodproperties 
 */
case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(datasourcePeriodname: Option[ConfigNodePropertyString],
                datasourcePeriodsvcPeriodpropPeriodname: Option[ConfigNodePropertyString],
                datasourcePeriodjndiPeriodname: Option[ConfigNodePropertyString],
                jndiPeriodproperties: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties] = deriveEncoder
}
