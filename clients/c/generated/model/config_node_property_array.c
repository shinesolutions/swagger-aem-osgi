#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "config_node_property_array.h"



static config_node_property_array_t *config_node_property_array_create_internal(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
    char *description
    ) {
    config_node_property_array_t *config_node_property_array_local_var = malloc(sizeof(config_node_property_array_t));
    if (!config_node_property_array_local_var) {
        return NULL;
    }
    memset(config_node_property_array_local_var, 0, sizeof(config_node_property_array_t));
    config_node_property_array_local_var->_library_owned = 1;
    config_node_property_array_local_var->name = name;
    config_node_property_array_local_var->optional = optional;
    config_node_property_array_local_var->is_set = is_set;
    config_node_property_array_local_var->type = type;
    config_node_property_array_local_var->values = values;
    config_node_property_array_local_var->description = description;
    return config_node_property_array_local_var;
}

__attribute__((deprecated)) config_node_property_array_t *config_node_property_array_create(
    char *name,
    int *optional,
    int *is_set,
    int *type,
    list_t *values,
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
    int *type_copy = NULL;
    if (type) {
        type_copy = malloc(sizeof(int));
        if (type_copy) *type_copy = *type;
    }
    config_node_property_array_t *result = config_node_property_array_create_internal (
        name,
        optional_copy,
        is_set_copy,
        type_copy,
        values,
        description
        );
    if (!result) {
        free(optional_copy);
        free(is_set_copy);
        free(type_copy);
    }
    return result;
}

void config_node_property_array_free(config_node_property_array_t *config_node_property_array) {
    if(NULL == config_node_property_array){
        return ;
    }
    if(config_node_property_array->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "config_node_property_array_free");
        return ;
    }
    listEntry_t *listEntry;
    if (config_node_property_array->name) {
        free(config_node_property_array->name);
        config_node_property_array->name = NULL;
    }
    if (config_node_property_array->optional) {
        free(config_node_property_array->optional);
        config_node_property_array->optional = NULL;
    }
    if (config_node_property_array->is_set) {
        free(config_node_property_array->is_set);
        config_node_property_array->is_set = NULL;
    }
    if (config_node_property_array->type) {
        free(config_node_property_array->type);
        config_node_property_array->type = NULL;
    }
    if (config_node_property_array->values) {
        list_ForEach(listEntry, config_node_property_array->values) {
            free(listEntry->data);
        }
        list_freeList(config_node_property_array->values);
        config_node_property_array->values = NULL;
    }
    if (config_node_property_array->description) {
        free(config_node_property_array->description);
        config_node_property_array->description = NULL;
    }
    free(config_node_property_array);
}

cJSON *config_node_property_array_convertToJSON(config_node_property_array_t *config_node_property_array) {
    cJSON *item = cJSON_CreateObject();

    // config_node_property_array->name
    if(config_node_property_array->name) {
    if(cJSON_AddStringToObject(item, "name", config_node_property_array->name) == NULL) {
    goto fail; //String
    }
    }


    // config_node_property_array->optional
    if(config_node_property_array->optional) {
    if(cJSON_AddBoolToObject(item, "optional", *config_node_property_array->optional) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_array->is_set
    if(config_node_property_array->is_set) {
    if(cJSON_AddBoolToObject(item, "is_set", *config_node_property_array->is_set) == NULL) {
    goto fail; //Bool
    }
    }


    // config_node_property_array->type
    if(config_node_property_array->type) {
    if(cJSON_AddNumberToObject(item, "type", *config_node_property_array->type) == NULL) {
    goto fail; //Numeric
    }
    }


    // config_node_property_array->values
    if(config_node_property_array->values) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *valuesListEntry;
    list_ForEach(valuesListEntry, config_node_property_array->values) {
    if(cJSON_AddStringToObject(values, "", valuesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // config_node_property_array->description
    if(config_node_property_array->description) {
    if(cJSON_AddStringToObject(item, "description", config_node_property_array->description) == NULL) {
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

config_node_property_array_t *config_node_property_array_parseFromJSON(cJSON *config_node_property_arrayJSON){

    config_node_property_array_t *config_node_property_array_local_var = NULL;

    char *name_local_str = NULL;

    // define the local variable for config_node_property_array->optional
    int *optional_local_var = NULL;

    // define the local variable for config_node_property_array->is_set
    int *is_set_local_var = NULL;

    // define the local variable for config_node_property_array->type
    int *type_local_var = NULL;

    // define the local list for config_node_property_array->values
    list_t *valuesList = NULL;

    char *description_local_str = NULL;

    // config_node_property_array->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // config_node_property_array->optional
    cJSON *optional = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "optional");
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

    // config_node_property_array->is_set
    cJSON *is_set = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "is_set");
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

    // config_node_property_array->type
    cJSON *type = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "type");
    if (cJSON_IsNull(type)) {
        type = NULL;
    }
    if (type) { 
    if(!cJSON_IsNumber(type))
    {
    goto end; //Numeric
    }
    type_local_var = malloc(sizeof(int));
    if(!type_local_var)
    {
        goto end;
    }
    *type_local_var = type->valuedouble;
    }

    // config_node_property_array->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "values");
    if (cJSON_IsNull(values)) {
        values = NULL;
    }
    if (values) { 
    cJSON *values_local = NULL;
    if(!cJSON_IsArray(values)) {
        goto end;//primitive container
    }
    valuesList = list_createList();

    cJSON_ArrayForEach(values_local, values)
    {
        if(!cJSON_IsString(values_local))
        {
            goto end;
        }
        list_addElement(valuesList , strdup(values_local->valuestring));
    }
    }

    // config_node_property_array->description
    cJSON *description = cJSON_GetObjectItemCaseSensitive(config_node_property_arrayJSON, "description");
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

    config_node_property_array_local_var = config_node_property_array_create_internal (
        name_local_str,
        optional_local_var,
        is_set_local_var,
        type_local_var,
        values ? valuesList : NULL,
        description_local_str
        );

    if (!config_node_property_array_local_var) {
        goto end;
    }

    return config_node_property_array_local_var;
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
    if (type_local_var) {
        free(type_local_var);
        type_local_var = NULL;
    }
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    if (description_local_str) {
        free(description_local_str);
        description_local_str = NULL;
    }
    return NULL;

}
