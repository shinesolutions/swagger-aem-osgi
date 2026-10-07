-module(openapi_com_adobe_granite_frags_impl_random_feature_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_frags_impl_random_feature_properties/0]).

-type openapi_com_adobe_granite_frags_impl_random_feature_properties() ::
    #{ 'feature_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'feature_description' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'active_percentage' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cookie_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cookie_maxAge' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'feature_name' := FeatureName,
          'feature_description' := FeatureDescription,
          'active_percentage' := ActivePercentage,
          'cookie_name' := CookieName,
          'cookie_maxAge' := CookieMaxAge
        }) ->
    #{ 'feature.name' => FeatureName,
       'feature.description' => FeatureDescription,
       'active.percentage' => ActivePercentage,
       'cookie.name' => CookieName,
       'cookie.maxAge' => CookieMaxAge
     }.
