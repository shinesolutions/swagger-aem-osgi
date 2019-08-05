-module(openapi_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_info).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_info/0]).

-type openapi_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_properties:openapi_com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_properties()
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
