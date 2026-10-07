-module(openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties/0]).

-export([openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties() ::
  [ {'cq_analytics_testandtarget_accountoptionsupdater_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties() ->
    openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties([]).

openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties(Fields) ->
  Default = [ {'cq.analytics.testandtarget.accountoptionsupdater.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

