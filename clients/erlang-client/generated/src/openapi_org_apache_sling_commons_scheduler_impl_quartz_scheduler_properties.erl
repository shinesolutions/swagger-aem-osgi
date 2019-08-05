-module(openapi_org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties/0]).

-type openapi_org_apache_sling_commons_scheduler_impl_quartz_scheduler_properties() ::
    #{ 'poolName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'allowedPoolNames' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'scheduler_useleaderforsingle' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'metrics_filters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'slowThresholdMillis' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'poolName' := PoolName,
          'allowedPoolNames' := AllowedPoolNames,
          'scheduler_useleaderforsingle' := SchedulerUseleaderforsingle,
          'metrics_filters' := MetricsFilters,
          'slowThresholdMillis' := SlowThresholdMillis
        }) ->
    #{ 'poolName' => PoolName,
       'allowedPoolNames' => AllowedPoolNames,
       'scheduler.useleaderforsingle' => SchedulerUseleaderforsingle,
       'metrics.filters' => MetricsFilters,
       'slowThresholdMillis' => SlowThresholdMillis
     }.
