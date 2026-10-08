-module(openapi_apache_sling_health_check_result_html_serializer_info).

-include("openapi.hrl").

-export([openapi_apache_sling_health_check_result_html_serializer_info/0]).

-export([openapi_apache_sling_health_check_result_html_serializer_info/1]).

-export_type([openapi_apache_sling_health_check_result_html_serializer_info/0]).

-type openapi_apache_sling_health_check_result_html_serializer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_apache_sling_health_check_result_html_serializer_properties:openapi_apache_sling_health_check_result_html_serializer_properties() }
  ].


openapi_apache_sling_health_check_result_html_serializer_info() ->
    openapi_apache_sling_health_check_result_html_serializer_info([]).

openapi_apache_sling_health_check_result_html_serializer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_apache_sling_health_check_result_html_serializer_properties:openapi_apache_sling_health_check_result_html_serializer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

