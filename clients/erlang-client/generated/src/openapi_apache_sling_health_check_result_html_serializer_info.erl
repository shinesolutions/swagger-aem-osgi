-module(openapi_apache_sling_health_check_result_html_serializer_info).

-export([encode/1]).

-export_type([openapi_apache_sling_health_check_result_html_serializer_info/0]).

-type openapi_apache_sling_health_check_result_html_serializer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_apache_sling_health_check_result_html_serializer_properties:openapi_apache_sling_health_check_result_html_serializer_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
