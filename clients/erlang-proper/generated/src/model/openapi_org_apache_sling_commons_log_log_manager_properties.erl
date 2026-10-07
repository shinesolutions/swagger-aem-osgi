-module(openapi_org_apache_sling_commons_log_log_manager_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_log_log_manager_properties/0]).

-export([openapi_org_apache_sling_commons_log_log_manager_properties/1]).

-export_type([openapi_org_apache_sling_commons_log_log_manager_properties/0]).

-type openapi_org_apache_sling_commons_log_log_manager_properties() ::
  [ {'org_apache_sling_commons_log_level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'org_apache_sling_commons_log_file', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_file_number', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_sling_commons_log_file_size', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_configurationFile', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'org_apache_sling_commons_log_packagingDataEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'org_apache_sling_commons_log_maxCallerDataDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_sling_commons_log_maxOldFileCountInDump', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'org_apache_sling_commons_log_numOfLines', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_commons_log_log_manager_properties() ->
    openapi_org_apache_sling_commons_log_log_manager_properties([]).

openapi_org_apache_sling_commons_log_log_manager_properties(Fields) ->
  Default = [ {'org.apache.sling.commons.log.level', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'org.apache.sling.commons.log.file', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.file.number', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.sling.commons.log.file.size', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.pattern', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.configurationFile', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'org.apache.sling.commons.log.packagingDataEnabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'org.apache.sling.commons.log.maxCallerDataDepth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.sling.commons.log.maxOldFileCountInDump', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'org.apache.sling.commons.log.numOfLines', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

