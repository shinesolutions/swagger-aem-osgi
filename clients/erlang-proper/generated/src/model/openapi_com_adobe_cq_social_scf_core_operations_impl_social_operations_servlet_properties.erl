-module(openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties/0]).

-export([openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties/0]).

-type openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties() ::
  [ {'sling_servlet_selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_servlet_extensions', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties() ->
    openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties([]).

openapi_com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.selectors', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.servlet.extensions', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

