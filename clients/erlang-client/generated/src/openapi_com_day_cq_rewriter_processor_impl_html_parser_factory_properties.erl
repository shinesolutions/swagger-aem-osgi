-module(openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties/0]).

-type openapi_com_day_cq_rewriter_processor_impl_html_parser_factory_properties() ::
    #{ 'htmlparser_processTags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmlparser_preserveCamelCase' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'htmlparser_processTags' := HtmlparserProcessTags,
          'htmlparser_preserveCamelCase' := HtmlparserPreserveCamelCase
        }) ->
    #{ 'htmlparser.processTags' => HtmlparserProcessTags,
       'htmlparser.preserveCamelCase' => HtmlparserPreserveCamelCase
     }.
