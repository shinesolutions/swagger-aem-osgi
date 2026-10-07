-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'user_mapping' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'user_mapping' := UserMapping
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'user.mapping' => UserMapping
     }.
