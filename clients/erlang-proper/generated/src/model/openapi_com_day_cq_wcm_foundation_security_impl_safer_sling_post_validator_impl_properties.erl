-module(openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties/0]).

-type openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties() ::
  [ {'parameter_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'parameter_whitelist_prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'binary_parameter_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'modifier_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'operation_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'operation_whitelist_prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'typehint_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'resourcetype_whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties() ->
    openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties([]).

openapi_com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_properties(Fields) ->
  Default = [ {'parameter.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'parameter.whitelist.prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'binary.parameter.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'modifier.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'operation.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'operation.whitelist.prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'typehint.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'resourcetype.whitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

