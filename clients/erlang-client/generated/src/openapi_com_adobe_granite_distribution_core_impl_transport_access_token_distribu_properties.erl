-module(openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties/0]).

-type openapi_com_adobe_granite_distribution_core_impl_transport_access_token_distribu_properties() ::
    #{ 'name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'serviceName' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'userId' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'accessTokenProvider_target' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'name' := Name,
          'serviceName' := ServiceName,
          'userId' := UserId,
          'accessTokenProvider_target' := AccessTokenProviderTarget
        }) ->
    #{ 'name' => Name,
       'serviceName' => ServiceName,
       'userId' => UserId,
       'accessTokenProvider.target' => AccessTokenProviderTarget
     }.
