-module(openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties() ::
  [ {'priorityOrder', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'replyEmailPatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_properties(Fields) ->
  Default = [ {'priorityOrder', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'replyEmailPatterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

