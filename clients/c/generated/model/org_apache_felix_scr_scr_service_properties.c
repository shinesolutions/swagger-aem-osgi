#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_felix_scr_scr_service_properties.h"



static org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties_create_internal(
    config_node_property_drop_down_t *ds_loglevel,
    config_node_property_boolean_t *ds_factory_enabled,
    config_node_property_boolean_t *ds_delayed_keep_instances,
    config_node_property_integer_t *ds_lock_timeout_milliseconds,
    config_node_property_integer_t *ds_stop_timeout_milliseconds,
    config_node_property_boolean_t *ds_global_extender
    ) {
    org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties_local_var = malloc(sizeof(org_apache_felix_scr_scr_service_properties_t));
    if (!org_apache_felix_scr_scr_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_felix_scr_scr_service_properties_local_var, 0, sizeof(org_apache_felix_scr_scr_service_properties_t));
    org_apache_felix_scr_scr_service_properties_local_var->_library_owned = 1;
    org_apache_felix_scr_scr_service_properties_local_var->ds_loglevel = ds_loglevel;
    org_apache_felix_scr_scr_service_properties_local_var->ds_factory_enabled = ds_factory_enabled;
    org_apache_felix_scr_scr_service_properties_local_var->ds_delayed_keep_instances = ds_delayed_keep_instances;
    org_apache_felix_scr_scr_service_properties_local_var->ds_lock_timeout_milliseconds = ds_lock_timeout_milliseconds;
    org_apache_felix_scr_scr_service_properties_local_var->ds_stop_timeout_milliseconds = ds_stop_timeout_milliseconds;
    org_apache_felix_scr_scr_service_properties_local_var->ds_global_extender = ds_global_extender;
    return org_apache_felix_scr_scr_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties_create(
    config_node_property_drop_down_t *ds_loglevel,
    config_node_property_boolean_t *ds_factory_enabled,
    config_node_property_boolean_t *ds_delayed_keep_instances,
    config_node_property_integer_t *ds_lock_timeout_milliseconds,
    config_node_property_integer_t *ds_stop_timeout_milliseconds,
    config_node_property_boolean_t *ds_global_extender
    ) {
    org_apache_felix_scr_scr_service_properties_t *result = org_apache_felix_scr_scr_service_properties_create_internal (
        ds_loglevel,
        ds_factory_enabled,
        ds_delayed_keep_instances,
        ds_lock_timeout_milliseconds,
        ds_stop_timeout_milliseconds,
        ds_global_extender
        );
    if (!result) {
    }
    return result;
}

void org_apache_felix_scr_scr_service_properties_free(org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties) {
    if(NULL == org_apache_felix_scr_scr_service_properties){
        return ;
    }
    if(org_apache_felix_scr_scr_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_felix_scr_scr_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_felix_scr_scr_service_properties->ds_loglevel) {
        config_node_property_drop_down_free(org_apache_felix_scr_scr_service_properties->ds_loglevel);
        org_apache_felix_scr_scr_service_properties->ds_loglevel = NULL;
    }
    if (org_apache_felix_scr_scr_service_properties->ds_factory_enabled) {
        config_node_property_boolean_free(org_apache_felix_scr_scr_service_properties->ds_factory_enabled);
        org_apache_felix_scr_scr_service_properties->ds_factory_enabled = NULL;
    }
    if (org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances) {
        config_node_property_boolean_free(org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances);
        org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances = NULL;
    }
    if (org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds) {
        config_node_property_integer_free(org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds);
        org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds = NULL;
    }
    if (org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds) {
        config_node_property_integer_free(org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds);
        org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds = NULL;
    }
    if (org_apache_felix_scr_scr_service_properties->ds_global_extender) {
        config_node_property_boolean_free(org_apache_felix_scr_scr_service_properties->ds_global_extender);
        org_apache_felix_scr_scr_service_properties->ds_global_extender = NULL;
    }
    free(org_apache_felix_scr_scr_service_properties);
}

cJSON *org_apache_felix_scr_scr_service_properties_convertToJSON(org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_felix_scr_scr_service_properties->ds_loglevel
    if(org_apache_felix_scr_scr_service_properties->ds_loglevel) {
    cJSON *ds_loglevel_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_loglevel);
    if(ds_loglevel_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.loglevel", ds_loglevel_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_scr_scr_service_properties->ds_factory_enabled
    if(org_apache_felix_scr_scr_service_properties->ds_factory_enabled) {
    cJSON *ds_factory_enabled_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_factory_enabled);
    if(ds_factory_enabled_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.factory.enabled", ds_factory_enabled_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances
    if(org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances) {
    cJSON *ds_delayed_keep_instances_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances);
    if(ds_delayed_keep_instances_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.delayed.keepInstances", ds_delayed_keep_instances_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds
    if(org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds) {
    cJSON *ds_lock_timeout_milliseconds_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds);
    if(ds_lock_timeout_milliseconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.lock.timeout.milliseconds", ds_lock_timeout_milliseconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds
    if(org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds) {
    cJSON *ds_stop_timeout_milliseconds_local_JSON = config_node_property_integer_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds);
    if(ds_stop_timeout_milliseconds_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.stop.timeout.milliseconds", ds_stop_timeout_milliseconds_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_felix_scr_scr_service_properties->ds_global_extender
    if(org_apache_felix_scr_scr_service_properties->ds_global_extender) {
    cJSON *ds_global_extender_local_JSON = config_node_property_boolean_convertToJSON(org_apache_felix_scr_scr_service_properties->ds_global_extender);
    if(ds_global_extender_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "ds.global.extender", ds_global_extender_local_JSON);
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

org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties_parseFromJSON(cJSON *org_apache_felix_scr_scr_service_propertiesJSON){

    org_apache_felix_scr_scr_service_properties_t *org_apache_felix_scr_scr_service_properties_local_var = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_loglevel
    config_node_property_drop_down_t *ds_loglevel_local_nonprim = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_factory_enabled
    config_node_property_boolean_t *ds_factory_enabled_local_nonprim = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances
    config_node_property_boolean_t *ds_delayed_keep_instances_local_nonprim = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds
    config_node_property_integer_t *ds_lock_timeout_milliseconds_local_nonprim = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds
    config_node_property_integer_t *ds_stop_timeout_milliseconds_local_nonprim = NULL;

    // define the local variable for org_apache_felix_scr_scr_service_properties->ds_global_extender
    config_node_property_boolean_t *ds_global_extender_local_nonprim = NULL;

    // org_apache_felix_scr_scr_service_properties->ds_loglevel
    cJSON *ds_loglevel = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.loglevel");
    if (cJSON_IsNull(ds_loglevel)) {
        ds_loglevel = NULL;
    }
    if (ds_loglevel) { 
    ds_loglevel_local_nonprim = config_node_property_drop_down_parseFromJSON(ds_loglevel); //nonprimitive
    }

    // org_apache_felix_scr_scr_service_properties->ds_factory_enabled
    cJSON *ds_factory_enabled = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.factory.enabled");
    if (cJSON_IsNull(ds_factory_enabled)) {
        ds_factory_enabled = NULL;
    }
    if (ds_factory_enabled) { 
    ds_factory_enabled_local_nonprim = config_node_property_boolean_parseFromJSON(ds_factory_enabled); //nonprimitive
    }

    // org_apache_felix_scr_scr_service_properties->ds_delayed_keep_instances
    cJSON *ds_delayed_keep_instances = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.delayed.keepInstances");
    if (cJSON_IsNull(ds_delayed_keep_instances)) {
        ds_delayed_keep_instances = NULL;
    }
    if (ds_delayed_keep_instances) { 
    ds_delayed_keep_instances_local_nonprim = config_node_property_boolean_parseFromJSON(ds_delayed_keep_instances); //nonprimitive
    }

    // org_apache_felix_scr_scr_service_properties->ds_lock_timeout_milliseconds
    cJSON *ds_lock_timeout_milliseconds = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.lock.timeout.milliseconds");
    if (cJSON_IsNull(ds_lock_timeout_milliseconds)) {
        ds_lock_timeout_milliseconds = NULL;
    }
    if (ds_lock_timeout_milliseconds) { 
    ds_lock_timeout_milliseconds_local_nonprim = config_node_property_integer_parseFromJSON(ds_lock_timeout_milliseconds); //nonprimitive
    }

    // org_apache_felix_scr_scr_service_properties->ds_stop_timeout_milliseconds
    cJSON *ds_stop_timeout_milliseconds = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.stop.timeout.milliseconds");
    if (cJSON_IsNull(ds_stop_timeout_milliseconds)) {
        ds_stop_timeout_milliseconds = NULL;
    }
    if (ds_stop_timeout_milliseconds) { 
    ds_stop_timeout_milliseconds_local_nonprim = config_node_property_integer_parseFromJSON(ds_stop_timeout_milliseconds); //nonprimitive
    }

    // org_apache_felix_scr_scr_service_properties->ds_global_extender
    cJSON *ds_global_extender = cJSON_GetObjectItemCaseSensitive(org_apache_felix_scr_scr_service_propertiesJSON, "ds.global.extender");
    if (cJSON_IsNull(ds_global_extender)) {
        ds_global_extender = NULL;
    }
    if (ds_global_extender) { 
    ds_global_extender_local_nonprim = config_node_property_boolean_parseFromJSON(ds_global_extender); //nonprimitive
    }



    org_apache_felix_scr_scr_service_properties_local_var = org_apache_felix_scr_scr_service_properties_create_internal (
        ds_loglevel ? ds_loglevel_local_nonprim : NULL,
        ds_factory_enabled ? ds_factory_enabled_local_nonprim : NULL,
        ds_delayed_keep_instances ? ds_delayed_keep_instances_local_nonprim : NULL,
        ds_lock_timeout_milliseconds ? ds_lock_timeout_milliseconds_local_nonprim : NULL,
        ds_stop_timeout_milliseconds ? ds_stop_timeout_milliseconds_local_nonprim : NULL,
        ds_global_extender ? ds_global_extender_local_nonprim : NULL
        );

    if (!org_apache_felix_scr_scr_service_properties_local_var) {
        goto end;
    }

    return org_apache_felix_scr_scr_service_properties_local_var;
end:
    if (ds_loglevel_local_nonprim) {
        config_node_property_drop_down_free(ds_loglevel_local_nonprim);
        ds_loglevel_local_nonprim = NULL;
    }
    if (ds_factory_enabled_local_nonprim) {
        config_node_property_boolean_free(ds_factory_enabled_local_nonprim);
        ds_factory_enabled_local_nonprim = NULL;
    }
    if (ds_delayed_keep_instances_local_nonprim) {
        config_node_property_boolean_free(ds_delayed_keep_instances_local_nonprim);
        ds_delayed_keep_instances_local_nonprim = NULL;
    }
    if (ds_lock_timeout_milliseconds_local_nonprim) {
        config_node_property_integer_free(ds_lock_timeout_milliseconds_local_nonprim);
        ds_lock_timeout_milliseconds_local_nonprim = NULL;
    }
    if (ds_stop_timeout_milliseconds_local_nonprim) {
        config_node_property_integer_free(ds_stop_timeout_milliseconds_local_nonprim);
        ds_stop_timeout_milliseconds_local_nonprim = NULL;
    }
    if (ds_global_extender_local_nonprim) {
        config_node_property_boolean_free(ds_global_extender_local_nonprim);
        ds_global_extender_local_nonprim = NULL;
    }
    return NULL;

}
