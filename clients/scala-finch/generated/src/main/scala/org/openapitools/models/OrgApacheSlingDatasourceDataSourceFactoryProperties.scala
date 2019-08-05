package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param datasourcePeriodname 
 * @param datasourcePeriodsvcPeriodpropPeriodname 
 * @param driverClassName 
 * @param url 
 * @param username 
 * @param password 
 * @param defaultAutoCommit 
 * @param defaultReadOnly 
 * @param defaultTransactionIsolation 
 * @param defaultCatalog 
 * @param maxActive 
 * @param maxIdle 
 * @param minIdle 
 * @param initialSize 
 * @param maxWait 
 * @param maxAge 
 * @param testOnBorrow 
 * @param testOnReturn 
 * @param testWhileIdle 
 * @param validationQuery 
 * @param validationQueryTimeout 
 * @param timeBetweenEvictionRunsMillis 
 * @param minEvictableIdleTimeMillis 
 * @param connectionProperties 
 * @param initSQL 
 * @param jdbcInterceptors 
 * @param validationInterval 
 * @param logValidationErrors 
 * @param datasourcePeriodsvcPeriodproperties 
 */
case class OrgApacheSlingDatasourceDataSourceFactoryProperties(datasourcePeriodname: Option[ConfigNodePropertyString],
                datasourcePeriodsvcPeriodpropPeriodname: Option[ConfigNodePropertyString],
                driverClassName: Option[ConfigNodePropertyString],
                url: Option[ConfigNodePropertyString],
                username: Option[ConfigNodePropertyString],
                password: Option[ConfigNodePropertyString],
                defaultAutoCommit: Option[ConfigNodePropertyDropDown],
                defaultReadOnly: Option[ConfigNodePropertyDropDown],
                defaultTransactionIsolation: Option[ConfigNodePropertyDropDown],
                defaultCatalog: Option[ConfigNodePropertyString],
                maxActive: Option[ConfigNodePropertyInteger],
                maxIdle: Option[ConfigNodePropertyInteger],
                minIdle: Option[ConfigNodePropertyInteger],
                initialSize: Option[ConfigNodePropertyInteger],
                maxWait: Option[ConfigNodePropertyInteger],
                maxAge: Option[ConfigNodePropertyInteger],
                testOnBorrow: Option[ConfigNodePropertyBoolean],
                testOnReturn: Option[ConfigNodePropertyBoolean],
                testWhileIdle: Option[ConfigNodePropertyBoolean],
                validationQuery: Option[ConfigNodePropertyString],
                validationQueryTimeout: Option[ConfigNodePropertyInteger],
                timeBetweenEvictionRunsMillis: Option[ConfigNodePropertyInteger],
                minEvictableIdleTimeMillis: Option[ConfigNodePropertyInteger],
                connectionProperties: Option[ConfigNodePropertyString],
                initSQL: Option[ConfigNodePropertyString],
                jdbcInterceptors: Option[ConfigNodePropertyString],
                validationInterval: Option[ConfigNodePropertyInteger],
                logValidationErrors: Option[ConfigNodePropertyBoolean],
                datasourcePeriodsvcPeriodproperties: Option[ConfigNodePropertyArray]
                )

object OrgApacheSlingDatasourceDataSourceFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingDatasourceDataSourceFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingDatasourceDataSourceFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingDatasourceDataSourceFactoryProperties] = deriveEncoder
}
