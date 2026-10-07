-module(openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info/0]).

-export([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info/1]).

-export_type([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info/0]).

-type openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties:openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties() }
  ].


openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info() ->
    openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info([]).

openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties:openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

