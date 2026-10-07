-module(openapi_apache_sling_health_check_result_html_serializer_properties).

-include("openapi.hrl").

-export([openapi_apache_sling_health_check_result_html_serializer_properties/0]).

-export([openapi_apache_sling_health_check_result_html_serializer_properties/1]).

-export_type([openapi_apache_sling_health_check_result_html_serializer_properties/0]).

-type openapi_apache_sling_health_check_result_html_serializer_properties() ::
  [ {'styleString', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_apache_sling_health_check_result_html_serializer_properties() ->
    openapi_apache_sling_health_check_result_html_serializer_properties([]).

openapi_apache_sling_health_check_result_html_serializer_properties(Fields) ->
  Default = [ {'styleString', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

