-module(openapi_com_adobe_granite_infocollector_info_collector_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_infocollector_info_collector_info/0]).

-type openapi_com_adobe_granite_infocollector_info_collector_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_infocollector_info_collector_properties:openapi_com_adobe_granite_infocollector_info_collector_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
