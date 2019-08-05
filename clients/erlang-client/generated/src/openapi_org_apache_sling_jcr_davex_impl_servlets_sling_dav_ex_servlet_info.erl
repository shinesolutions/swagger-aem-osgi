-module(openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info/0]).

-type openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties:openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties()
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
