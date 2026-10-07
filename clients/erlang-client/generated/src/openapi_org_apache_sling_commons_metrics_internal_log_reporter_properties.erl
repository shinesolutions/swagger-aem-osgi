-module(openapi_org_apache_sling_commons_metrics_internal_log_reporter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_metrics_internal_log_reporter_properties/0]).

-type openapi_org_apache_sling_commons_metrics_internal_log_reporter_properties() ::
    #{ 'period' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'timeUnit' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'level' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'loggerName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'prefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'registryName' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'period' := Period,
          'timeUnit' := TimeUnit,
          'level' := Level,
          'loggerName' := LoggerName,
          'prefix' := Prefix,
          'pattern' := Pattern,
          'registryName' := RegistryName
        }) ->
    #{ 'period' => Period,
       'timeUnit' => TimeUnit,
       'level' => Level,
       'loggerName' => LoggerName,
       'prefix' => Prefix,
       'pattern' => Pattern,
       'registryName' => RegistryName
     }.
