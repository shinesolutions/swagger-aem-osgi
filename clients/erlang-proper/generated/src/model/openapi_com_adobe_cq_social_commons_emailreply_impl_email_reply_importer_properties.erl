-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties() ::
  [ {'connectProtocol', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties(Fields) ->
  Default = [ {'connectProtocol', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

