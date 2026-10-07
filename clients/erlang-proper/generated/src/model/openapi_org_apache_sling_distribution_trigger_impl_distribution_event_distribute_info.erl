-module(openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties:openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info() ->
    openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info([]).

openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties:openapi_org_apache_sling_distribution_trigger_impl_distribution_event_distribute_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

