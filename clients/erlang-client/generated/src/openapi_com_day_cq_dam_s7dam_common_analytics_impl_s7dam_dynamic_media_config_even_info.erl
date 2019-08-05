-module(openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info/0]).

-type openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties:openapi_com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_properties()
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
