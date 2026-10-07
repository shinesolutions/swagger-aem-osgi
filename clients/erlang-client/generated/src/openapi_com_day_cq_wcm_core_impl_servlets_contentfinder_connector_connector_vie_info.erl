-module(openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_info).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_info/0]).

-type openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties:openapi_com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_properties()
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
