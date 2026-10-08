-module(openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties() ::
  [ {'org_apache_sling_installer_configuration_persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'primary_host', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'primary_allowed_client_ip_ranges', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'secure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'standby_readtimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'standby_autoclean', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties() ->
    openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties([]).

openapi_org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties(Fields) ->
  Default = [ {'org.apache.sling.installer.configuration.persist', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'mode', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'port', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'primary.host', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'primary.allowed-client-ip-ranges', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'secure', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'standby.readtimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'standby.autoclean', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

