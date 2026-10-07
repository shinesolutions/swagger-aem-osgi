-module(openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info).

-include("openapi.hrl").

-export([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info/0]).

-export([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info/1]).

-export_type([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info/0]).

-type openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties:openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties() }
  ].


openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info() ->
    openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info([]).

openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties:openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

