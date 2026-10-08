#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_sling_event_impl_eventing_thread_pool_properties.h"



static org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties_create_internal(
    config_node_property_integer_t *min_pool_size
    ) {
    org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties_local_var = malloc(sizeof(org_apache_sling_event_impl_eventing_thread_pool_properties_t));
    if (!org_apache_sling_event_impl_eventing_thread_pool_properties_local_var) {
        return NULL;
    }
    memset(org_apache_sling_event_impl_eventing_thread_pool_properties_local_var, 0, sizeof(org_apache_sling_event_impl_eventing_thread_pool_properties_t));
    org_apache_sling_event_impl_eventing_thread_pool_properties_local_var->_library_owned = 1;
    org_apache_sling_event_impl_eventing_thread_pool_properties_local_var->min_pool_size = min_pool_size;
    return org_apache_sling_event_impl_eventing_thread_pool_properties_local_var;
}

__attribute__((deprecated)) org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties_create(
    config_node_property_integer_t *min_pool_size
    ) {
    org_apache_sling_event_impl_eventing_thread_pool_properties_t *result = org_apache_sling_event_impl_eventing_thread_pool_properties_create_internal (
        min_pool_size
        );
    if (!result) {
    }
    return result;
}

void org_apache_sling_event_impl_eventing_thread_pool_properties_free(org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties) {
    if(NULL == org_apache_sling_event_impl_eventing_thread_pool_properties){
        return ;
    }
    if(org_apache_sling_event_impl_eventing_thread_pool_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_sling_event_impl_eventing_thread_pool_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size) {
        config_node_property_integer_free(org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size);
        org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size = NULL;
    }
    free(org_apache_sling_event_impl_eventing_thread_pool_properties);
}

cJSON *org_apache_sling_event_impl_eventing_thread_pool_properties_convertToJSON(org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size
    if(org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size) {
    cJSON *min_pool_size_local_JSON = config_node_property_integer_convertToJSON(org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size);
    if(min_pool_size_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "minPoolSize", min_pool_size_local_JSON);
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

org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties_parseFromJSON(cJSON *org_apache_sling_event_impl_eventing_thread_pool_propertiesJSON){

    org_apache_sling_event_impl_eventing_thread_pool_properties_t *org_apache_sling_event_impl_eventing_thread_pool_properties_local_var = NULL;

    // define the local variable for org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size
    config_node_property_integer_t *min_pool_size_local_nonprim = NULL;

    // org_apache_sling_event_impl_eventing_thread_pool_properties->min_pool_size
    cJSON *min_pool_size = cJSON_GetObjectItemCaseSensitive(org_apache_sling_event_impl_eventing_thread_pool_propertiesJSON, "minPoolSize");
    if (cJSON_IsNull(min_pool_size)) {
        min_pool_size = NULL;
    }
    if (min_pool_size) { 
    min_pool_size_local_nonprim = config_node_property_integer_parseFromJSON(min_pool_size); //nonprimitive
    }



    org_apache_sling_event_impl_eventing_thread_pool_properties_local_var = org_apache_sling_event_impl_eventing_thread_pool_properties_create_internal (
        min_pool_size ? min_pool_size_local_nonprim : NULL
        );

    if (!org_apache_sling_event_impl_eventing_thread_pool_properties_local_var) {
        goto end;
    }

    return org_apache_sling_event_impl_eventing_thread_pool_properties_local_var;
end:
    if (min_pool_size_local_nonprim) {
        config_node_property_integer_free(min_pool_size_local_nonprim);
        min_pool_size_local_nonprim = NULL;
    }
    return NULL;

}
