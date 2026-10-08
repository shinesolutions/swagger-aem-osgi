#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "config_node_property_drop_down_type.h"



static config_node_property_drop_down_type_t *config_node_property_drop_down_type_create_internal(
    any_type_t *labels,
    any_type_t *values
    ) {
    config_node_property_drop_down_type_t *config_node_property_drop_down_type_local_var = malloc(sizeof(config_node_property_drop_down_type_t));
    if (!config_node_property_drop_down_type_local_var) {
        return NULL;
    }
    memset(config_node_property_drop_down_type_local_var, 0, sizeof(config_node_property_drop_down_type_t));
    config_node_property_drop_down_type_local_var->_library_owned = 1;
    config_node_property_drop_down_type_local_var->labels = labels;
    config_node_property_drop_down_type_local_var->values = values;
    return config_node_property_drop_down_type_local_var;
}

__attribute__((deprecated)) config_node_property_drop_down_type_t *config_node_property_drop_down_type_create(
    any_type_t *labels,
    any_type_t *values
    ) {
    config_node_property_drop_down_type_t *result = config_node_property_drop_down_type_create_internal (
        labels,
        values
        );
    if (!result) {
    }
    return result;
}

void config_node_property_drop_down_type_free(config_node_property_drop_down_type_t *config_node_property_drop_down_type) {
    if(NULL == config_node_property_drop_down_type){
        return ;
    }
    if(config_node_property_drop_down_type->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "config_node_property_drop_down_type_free");
        return ;
    }
    listEntry_t *listEntry;
    if (config_node_property_drop_down_type->labels) {
        _free(config_node_property_drop_down_type->labels);
        config_node_property_drop_down_type->labels = NULL;
    }
    if (config_node_property_drop_down_type->values) {
        _free(config_node_property_drop_down_type->values);
        config_node_property_drop_down_type->values = NULL;
    }
    free(config_node_property_drop_down_type);
}

cJSON *config_node_property_drop_down_type_convertToJSON(config_node_property_drop_down_type_t *config_node_property_drop_down_type) {
    cJSON *item = cJSON_CreateObject();

    // config_node_property_drop_down_type->labels
    if(config_node_property_drop_down_type->labels) {
    cJSON *labels_local_JSON = _convertToJSON(config_node_property_drop_down_type->labels);
    if(labels_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "labels", labels_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // config_node_property_drop_down_type->values
    if(config_node_property_drop_down_type->values) {
    cJSON *values_local_JSON = _convertToJSON(config_node_property_drop_down_type->values);
    if(values_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "values", values_local_JSON);
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

config_node_property_drop_down_type_t *config_node_property_drop_down_type_parseFromJSON(cJSON *config_node_property_drop_down_typeJSON){

    config_node_property_drop_down_type_t *config_node_property_drop_down_type_local_var = NULL;

    // define the local variable for config_node_property_drop_down_type->labels
    _t *labels_local_nonprim = NULL;

    // define the local variable for config_node_property_drop_down_type->values
    _t *values_local_nonprim = NULL;

    // config_node_property_drop_down_type->labels
    cJSON *labels = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_down_typeJSON, "labels");
    if (cJSON_IsNull(labels)) {
        labels = NULL;
    }
    if (labels) { 
    labels_local_nonprim = _parseFromJSON(labels); //custom
    }

    // config_node_property_drop_down_type->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_down_typeJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (values) { 
    values_local_nonprim = _parseFromJSON(values); //custom
    }



    config_node_property_drop_down_type_local_var = config_node_property_drop_down_type_create_internal (
        labels ? labels_local_nonprim : NULL,
        values ? values_local_nonprim : NULL
        );

    if (!config_node_property_drop_down_type_local_var) {
        goto end;
    }

    return config_node_property_drop_down_type_local_var;
end:
    if (labels_local_nonprim) {
        _free(labels_local_nonprim);
        labels_local_nonprim = NULL;
    }
    if (values_local_nonprim) {
        _free(values_local_nonprim);
        values_local_nonprim = NULL;
    }
    return NULL;

}
