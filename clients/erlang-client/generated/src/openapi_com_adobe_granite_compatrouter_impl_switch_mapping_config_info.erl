-module(openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_info/0]).

-type openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties:openapi_com_adobe_granite_compatrouter_impl_switch_mapping_config_properties()
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
