-module(openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_info/0]).

-type openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties:openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties()
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