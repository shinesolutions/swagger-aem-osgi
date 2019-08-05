-module(openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info/0]).

-type openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties:openapi_com_adobe_granite_resourcestatus_impl_composite_status_type_properties()
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
