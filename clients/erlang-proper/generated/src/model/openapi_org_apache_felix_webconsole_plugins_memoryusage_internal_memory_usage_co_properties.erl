-module(openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties).

-include("openapi.hrl").

-export([openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties/0]).

-export([openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties/1]).

-export_type([openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties/0]).

-type openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties() ::
  [ {'felix_memoryusage_dump_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'felix_memoryusage_dump_interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'felix_memoryusage_dump_location', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties() ->
    openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties([]).

openapi_org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_properties(Fields) ->
  Default = [ {'felix.memoryusage.dump.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'felix.memoryusage.dump.interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'felix.memoryusage.dump.location', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

