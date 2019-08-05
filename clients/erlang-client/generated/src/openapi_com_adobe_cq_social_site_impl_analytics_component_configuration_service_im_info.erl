-module(openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_info/0]).

-type openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties:openapi_com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_properties()
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
