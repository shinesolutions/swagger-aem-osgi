-module(openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties/0]).

-export([openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties/1]).

-export_type([openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties/0]).

-type openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties() ::
  [ {'email_from', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties() ->
    openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties([]).

openapi_com_day_cq_wcm_notification_email_impl_email_channel_properties(Fields) ->
  Default = [ {'email.from', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

