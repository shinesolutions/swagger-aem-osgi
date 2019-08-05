-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties() ::
    #{ 'ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'ranking' := Ranking
        }) ->
    #{ 'ranking' => Ranking
     }.
