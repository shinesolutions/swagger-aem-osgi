-module(openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info/0]).

-type openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties:openapi_com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_properties()
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
