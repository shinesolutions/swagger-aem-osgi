-module(openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_info/0]).

-type openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties:openapi_com_adobe_cq_wcm_launches_impl_launches_event_handler_properties()
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
