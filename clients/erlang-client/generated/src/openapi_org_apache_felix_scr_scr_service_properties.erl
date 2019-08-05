-module(openapi_org_apache_felix_scr_scr_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_scr_scr_service_properties/0]).

-type openapi_org_apache_felix_scr_scr_service_properties() ::
    #{ 'ds_loglevel' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'ds_factory_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ds_delayed_keepInstances' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'ds_lock_timeout_milliseconds' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'ds_stop_timeout_milliseconds' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'ds_global_extender' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'ds_loglevel' := DsLoglevel,
          'ds_factory_enabled' := DsFactoryEnabled,
          'ds_delayed_keepInstances' := DsDelayedKeepInstances,
          'ds_lock_timeout_milliseconds' := DsLockTimeoutMilliseconds,
          'ds_stop_timeout_milliseconds' := DsStopTimeoutMilliseconds,
          'ds_global_extender' := DsGlobalExtender
        }) ->
    #{ 'ds.loglevel' => DsLoglevel,
       'ds.factory.enabled' => DsFactoryEnabled,
       'ds.delayed.keepInstances' => DsDelayedKeepInstances,
       'ds.lock.timeout.milliseconds' => DsLockTimeoutMilliseconds,
       'ds.stop.timeout.milliseconds' => DsStopTimeoutMilliseconds,
       'ds.global.extender' => DsGlobalExtender
     }.
