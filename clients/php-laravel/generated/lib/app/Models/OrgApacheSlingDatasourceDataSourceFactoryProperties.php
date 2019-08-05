<?php
/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */
namespace app\Models;

/**
 * OrgApacheSlingDatasourceDataSourceFactoryProperties
 */
class OrgApacheSlingDatasourceDataSourceFactoryProperties {

    /** @var \app\Models\ConfigNodePropertyString $datasource_name */
    private $datasource_name;

    /** @var \app\Models\ConfigNodePropertyString $datasource_svc_prop_name */
    private $datasource_svc_prop_name;

    /** @var \app\Models\ConfigNodePropertyString $driver_class_name */
    private $driver_class_name;

    /** @var \app\Models\ConfigNodePropertyString $url */
    private $url;

    /** @var \app\Models\ConfigNodePropertyString $username */
    private $username;

    /** @var \app\Models\ConfigNodePropertyString $password */
    private $password;

    /** @var \app\Models\ConfigNodePropertyDropDown $default_auto_commit */
    private $default_auto_commit;

    /** @var \app\Models\ConfigNodePropertyDropDown $default_read_only */
    private $default_read_only;

    /** @var \app\Models\ConfigNodePropertyDropDown $default_transaction_isolation */
    private $default_transaction_isolation;

    /** @var \app\Models\ConfigNodePropertyString $default_catalog */
    private $default_catalog;

    /** @var \app\Models\ConfigNodePropertyInteger $max_active */
    private $max_active;

    /** @var \app\Models\ConfigNodePropertyInteger $max_idle */
    private $max_idle;

    /** @var \app\Models\ConfigNodePropertyInteger $min_idle */
    private $min_idle;

    /** @var \app\Models\ConfigNodePropertyInteger $initial_size */
    private $initial_size;

    /** @var \app\Models\ConfigNodePropertyInteger $max_wait */
    private $max_wait;

    /** @var \app\Models\ConfigNodePropertyInteger $max_age */
    private $max_age;

    /** @var \app\Models\ConfigNodePropertyBoolean $test_on_borrow */
    private $test_on_borrow;

    /** @var \app\Models\ConfigNodePropertyBoolean $test_on_return */
    private $test_on_return;

    /** @var \app\Models\ConfigNodePropertyBoolean $test_while_idle */
    private $test_while_idle;

    /** @var \app\Models\ConfigNodePropertyString $validation_query */
    private $validation_query;

    /** @var \app\Models\ConfigNodePropertyInteger $validation_query_timeout */
    private $validation_query_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $time_between_eviction_runs_millis */
    private $time_between_eviction_runs_millis;

    /** @var \app\Models\ConfigNodePropertyInteger $min_evictable_idle_time_millis */
    private $min_evictable_idle_time_millis;

    /** @var \app\Models\ConfigNodePropertyString $connection_properties */
    private $connection_properties;

    /** @var \app\Models\ConfigNodePropertyString $init_sql */
    private $init_sql;

    /** @var \app\Models\ConfigNodePropertyString $jdbc_interceptors */
    private $jdbc_interceptors;

    /** @var \app\Models\ConfigNodePropertyInteger $validation_interval */
    private $validation_interval;

    /** @var \app\Models\ConfigNodePropertyBoolean $log_validation_errors */
    private $log_validation_errors;

    /** @var \app\Models\ConfigNodePropertyArray $datasource_svc_properties */
    private $datasource_svc_properties;

}
