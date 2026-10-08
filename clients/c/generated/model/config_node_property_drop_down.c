#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "config_node_property_drop_down.h"



static config_node_property_drop_down_t *config_node_property_drop_down_create_internal(
    char *name,
    int *optional,
    int *is_set,
    config_node_property_drop_down_type_t *type,
    any_type_t *value,
    char *description
    ) {
    config_node_property_drop_down_t *config_node_property_drop_down_local_var = malloc(sizeof(config_node_property_drop_down_t));
    if (!config_node_property_drop_down_local_var) {
        return NULL;
    }
    memset(config_node_property_drop_down_local_var, 0, sizeof(config_node_property_drop_down_t));
    config_node_property_drop_down_local_var->_library_owned = 1;
    config_node_property_drop_down_local_var->name = name;
    config_node_property_drop_down_local_var->optional = optional;
    config_node_property_drop_down_local_var->is_set = is_set;
    config_node_property_drop_down_local_var->type = type;
    config_node_property_drop_down_local_var->value = value;
    config_node_property_drop_down_local_var->description = description;
    return config_node_property_drop_down_local_var;
}

__attribute__((deprecated)) config_node_property_drop_down_t *config_node_property_drop_down_create(
    char *name,
    int *optional,
    int *is_set,
    config_node_property_drop_down_type_t *type,
    any_type_t *value,
    char *description
    ) {
    int *optional_copy = NULL;
    if (optional) {
        optional_copy = malloc(sizeof(int));
        if (optional_copy) *optional_copy = *optional;
    }
    int *is_set_copy = NULL;
    if (is_set) {
        is_set_copy = malloc(sizeof(int));
        if (is_set_copy) *is_set_copy = *is_set;
    }
    config_node_property_drop_down_t *result = config_node_property_drop_down_create_internal (
        name,
        optional_copy,
        is_set_copy,
        type,
        value,
        description
        );
    if (!result) {
        free(optional_copy);
        free(is_set_copy);
    }
    return result;
}

void config_node_property_drop_down_free(config_node_property_drop_down_t *config_node_property_drop_down) {
    if(NULL == config_node_property_drop_down){
        return ;
    }
    if(config_node_property_drop_down->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "config_node_property_drop_down_free");
        return ;
    }
    listEntry_t *listEntry;
    if (config_node_property_drop_down->name) {
        free(config_node_property_drop_down->name);
        config_node_property_drop_down->name = NULL;
    }
    if (config_node_property_drop_down->optional) {
        free(config_node_property_drop_down->optional);
        config_node_property_drop_down->optional = NULL;
    }
    if (config_node_property_drop_down->is_set) {
        free(config_node_property_drop_down->is_set);
        config_node_property_drop_down->is_set = NULL;
    }
    if (config_node_property_drop_down->type) {
        config_node_property_drop_down_type_free(config_node_property_drop_down->type);
        config_node_property_drop_down->type = NULL;
    }
    if (config_node_property_drop_down->value) {
        _free(config_node_property_drop_down->value);
        config_node_property_drop_down->value = NULL;
    }
    if (config_node_property_drop_down->description) {
        free(config_node_property_drop_down->description);
        config_node_property_drop_down->description = NULL;
    }
    free(config_node_property_drop_down);
}

cJSON *config_node_property_drop_down_convertToJSON(config_node_property_drop_down_t *config_node_property_drop_down) {
    cJSON *item = cJSON_CreateObject();

    // config_node_property_drop_down->name
    if(config_node_property_drop_down->name) {
    if(cJSON_AddStringToObject(item, "name", config_node_property_drop_down->name) == NULL) {
    goto fail; //String
    }
    }


    // config_node_property_drop_down->optional
    if(config_node_property_drop_down->optional) {
    if(cJSON_AddBoolToObject(item, "optional", *config_node_property_drop_down->optional) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_drop_down->is_set
    if(config_node_property_drop_down->is_set) {
    if(cJSON_AddBoolToObject(item, "is_set", *config_node_property_drop_down->is_set) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_drop_down->type
    if(config_node_property_drop_down->type) {
    cJSON *type_local_JSON = config_node_property_drop_down_type_convertToJSON(config_node_property_drop_down->type);
    if(type_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "type", type_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // config_node_property_drop_down->value
    if(config_node_property_drop_down->value) {
    cJSON *value_local_JSON = _convertToJSON(config_node_property_drop_down->value);
    if(value_local_JSON == NULL) {
        goto fail; // custom
    }
    cJSON_AddItemToObject(item, "value", value_local_JSON);
    if(item->child == NULL) {
        goto fail;
    }
    }


    // config_node_property_drop_down->description
    if(config_node_property_drop_down->description) {
    if(cJSON_AddStringToObject(item, "description", config_node_property_drop_down->description) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

config_node_property_drop_down_t *config_node_property_drop_down_parseFromJSON(cJSON *config_node_property_drop_downJSON){

    config_node_property_drop_down_t *config_node_property_drop_down_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for config_node_property_drop_down->optional
    int *optional_local_var = NULL;

    // define the local variable for config_node_property_drop_down->is_set
    int *is_set_local_var = NULL;

    // define the local variable for config_node_property_drop_down->type
    config_node_property_drop_down_type_t *type_local_nonprim = NULL;

    // define the local variable for config_node_property_drop_down->value
    _t *value_local_nonprim = NULL;

    char *description_local_str = NULL;

    // config_node_property_drop_down->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // config_node_property_drop_down->optional
    cJSON *optional = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "optional");
    if (cJSON_IsNull(optional)) {
        optional = NULL;
    }
    if (optional) { 
    if(!cJSON_IsBool(optional))
    {
    goto end; //Bool
    }
    optional_local_var = malloc(sizeof(int));
    if(!optional_local_var)
    {
        goto end;
    }
    *optional_local_var = optional->valueint;
    }

    // config_node_property_drop_down->is_set
    cJSON *is_set = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "is_set");
    if (cJSON_IsNull(is_set)) {
        is_set = NULL;
    }
    if (is_set) { 
    if(!cJSON_IsBool(is_set))
    {
    goto end; //Bool
    }
    is_set_local_var = malloc(sizeof(int));
    if(!is_set_local_var)
    {
        goto end;
    }
    *is_set_local_var = is_set->valueint;
    }

    // config_node_property_drop_down->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    type_local_nonprim = config_node_property_drop_down_type_parseFromJSON(type); //nonprimitive
    }

    // config_node_property_drop_down->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "value");
    if (cJSON_IsNull(value)) {
        value = NULL;
    }
    if (value) { 
    value_local_nonprim = _parseFromJSON(value); //custom
    }

    // config_node_property_drop_down->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(config_node_property_drop_downJSON, "description");
    if (cJSON_IsNull(description)) {
        description = NULL;
    }
    if (description) { 
    if(!cJSON_IsString(description) && !cJSON_IsNull(description))
    {
    goto end; //String
    }
    }


    if (name && !cJSON_IsNull(name)) name_local_str = strdup(name->valuestring);
    if (description && !cJSON_IsNull(description)) description_local_str = strdup(description->valuestring);

    config_node_property_drop_down_local_var = config_node_property_drop_down_create_internal (
        name_local_str,
        optional_local_var,
        is_set_local_var,
        type ? type_local_nonprim : NULL,
        value ? value_local_nonprim : NULL,
        description_local_str
        );

    if (!config_node_property_drop_down_local_var) {
        goto end;
    }

    return config_node_property_drop_down_local_var;
end:
    if (name_local_str) {
        free(name_local_str);
        name_local_str = NULL;
    }
    if (optional_local_var) {
        free(optional_local_var);
        optional_local_var = NULL;
    }
    if (is_set_local_var) {
        free(is_set_local_var);
        is_set_local_var = NULL;
    }
    if (type_local_nonprim) {
        config_node_property_drop_down_type_free(type_local_nonprim);
        type_local_nonprim = NULL;
    }
    if (value_local_nonprim) {
        _free(value_local_nonprim);
        value_local_nonprim = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    return NULL;

}
