<?php
/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */
class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcDriverClass */
    private $jdbcDriverClass;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcConnectionUri */
    private $jdbcConnectionUri;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcUsername */
    private $jdbcUsername;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcPassword */
    private $jdbcPassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $jdbcValidationQuery */
    private $jdbcValidationQuery;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $defaultReadonly */
    private $defaultReadonly;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $defaultAutocommit */
    private $defaultAutocommit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $poolSize */
    private $poolSize;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $poolMaxWaitMsec */
    private $poolMaxWaitMsec;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $datasourceName */
    private $datasourceName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $datasourceSvcProperties */
    private $datasourceSvcProperties;

}
