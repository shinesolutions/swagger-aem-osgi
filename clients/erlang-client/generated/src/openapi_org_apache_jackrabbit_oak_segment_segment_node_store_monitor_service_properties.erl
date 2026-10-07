-module(openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties/0]).

-type openapi_org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_properties() ::
    #{ 'commitsTrackerWriterGroups' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'commitsTrackerWriterGroups' := CommitsTrackerWriterGroups
        }) ->
    #{ 'commitsTrackerWriterGroups' => CommitsTrackerWriterGroups
     }.
