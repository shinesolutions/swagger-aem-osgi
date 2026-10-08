-module(openapi_org_apache_sling_event_jobs_queue_configuration_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_event_jobs_queue_configuration_properties/0]).

-export([openapi_org_apache_sling_event_jobs_queue_configuration_properties/1]).

-export_type([openapi_org_apache_sling_event_jobs_queue_configuration_properties/0]).

-type openapi_org_apache_sling_event_jobs_queue_configuration_properties() ::
  [ {'queue_name', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'queue_topics', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'queue_type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'queue_priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  | {'queue_retries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queue_retrydelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'queue_maxparallel', openapi_config_node_property_float:openapi_config_node_property_float() }
  | {'queue_keepJobs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'queue_preferRunOnCreationInstance', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'queue_threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_event_jobs_queue_configuration_properties() ->
    openapi_org_apache_sling_event_jobs_queue_configuration_properties([]).

openapi_org_apache_sling_event_jobs_queue_configuration_properties(Fields) ->
  Default = [ {'queue.name', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'queue.topics', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'queue.type', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'queue.priority', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            , {'queue.retries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queue.retrydelay', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'queue.maxparallel', openapi_config_node_property_float:openapi_config_node_property_float() }
            , {'queue.keepJobs', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'queue.preferRunOnCreationInstance', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'queue.threadPoolSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

