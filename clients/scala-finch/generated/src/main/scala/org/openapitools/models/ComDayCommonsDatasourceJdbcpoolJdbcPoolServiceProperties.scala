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
 * @param jdbcPerioddriverPeriodclass 
 * @param jdbcPeriodconnectionPerioduri 
 * @param jdbcPeriodusername 
 * @param jdbcPeriodpassword 
 * @param jdbcPeriodvalidationPeriodquery 
 * @param defaultPeriodreadonly 
 * @param defaultPeriodautocommit 
 * @param poolPeriodsize 
 * @param poolPeriodmaxPeriodwaitPeriodmsec 
 * @param datasourcePeriodname 
 * @param datasourcePeriodsvcPeriodproperties 
 */
case class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(jdbcPerioddriverPeriodclass: Option[ConfigNodePropertyString],
                jdbcPeriodconnectionPerioduri: Option[ConfigNodePropertyString],
                jdbcPeriodusername: Option[ConfigNodePropertyString],
                jdbcPeriodpassword: Option[ConfigNodePropertyString],
                jdbcPeriodvalidationPeriodquery: Option[ConfigNodePropertyString],
                defaultPeriodreadonly: Option[ConfigNodePropertyBoolean],
                defaultPeriodautocommit: Option[ConfigNodePropertyBoolean],
                poolPeriodsize: Option[ConfigNodePropertyInteger],
                poolPeriodmaxPeriodwaitPeriodmsec: Option[ConfigNodePropertyInteger],
                datasourcePeriodname: Option[ConfigNodePropertyString],
                datasourcePeriodsvcPeriodproperties: Option[ConfigNodePropertyArray]
                )

object ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
    /**
     * Creates the codec for converting ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties] = deriveEncoder
}
