-module(openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties() ::
  [ {'context_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties(Fields) ->
  Default = [ {'context.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

