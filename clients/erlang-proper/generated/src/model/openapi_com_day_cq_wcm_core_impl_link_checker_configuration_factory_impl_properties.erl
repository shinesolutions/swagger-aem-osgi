-module(openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties/0]).

-export([openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties/1]).

-export_type([openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties/0]).

-type openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties() ::
  [ {'link_expired_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_expired_remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'link_expired_suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_invalid_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_invalid_remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'link_invalid_suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_predated_prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_predated_remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'link_predated_suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'link_wcmmodes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties() ->
    openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties([]).

openapi_com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_properties(Fields) ->
  Default = [ {'link.expired.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.expired.remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'link.expired.suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.invalid.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.invalid.remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'link.invalid.suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.predated.prefix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.predated.remove', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'link.predated.suffix', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'link.wcmmodes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

