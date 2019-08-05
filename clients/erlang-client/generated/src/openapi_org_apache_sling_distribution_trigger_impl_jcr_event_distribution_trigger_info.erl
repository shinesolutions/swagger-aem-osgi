-module(openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties:openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties()
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
