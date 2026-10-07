-module(openapi_org_apache_sling_commons_metrics_internal_log_reporter_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_metrics_internal_log_reporter_info/0]).

-type openapi_org_apache_sling_commons_metrics_internal_log_reporter_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_commons_metrics_internal_log_reporter_properties:openapi_org_apache_sling_commons_metrics_internal_log_reporter_properties()
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
