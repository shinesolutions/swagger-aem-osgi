-module(openapi_com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_properties() ::
    #{ 'parameter_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'parameter_whitelist_prefixes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'binary_parameter_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'modifier_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'operation_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'operation_whitelist_prefixes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'typehint_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'resourcetype_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'parameter_whitelist' := ParameterWhitelist,
          'parameter_whitelist_prefixes' := ParameterWhitelistPrefixes,
          'binary_parameter_whitelist' := BinaryParameterWhitelist,
          'modifier_whitelist' := ModifierWhitelist,
          'operation_whitelist' := OperationWhitelist,
          'operation_whitelist_prefixes' := OperationWhitelistPrefixes,
          'typehint_whitelist' := TypehintWhitelist,
          'resourcetype_whitelist' := ResourcetypeWhitelist
        }) ->
    #{ 'parameter.whitelist' => ParameterWhitelist,
       'parameter.whitelist.prefixes' => ParameterWhitelistPrefixes,
       'binary.parameter.whitelist' => BinaryParameterWhitelist,
       'modifier.whitelist' => ModifierWhitelist,
       'operation.whitelist' => OperationWhitelist,
       'operation.whitelist.prefixes' => OperationWhitelistPrefixes,
       'typehint.whitelist' => TypehintWhitelist,
       'resourcetype.whitelist' => ResourcetypeWhitelist
     }.
