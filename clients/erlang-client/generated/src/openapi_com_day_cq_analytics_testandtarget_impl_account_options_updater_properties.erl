-module(openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties/0]).

-type openapi_com_day_cq_analytics_testandtarget_impl_account_options_updater_properties() ::
    #{ 'cq_analytics_testandtarget_accountoptionsupdater_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'cq_analytics_testandtarget_accountoptionsupdater_enabled' := CqAnalyticsTestandtargetAccountoptionsupdaterEnabled
        }) ->
    #{ 'cq.analytics.testandtarget.accountoptionsupdater.enabled' => CqAnalyticsTestandtargetAccountoptionsupdaterEnabled
     }.
