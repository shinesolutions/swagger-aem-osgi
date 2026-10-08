-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties:openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties:openapi_com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

