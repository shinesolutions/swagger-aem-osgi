-module(openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_info/0]).

-type openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties:openapi_com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_properties()
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
