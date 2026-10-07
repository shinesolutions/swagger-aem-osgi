-module(openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties/0]).

-export([openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties/1]).

-export_type([openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties/0]).

-type openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties() ::
  [ {'attachmentTypeBlacklist', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'extension_order', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties() ->
    openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties([]).

openapi_com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_properties(Fields) ->
  Default = [ {'attachmentTypeBlacklist', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'extension.order', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

