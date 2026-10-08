-module(openapi_com_day_cq_mailer_impl_cq_mailing_service_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_mailer_impl_cq_mailing_service_properties/0]).

-export([openapi_com_day_cq_mailer_impl_cq_mailing_service_properties/1]).

-export_type([openapi_com_day_cq_mailer_impl_cq_mailing_service_properties/0]).

-type openapi_com_day_cq_mailer_impl_cq_mailing_service_properties() ::
  [ {'max_recipient_count', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_mailer_impl_cq_mailing_service_properties() ->
    openapi_com_day_cq_mailer_impl_cq_mailing_service_properties([]).

openapi_com_day_cq_mailer_impl_cq_mailing_service_properties(Fields) ->
  Default = [ {'max.recipient.count', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

