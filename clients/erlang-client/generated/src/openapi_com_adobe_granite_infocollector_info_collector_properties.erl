-module(openapi_com_adobe_granite_infocollector_info_collector_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_infocollector_info_collector_properties/0]).

-type openapi_com_adobe_granite_infocollector_info_collector_properties() ::
    #{ 'granite_infocollector_includeThreadDumps' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'granite_infocollector_includeHeapDump' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'granite_infocollector_includeThreadDumps' := GraniteInfocollectorIncludeThreadDumps,
          'granite_infocollector_includeHeapDump' := GraniteInfocollectorIncludeHeapDump
        }) ->
    #{ 'granite.infocollector.includeThreadDumps' => GraniteInfocollectorIncludeThreadDumps,
       'granite.infocollector.includeHeapDump' => GraniteInfocollectorIncludeHeapDump
     }.
