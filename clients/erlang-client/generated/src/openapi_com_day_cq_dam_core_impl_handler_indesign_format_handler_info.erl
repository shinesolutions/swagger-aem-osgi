-module(openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_info/0]).

-type openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties:openapi_com_day_cq_dam_core_impl_handler_indesign_format_handler_properties()
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
