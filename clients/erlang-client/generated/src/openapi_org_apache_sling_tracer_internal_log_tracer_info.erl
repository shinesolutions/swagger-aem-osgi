-module(openapi_org_apache_sling_tracer_internal_log_tracer_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_tracer_internal_log_tracer_info/0]).

-type openapi_org_apache_sling_tracer_internal_log_tracer_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_tracer_internal_log_tracer_properties:openapi_org_apache_sling_tracer_internal_log_tracer_properties()
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
