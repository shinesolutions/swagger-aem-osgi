-module(openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info/0]).

-export([openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info/1]).

-export_type([openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info/0]).

-type openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties:openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties() }
  ].


openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info() ->
    openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info([]).

openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties:openapi_org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

