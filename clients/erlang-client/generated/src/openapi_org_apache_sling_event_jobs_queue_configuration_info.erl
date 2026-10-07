-module(openapi_org_apache_sling_event_jobs_queue_configuration_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_jobs_queue_configuration_info/0]).

-type openapi_org_apache_sling_event_jobs_queue_configuration_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_event_jobs_queue_configuration_properties:openapi_org_apache_sling_event_jobs_queue_configuration_properties()
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
