-module(openapi_com_adobe_granite_workflow_core_payload_map_cache_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_workflow_core_payload_map_cache_info/0]).

-type openapi_com_adobe_granite_workflow_core_payload_map_cache_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_workflow_core_payload_map_cache_properties:openapi_com_adobe_granite_workflow_core_payload_map_cache_properties()
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
