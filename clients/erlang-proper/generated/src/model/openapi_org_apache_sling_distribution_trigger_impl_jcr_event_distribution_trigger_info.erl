-module(openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties:openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info() ->
    openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info([]).

openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties:openapi_org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

