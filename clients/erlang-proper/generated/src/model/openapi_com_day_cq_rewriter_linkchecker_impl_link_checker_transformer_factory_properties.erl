-module(openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties/0]).

-export([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties/1]).

-export_type([openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties/0]).

-type openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties() ::
  [ {'linkcheckertransformer_disableRewriting', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'linkcheckertransformer_disableChecking', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'linkcheckertransformer_mapCacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'linkcheckertransformer_strictExtensionCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'linkcheckertransformer_stripHtmltExtension', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'linkcheckertransformer_rewriteElements', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'linkcheckertransformer_stripExtensionPathBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties() ->
    openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties([]).

openapi_com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_properties(Fields) ->
  Default = [ {'linkcheckertransformer.disableRewriting', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'linkcheckertransformer.disableChecking', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'linkcheckertransformer.mapCacheSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'linkcheckertransformer.strictExtensionCheck', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'linkcheckertransformer.stripHtmltExtension', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'linkcheckertransformer.rewriteElements', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'linkcheckertransformer.stripExtensionPathBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

