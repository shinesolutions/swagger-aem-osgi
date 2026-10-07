-module(openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties/0]).

-type openapi_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_properties() ::
    #{ 'user_mapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'user_default' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'user_enable_default_mapping' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'require_validation' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'user_mapping' := UserMapping,
          'user_default' := UserDefault,
          'user_enable_default_mapping' := UserEnableDefaultMapping,
          'require_validation' := RequireValidation
        }) ->
    #{ 'user.mapping' => UserMapping,
       'user.default' => UserDefault,
       'user.enable.default.mapping' => UserEnableDefaultMapping,
       'require.validation' => RequireValidation
     }.
