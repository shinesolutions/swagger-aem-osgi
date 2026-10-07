-module(openapi_com_day_cq_analytics_impl_store_properties_change_listener_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_impl_store_properties_change_listener_info/0]).

-type openapi_com_day_cq_analytics_impl_store_properties_change_listener_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties:openapi_com_day_cq_analytics_impl_store_properties_change_listener_properties()
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
