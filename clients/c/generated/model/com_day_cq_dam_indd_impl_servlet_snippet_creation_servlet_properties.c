#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties.h"



static com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_create_internal(
    config_node_property_integer_t *snippetcreation_maxcollections
    ) {
    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var = malloc(sizeof(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t));
    if (!com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var, 0, sizeof(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t));
    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var->_library_owned = 1;
    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var->snippetcreation_maxcollections = snippetcreation_maxcollections;
    return com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_create(
    config_node_property_integer_t *snippetcreation_maxcollections
    ) {
    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *result = com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_create_internal (
        snippetcreation_maxcollections
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_free(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties) {
    if(NULL == com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties){
        return ;
    }
    if(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections) {
        config_node_property_integer_free(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections);
        com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections = NULL;
    }
    free(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties);
}

cJSON *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_convertToJSON(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections
    if(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections) {
    cJSON *snippetcreation_maxcollections_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections);
    if(snippetcreation_maxcollections_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "snippetcreation.maxcollections", snippetcreation_maxcollections_local_JSON);
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

com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_parseFromJSON(cJSON *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_propertiesJSON){

    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_t *com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var = NULL;

    // define the local variable for com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections
    config_node_property_integer_t *snippetcreation_maxcollections_local_nonprim = NULL;

    // com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties->snippetcreation_maxcollections
    cJSON *snippetcreation_maxcollections = cJSON_GetObjectItemCaseSensitive(com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_propertiesJSON, "snippetcreation.maxcollections");
    if (cJSON_IsNull(snippetcreation_maxcollections)) {
        snippetcreation_maxcollections = NULL;
    }
    if (snippetcreation_maxcollections) { 
    snippetcreation_maxcollections_local_nonprim = config_node_property_integer_parseFromJSON(snippetcreation_maxcollections); //nonprimitive
    }



    com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var = com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_create_internal (
        snippetcreation_maxcollections ? snippetcreation_maxcollections_local_nonprim : NULL
        );

    if (!com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var) {
        goto end;
    }

    return com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_properties_local_var;
end:
    if (snippetcreation_maxcollections_local_nonprim) {
        config_node_property_integer_free(snippetcreation_maxcollections_local_nonprim);
        snippetcreation_maxcollections_local_nonprim = NULL;
    }
    return NULL;

}
