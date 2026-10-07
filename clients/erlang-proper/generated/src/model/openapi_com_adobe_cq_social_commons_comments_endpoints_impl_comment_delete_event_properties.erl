-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties/0]).

-export([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties() ::
  [ {'ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties() ->
    openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties([]).

openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties(Fields) ->
  Default = [ {'ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

