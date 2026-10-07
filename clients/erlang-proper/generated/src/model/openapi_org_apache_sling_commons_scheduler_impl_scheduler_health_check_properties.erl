-module(openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties/0]).

-export([openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties/1]).

-export_type([openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties/0]).

-type openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties() ::
  [ {'max_quartzJob_duration_acceptable', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties() ->
    openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties([]).

openapi_org_apache_sling_commons_scheduler_impl_scheduler_health_check_properties(Fields) ->
  Default = [ {'max.quartzJob.duration.acceptable', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

