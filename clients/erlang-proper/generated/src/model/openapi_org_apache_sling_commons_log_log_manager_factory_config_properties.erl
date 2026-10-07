-module(openapi_org_apache_sling_commons_log_log_manager_factory_config_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_log_log_manager_factory_config_properties/0]).

-export([openapi_org_apache_sling_commons_log_log_manager_factory_config_properties/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_config_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_config_properties() ::
  [ {'org_apache_sling_commons_log_level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'org_apache_sling_commons_log_file', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_names', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'org_apache_sling_commons_log_additiv', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_commons_log_log_manager_factory_config_properties() ->
    openapi_org_apache_sling_commons_log_log_manager_factory_config_properties([]).

openapi_org_apache_sling_commons_log_log_manager_factory_config_properties(Fields) ->
  Default = [ {'org.apache.sling.commons.log.level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'org.apache.sling.commons.log.file', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.names', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'org.apache.sling.commons.log.additiv', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

