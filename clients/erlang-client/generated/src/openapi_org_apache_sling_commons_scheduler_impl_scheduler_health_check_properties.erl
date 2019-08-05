-module(openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties/0]).

-type openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties() ::
    #{ 'max_quartzJob_duration_acceptable' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'max_quartzJob_duration_acceptable' := MaxQuartzJobDurationAcceptable
        }) ->
    #{ 'max.quartzJob.duration.acceptable' => MaxQuartzJobDurationAcceptable
     }.
