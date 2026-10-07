-module(openapi_com_day_cq_wcm_undo_undo_config_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_undo_undo_config_properties/0]).

-type openapi_com_day_cq_wcm_undo_undo_config_properties() ::
    #{ 'cq_wcm_undo_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_wcm_undo_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_wcm_undo_validity' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_wcm_undo_steps' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'cq_wcm_undo_persistence' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_wcm_undo_persistence_mode' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'cq_wcm_undo_markermode' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'cq_wcm_undo_whitelist' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'cq_wcm_undo_blacklist' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'cq_wcm_undo_enabled' := CqWcmUndoEnabled,
          'cq_wcm_undo_path' := CqWcmUndoPath,
          'cq_wcm_undo_validity' := CqWcmUndoValidity,
          'cq_wcm_undo_steps' := CqWcmUndoSteps,
          'cq_wcm_undo_persistence' := CqWcmUndoPersistence,
          'cq_wcm_undo_persistence_mode' := CqWcmUndoPersistenceMode,
          'cq_wcm_undo_markermode' := CqWcmUndoMarkermode,
          'cq_wcm_undo_whitelist' := CqWcmUndoWhitelist,
          'cq_wcm_undo_blacklist' := CqWcmUndoBlacklist
        }) ->
    #{ 'cq.wcm.undo.enabled' => CqWcmUndoEnabled,
       'cq.wcm.undo.path' => CqWcmUndoPath,
       'cq.wcm.undo.validity' => CqWcmUndoValidity,
       'cq.wcm.undo.steps' => CqWcmUndoSteps,
       'cq.wcm.undo.persistence' => CqWcmUndoPersistence,
       'cq.wcm.undo.persistence.mode' => CqWcmUndoPersistenceMode,
       'cq.wcm.undo.markermode' => CqWcmUndoMarkermode,
       'cq.wcm.undo.whitelist' => CqWcmUndoWhitelist,
       'cq.wcm.undo.blacklist' => CqWcmUndoBlacklist
     }.
