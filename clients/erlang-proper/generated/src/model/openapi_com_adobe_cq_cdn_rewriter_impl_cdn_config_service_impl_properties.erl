-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties/0]).

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties() ::
  [ {'cdn_config_distribution_domain', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'cdn_config_enable_rewriting', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cdn_config_path_prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'cdn_config_cdnttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cdn_config_application_protocol', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties() ->
    openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties([]).

openapi_com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_properties(Fields) ->
  Default = [ {'cdn.config.distribution.domain', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'cdn.config.enable.rewriting', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cdn.config.path.prefixes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'cdn.config.cdnttl', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cdn.config.application.protocol', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

