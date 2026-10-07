-module(openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties/0]).

-export([openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties/0]).

-type openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties() ::
  [ {'timezones_expirytime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties() ->
    openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties([]).

openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties(Fields) ->
  Default = [ {'timezones.expirytime', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

