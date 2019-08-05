-module(openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties/0]).

-type openapi_com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_properties() ::
    #{ 'portal_outboxes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'draft_data_service' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'draft_metadata_service' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'submit_data_service' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'submit_metadata_service' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pendingSign_data_service' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pendingSign_metadata_service' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'portal_outboxes' := PortalOutboxes,
          'draft_data_service' := DraftDataService,
          'draft_metadata_service' := DraftMetadataService,
          'submit_data_service' := SubmitDataService,
          'submit_metadata_service' := SubmitMetadataService,
          'pendingSign_data_service' := PendingSignDataService,
          'pendingSign_metadata_service' := PendingSignMetadataService
        }) ->
    #{ 'portal.outboxes' => PortalOutboxes,
       'draft.data.service' => DraftDataService,
       'draft.metadata.service' => DraftMetadataService,
       'submit.data.service' => SubmitDataService,
       'submit.metadata.service' => SubmitMetadataService,
       'pendingSign.data.service' => PendingSignDataService,
       'pendingSign.metadata.service' => PendingSignMetadataService
     }.
