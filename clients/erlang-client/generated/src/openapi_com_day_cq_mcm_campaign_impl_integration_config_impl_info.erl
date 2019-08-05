-module(openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_info/0]).

-type openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties:openapi_com_day_cq_mcm_campaign_impl_integration_config_impl_properties()
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
