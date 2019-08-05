-module(openapi_apache_sling_health_check_result_html_serializer_properties).

-export([encode/1]).

-export_type([openapi_apache_sling_health_check_result_html_serializer_properties/0]).

-type openapi_apache_sling_health_check_result_html_serializer_properties() ::
    #{ 'styleString' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'styleString' := StyleString
        }) ->
    #{ 'styleString' => StyleString
     }.
