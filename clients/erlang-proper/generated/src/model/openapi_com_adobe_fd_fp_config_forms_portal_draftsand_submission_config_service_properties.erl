-module(openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties/0]).

-export([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties/1]).

-export_type([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties/0]).

-type openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties() ::
  [ {'portal_outboxes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'draft_data_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'draft_metadata_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'submit_data_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'submit_metadata_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pendingSign_data_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pendingSign_metadata_service', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties() ->
    openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties([]).

openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties(Fields) ->
  Default = [ {'portal.outboxes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'draft.data.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'draft.metadata.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'submit.data.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'submit.metadata.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pendingSign.data.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pendingSign.metadata.service', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

