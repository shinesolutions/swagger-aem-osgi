-module(openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties/0]).

-export([openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties/0]).

-type openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties() ::
  [ {'cors_enabling', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties() ->
    openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties([]).

openapi_com_adobe_cq_social_commons_cors_cors_authentication_filter_properties(Fields) ->
  Default = [ {'cors.enabling', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

