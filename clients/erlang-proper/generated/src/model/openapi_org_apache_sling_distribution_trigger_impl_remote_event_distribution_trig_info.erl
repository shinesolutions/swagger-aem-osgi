-module(openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties:openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info() ->
    openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info([]).

openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties:openapi_org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

