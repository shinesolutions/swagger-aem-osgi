<?php
/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */
class OrgApacheSlingDatasourceDataSourceFactoryProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $datasourceName */
    private $datasourceName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $datasourceSvcPropName */
    private $datasourceSvcPropName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $driverClassName */
    private $driverClassName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $url */
    private $url;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $username */
    private $username;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $password */
    private $password;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $defaultAutoCommit */
    private $defaultAutoCommit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $defaultReadOnly */
    private $defaultReadOnly;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $defaultTransactionIsolation */
    private $defaultTransactionIsolation;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $defaultCatalog */
    private $defaultCatalog;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxActive */
    private $maxActive;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxIdle */
    private $maxIdle;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $minIdle */
    private $minIdle;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $initialSize */
    private $initialSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxWait */
    private $maxWait;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $maxAge */
    private $maxAge;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $testOnBorrow */
    private $testOnBorrow;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $testOnReturn */
    private $testOnReturn;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $testWhileIdle */
    private $testWhileIdle;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $validationQuery */
    private $validationQuery;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $validationQueryTimeout */
    private $validationQueryTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $timeBetweenEvictionRunsMillis */
    private $timeBetweenEvictionRunsMillis;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $minEvictableIdleTimeMillis */
    private $minEvictableIdleTimeMillis;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $connectionProperties */
    private $connectionProperties;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $initSQL */
    private $initSQL;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcInterceptors */
    private $jdbcInterceptors;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $validationInterval */
    private $validationInterval;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $logValidationErrors */
    private $logValidationErrors;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $datasourceSvcProperties */
    private $datasourceSvcProperties;

}
