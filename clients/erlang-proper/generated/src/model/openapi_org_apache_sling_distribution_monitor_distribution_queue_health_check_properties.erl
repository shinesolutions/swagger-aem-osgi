-module(openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties/0]).

-export([openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties/1]).

-export_type([openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties/0]).

-type openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties() ::
  [ {'hc_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'hc_mbean_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'numberOfRetriesAllowed', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties() ->
    openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties([]).

openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties(Fields) ->
  Default = [ {'hc.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'hc.mbean.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'numberOfRetriesAllowed', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

