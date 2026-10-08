-module(openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties).

-include("openapi.hrl").

-export([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties/0]).

-export([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties() ::
  [ {'commitsTrackerWriterGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties() ->
    openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties([]).

openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties(Fields) ->
  Default = [ {'commitsTrackerWriterGroups', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

