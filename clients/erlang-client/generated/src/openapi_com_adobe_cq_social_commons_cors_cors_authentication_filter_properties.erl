-module(openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties/0]).

-type openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties() ::
    #{ 'cors_enabling' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cors_enabling' := CorsEnabling
        }) ->
    #{ 'cors.enabling' => CorsEnabling
     }.
