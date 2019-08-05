<?php
/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */
namespace app\Models;

/**
 * ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
 */
class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {

    /** @var \app\Models\ConfigNodePropertyString $jdbc_driver_class */
    private $jdbc_driver_class;

    /** @var \app\Models\ConfigNodePropertyString $jdbc_connection_uri */
    private $jdbc_connection_uri;

    /** @var \app\Models\ConfigNodePropertyString $jdbc_username */
    private $jdbc_username;

    /** @var \app\Models\ConfigNodePropertyString $jdbc_password */
    private $jdbc_password;

    /** @var \app\Models\ConfigNodePropertyString $jdbc_validation_query */
    private $jdbc_validation_query;

    /** @var \app\Models\ConfigNodePropertyBoolean $default_readonly */
    private $default_readonly;

    /** @var \app\Models\ConfigNodePropertyBoolean $default_autocommit */
    private $default_autocommit;

    /** @var \app\Models\ConfigNodePropertyInteger $pool_size */
    private $pool_size;

    /** @var \app\Models\ConfigNodePropertyInteger $pool_max_wait_msec */
    private $pool_max_wait_msec;

    /** @var \app\Models\ConfigNodePropertyString $datasource_name */
    private $datasource_name;

    /** @var \app\Models\ConfigNodePropertyArray $datasource_svc_properties */
    private $datasource_svc_properties;

}
