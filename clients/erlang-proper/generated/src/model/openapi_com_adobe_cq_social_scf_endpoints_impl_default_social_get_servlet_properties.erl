-module(openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties/0]).

-export([openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties/0]).

-type openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties() ::
  [ {'sling_servlet_selectors', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_servlet_extensions', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties() ->
    openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties([]).

openapi_com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_properties(Fields) ->
  Default = [ {'sling.servlet.selectors', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.servlet.extensions', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

