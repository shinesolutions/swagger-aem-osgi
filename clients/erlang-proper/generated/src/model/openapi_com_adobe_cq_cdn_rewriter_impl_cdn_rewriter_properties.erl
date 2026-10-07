-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties/0]).

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cdnrewriter_attributes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cdn_rewriter_distribution_domain', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties() ->
    openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties([]).

openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cdnrewriter.attributes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cdn.rewriter.distribution.domain', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

