-module(openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties/0]).

-type openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties() ::
    #{ 'parser_features' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'parser_features' := ParserFeatures
        }) ->
    #{ 'parser.features' => ParserFeatures
     }.
