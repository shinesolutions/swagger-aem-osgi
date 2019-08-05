-module(openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_info/0]).

-type openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties:openapi_com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_properties()
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
