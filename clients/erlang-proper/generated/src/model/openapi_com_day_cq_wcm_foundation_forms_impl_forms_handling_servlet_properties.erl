-module(openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties/0]).

-type openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties() ::
  [ {'name_whitelist', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'allow_expressions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties() ->
    openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties([]).

openapi_com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_properties(Fields) ->
  Default = [ {'name.whitelist', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'allow.expressions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

