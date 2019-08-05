-module(openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties/0]).

-type openapi_com_adobe_cq_social_calendar_servlets_time_zone_servlet_properties() ::
    #{ 'timezones_expirytime' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'timezones_expirytime' := TimezonesExpirytime
        }) ->
    #{ 'timezones.expirytime' => TimezonesExpirytime
     }.
