-module(openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties/0]).

-export([openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties/1]).

-export_type([openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties/0]).

-type openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties() ::
  [ {'htmlparser_processTags', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmlparser_preserveCamelCase', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties() ->
    openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties([]).

openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties(Fields) ->
  Default = [ {'htmlparser.processTags', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmlparser.preserveCamelCase', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

