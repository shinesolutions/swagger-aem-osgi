-module(openapi_com_adobe_granite_offloading_impl_offloading_configurator_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_offloading_impl_offloading_configurator_info/0]).

-type openapi_com_adobe_granite_offloading_impl_offloading_configurator_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties:openapi_com_adobe_granite_offloading_impl_offloading_configurator_properties()
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
