-module(openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties/0]).

-export([openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties() ::
  [ {'org_apache_sling_commons_log_file', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_file_number', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_sling_commons_log_file_size', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_file_buffered', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties() ->
    openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties([]).

openapi_org_apache_sling_commons_log_log_manager_factory_writer_properties(Fields) ->
  Default = [ {'org.apache.sling.commons.log.file', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.file.number', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.sling.commons.log.file.size', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.file.buffered', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

