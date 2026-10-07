-module(openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info/0]).

-export([openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info/0]).

-type openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties:openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties() }
  ].


openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info() ->
    openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info([]).

openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties:openapi_com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

