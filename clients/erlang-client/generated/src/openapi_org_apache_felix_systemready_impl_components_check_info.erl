-module(openapi_org_apache_felix_systemready_impl_components_check_info).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_impl_components_check_info/0]).

-type openapi_org_apache_felix_systemready_impl_components_check_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_felix_systemready_impl_components_check_properties:openapi_org_apache_felix_systemready_impl_components_check_properties()
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
