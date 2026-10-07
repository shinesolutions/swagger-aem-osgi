-module(openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties/0]).

-export([openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties() ::
  [ {'enableScheduledPostsSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'numberOfMinutes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxSearchLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties() ->
    openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties([]).

openapi_com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_properties(Fields) ->
  Default = [ {'enableScheduledPostsSearch', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'numberOfMinutes', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxSearchLimit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

