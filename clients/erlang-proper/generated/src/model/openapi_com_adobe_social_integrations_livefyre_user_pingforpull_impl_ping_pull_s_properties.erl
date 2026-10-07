-module(openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties/0]).

-export([openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties/1]).

-export_type([openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties/0]).

-type openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties() ::
  [ {'communities_integration_livefyre_sling_event_filter', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties() ->
    openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties([]).

openapi_com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_properties(Fields) ->
  Default = [ {'communities.integration.livefyre.sling.event.filter', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

