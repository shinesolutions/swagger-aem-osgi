#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties.h"



static com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_create_internal(
    config_node_property_string_t *group2member_relationship_outgoing,
    config_node_property_array_t *group2member_excluded_outgoing,
    config_node_property_string_t *group2member_relationship_incoming,
    config_node_property_array_t *group2member_excluded_incoming
    ) {
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var = malloc(sizeof(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t));
    if (!com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var) {
        return NULL;
    }
    memset(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var, 0, sizeof(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t));
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var->_library_owned = 1;
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var->group2member_relationship_outgoing = group2member_relationship_outgoing;
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var->group2member_excluded_outgoing = group2member_excluded_outgoing;
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var->group2member_relationship_incoming = group2member_relationship_incoming;
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var->group2member_excluded_incoming = group2member_excluded_incoming;
    return com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var;
}

__attribute__((deprecated)) com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_create(
    config_node_property_string_t *group2member_relationship_outgoing,
    config_node_property_array_t *group2member_excluded_outgoing,
    config_node_property_string_t *group2member_relationship_incoming,
    config_node_property_array_t *group2member_excluded_incoming
    ) {
    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *result = com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_create_internal (
        group2member_relationship_outgoing,
        group2member_excluded_outgoing,
        group2member_relationship_incoming,
        group2member_excluded_incoming
        );
    if (!result) {
    }
    return result;
}

void com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties) {
    if(NULL == com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties){
        return ;
    }
    if(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing) {
        config_node_property_string_free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing);
        com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing = NULL;
    }
    if (com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing) {
        config_node_property_array_free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing);
        com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing = NULL;
    }
    if (com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming) {
        config_node_property_string_free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming);
        com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming = NULL;
    }
    if (com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming) {
        config_node_property_array_free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming);
        com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming = NULL;
    }
    free(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties);
}

cJSON *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_convertToJSON(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing
    if(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing) {
    cJSON *group2member_relationship_outgoing_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing);
    if(group2member_relationship_outgoing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group2member.relationship.outgoing", group2member_relationship_outgoing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing
    if(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing) {
    cJSON *group2member_excluded_outgoing_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing);
    if(group2member_excluded_outgoing_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group2member.excluded.outgoing", group2member_excluded_outgoing_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming
    if(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming) {
    cJSON *group2member_relationship_incoming_local_JSON = config_node_property_string_convertToJSON(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming);
    if(group2member_relationship_incoming_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group2member.relationship.incoming", group2member_relationship_incoming_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming
    if(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming) {
    cJSON *group2member_excluded_incoming_local_JSON = config_node_property_array_convertToJSON(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming);
    if(group2member_excluded_incoming_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "group2member.excluded.incoming", group2member_excluded_incoming_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_parseFromJSON(cJSON *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_propertiesJSON){

    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_t *com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var = NULL;

    // define the local variable for com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing
    config_node_property_string_t *group2member_relationship_outgoing_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing
    config_node_property_array_t *group2member_excluded_outgoing_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming
    config_node_property_string_t *group2member_relationship_incoming_local_nonprim = NULL;

    // define the local variable for com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming
    config_node_property_array_t *group2member_excluded_incoming_local_nonprim = NULL;

    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_outgoing
    cJSON *group2member_relationship_outgoing = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_propertiesJSON, "group2member.relationship.outgoing");
    if (cJSON_IsNull(group2member_relationship_outgoing)) {
        group2member_relationship_outgoing = NULL;
    }
    if (group2member_relationship_outgoing) { 
    group2member_relationship_outgoing_local_nonprim = config_node_property_string_parseFromJSON(group2member_relationship_outgoing); //nonprimitive
    }

    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_outgoing
    cJSON *group2member_excluded_outgoing = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_propertiesJSON, "group2member.excluded.outgoing");
    if (cJSON_IsNull(group2member_excluded_outgoing)) {
        group2member_excluded_outgoing = NULL;
    }
    if (group2member_excluded_outgoing) { 
    group2member_excluded_outgoing_local_nonprim = config_node_property_array_parseFromJSON(group2member_excluded_outgoing); //nonprimitive
    }

    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_relationship_incoming
    cJSON *group2member_relationship_incoming = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_propertiesJSON, "group2member.relationship.incoming");
    if (cJSON_IsNull(group2member_relationship_incoming)) {
        group2member_relationship_incoming = NULL;
    }
    if (group2member_relationship_incoming) { 
    group2member_relationship_incoming_local_nonprim = config_node_property_string_parseFromJSON(group2member_relationship_incoming); //nonprimitive
    }

    // com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties->group2member_excluded_incoming
    cJSON *group2member_excluded_incoming = cJSON_GetObjectItemCaseSensitive(com_adobe_granite_socialgraph_impl_social_graph_factory_impl_propertiesJSON, "group2member.excluded.incoming");
    if (cJSON_IsNull(group2member_excluded_incoming)) {
        group2member_excluded_incoming = NULL;
    }
    if (group2member_excluded_incoming) { 
    group2member_excluded_incoming_local_nonprim = config_node_property_array_parseFromJSON(group2member_excluded_incoming); //nonprimitive
    }



    com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var = com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_create_internal (
        group2member_relationship_outgoing ? group2member_relationship_outgoing_local_nonprim : NULL,
        group2member_excluded_outgoing ? group2member_excluded_outgoing_local_nonprim : NULL,
        group2member_relationship_incoming ? group2member_relationship_incoming_local_nonprim : NULL,
        group2member_excluded_incoming ? group2member_excluded_incoming_local_nonprim : NULL
        );

    if (!com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var) {
        goto end;
    }

    return com_adobe_granite_socialgraph_impl_social_graph_factory_impl_properties_local_var;
end:
    if (group2member_relationship_outgoing_local_nonprim) {
        config_node_property_string_free(group2member_relationship_outgoing_local_nonprim);
        group2member_relationship_outgoing_local_nonprim = NULL;
    }
    if (group2member_excluded_outgoing_local_nonprim) {
        config_node_property_array_free(group2member_excluded_outgoing_local_nonprim);
        group2member_excluded_outgoing_local_nonprim = NULL;
    }
    if (group2member_relationship_incoming_local_nonprim) {
        config_node_property_string_free(group2member_relationship_incoming_local_nonprim);
        group2member_relationship_incoming_local_nonprim = NULL;
    }
    if (group2member_excluded_incoming_local_nonprim) {
        config_node_property_array_free(group2member_excluded_incoming_local_nonprim);
        group2member_excluded_incoming_local_nonprim = NULL;
    }
    return NULL;

}
