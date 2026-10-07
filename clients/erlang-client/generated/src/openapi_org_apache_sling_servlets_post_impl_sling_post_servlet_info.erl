-module(openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_info/0]).

-type openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties:openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties()
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
