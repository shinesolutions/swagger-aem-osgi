-module(openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties/0]).

-type openapi_com_adobe_granite_frags_impl_check_http_header_flag_properties() ::
    #{ 'feature_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'feature_description' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'http_header_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'http_header_valuepattern' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'feature_name' := FeatureName,
          'feature_description' := FeatureDescription,
          'http_header_name' := HttpHeaderName,
          'http_header_valuepattern' := HttpHeaderValuepattern
        }) ->
    #{ 'feature.name' => FeatureName,
       'feature.description' => FeatureDescription,
       'http.header.name' => HttpHeaderName,
       'http.header.valuepattern' => HttpHeaderValuepattern
     }.
