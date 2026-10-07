-module(openapi_org_apache_felix_scr_scr_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_scr_scr_service_properties/0]).

-export([openapi_org_apache_felix_scr_scr_service_properties/1]).

-export_type([openapi_org_apache_felix_scr_scr_service_properties/0]).

-type openapi_org_apache_felix_scr_scr_service_properties() ::
  [ {'ds_loglevel', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'ds_factory_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ds_delayed_keepInstances', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'ds_lock_timeout_milliseconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ds_stop_timeout_milliseconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'ds_global_extender', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_felix_scr_scr_service_properties() ->
    openapi_org_apache_felix_scr_scr_service_properties([]).

openapi_org_apache_felix_scr_scr_service_properties(Fields) ->
  Default = [ {'ds.loglevel', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'ds.factory.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ds.delayed.keepInstances', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'ds.lock.timeout.milliseconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ds.stop.timeout.milliseconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'ds.global.extender', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

