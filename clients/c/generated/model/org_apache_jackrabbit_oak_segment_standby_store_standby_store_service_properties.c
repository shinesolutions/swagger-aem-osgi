#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties.h"



static org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_create_internal(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_drop_down_t *mode,
    config_node_property_integer_t *port,
    config_node_property_string_t *primary_host,
    config_node_property_integer_t *interval,
    config_node_property_array_t *primary_allowed_client_ip_ranges,
    config_node_property_boolean_t *secure,
    config_node_property_integer_t *standby_readtimeout,
    config_node_property_boolean_t *standby_autoclean
    ) {
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var = malloc(sizeof(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t));
    if (!org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var) {
        return NULL;
    }
    memset(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var, 0, sizeof(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t));
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->_library_owned = 1;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->org_apache_sling_installer_configuration_persist = org_apache_sling_installer_configuration_persist;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->mode = mode;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->port = port;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->primary_host = primary_host;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->interval = interval;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->primary_allowed_client_ip_ranges = primary_allowed_client_ip_ranges;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->secure = secure;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->standby_readtimeout = standby_readtimeout;
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var->standby_autoclean = standby_autoclean;
    return org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var;
}

__attribute__((deprecated)) org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_create(
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist,
    config_node_property_drop_down_t *mode,
    config_node_property_integer_t *port,
    config_node_property_string_t *primary_host,
    config_node_property_integer_t *interval,
    config_node_property_array_t *primary_allowed_client_ip_ranges,
    config_node_property_boolean_t *secure,
    config_node_property_integer_t *standby_readtimeout,
    config_node_property_boolean_t *standby_autoclean
    ) {
    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *result = org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_create_internal (
        org_apache_sling_installer_configuration_persist,
        mode,
        port,
        primary_host,
        interval,
        primary_allowed_client_ip_ranges,
        secure,
        standby_readtimeout,
        standby_autoclean
        );
    if (!result) {
    }
    return result;
}

void org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties) {
    if(NULL == org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties){
        return ;
    }
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode) {
        config_node_property_drop_down_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host) {
        config_node_property_string_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges) {
        config_node_property_array_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout) {
        config_node_property_integer_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout = NULL;
    }
    if (org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean) {
        config_node_property_boolean_free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean);
        org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean = NULL;
    }
    free(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties);
}

cJSON *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties) {
    cJSON *item = cJSON_CreateObject();

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist) {
    cJSON *org_apache_sling_installer_configuration_persist_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist);
    if(org_apache_sling_installer_configuration_persist_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "org.apache.sling.installer.configuration.persist", org_apache_sling_installer_configuration_persist_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode) {
    cJSON *mode_local_JSON = config_node_property_drop_down_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode);
    if(mode_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "mode", mode_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port) {
    cJSON *port_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port);
    if(port_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "port", port_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host) {
    cJSON *primary_host_local_JSON = config_node_property_string_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host);
    if(primary_host_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "primary.host", primary_host_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval) {
    cJSON *interval_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval);
    if(interval_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "interval", interval_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges) {
    cJSON *primary_allowed_client_ip_ranges_local_JSON = config_node_property_array_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges);
    if(primary_allowed_client_ip_ranges_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "primary.allowed-client-ip-ranges", primary_allowed_client_ip_ranges_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure) {
    cJSON *secure_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure);
    if(secure_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "secure", secure_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout) {
    cJSON *standby_readtimeout_local_JSON = config_node_property_integer_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout);
    if(standby_readtimeout_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "standby.readtimeout", standby_readtimeout_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean
    if(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean) {
    cJSON *standby_autoclean_local_JSON = config_node_property_boolean_convertToJSON(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean);
    if(standby_autoclean_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "standby.autoclean", standby_autoclean_local_JSON);
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

org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_parseFromJSON(cJSON *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON){

    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_t *org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist
    config_node_property_boolean_t *org_apache_sling_installer_configuration_persist_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode
    config_node_property_drop_down_t *mode_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port
    config_node_property_integer_t *port_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host
    config_node_property_string_t *primary_host_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval
    config_node_property_integer_t *interval_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges
    config_node_property_array_t *primary_allowed_client_ip_ranges_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure
    config_node_property_boolean_t *secure_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout
    config_node_property_integer_t *standby_readtimeout_local_nonprim = NULL;

    // define the local variable for org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean
    config_node_property_boolean_t *standby_autoclean_local_nonprim = NULL;

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->org_apache_sling_installer_configuration_persist
    cJSON *org_apache_sling_installer_configuration_persist = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "org.apache.sling.installer.configuration.persist");
    if (cJSON_IsNull(org_apache_sling_installer_configuration_persist)) {
        org_apache_sling_installer_configuration_persist = NULL;
    }
    if (org_apache_sling_installer_configuration_persist) { 
    org_apache_sling_installer_configuration_persist_local_nonprim = config_node_property_boolean_parseFromJSON(org_apache_sling_installer_configuration_persist); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->mode
    cJSON *mode = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "mode");
    if (cJSON_IsNull(mode)) {
        mode = NULL;
    }
    if (mode) { 
    mode_local_nonprim = config_node_property_drop_down_parseFromJSON(mode); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->port
    cJSON *port = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "port");
    if (cJSON_IsNull(port)) {
        port = NULL;
    }
    if (port) { 
    port_local_nonprim = config_node_property_integer_parseFromJSON(port); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_host
    cJSON *primary_host = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "primary.host");
    if (cJSON_IsNull(primary_host)) {
        primary_host = NULL;
    }
    if (primary_host) { 
    primary_host_local_nonprim = config_node_property_string_parseFromJSON(primary_host); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->interval
    cJSON *interval = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "interval");
    if (cJSON_IsNull(interval)) {
        interval = NULL;
    }
    if (interval) { 
    interval_local_nonprim = config_node_property_integer_parseFromJSON(interval); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->primary_allowed_client_ip_ranges
    cJSON *primary_allowed_client_ip_ranges = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "primary.allowed-client-ip-ranges");
    if (cJSON_IsNull(primary_allowed_client_ip_ranges)) {
        primary_allowed_client_ip_ranges = NULL;
    }
    if (primary_allowed_client_ip_ranges) { 
    primary_allowed_client_ip_ranges_local_nonprim = config_node_property_array_parseFromJSON(primary_allowed_client_ip_ranges); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->secure
    cJSON *secure = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "secure");
    if (cJSON_IsNull(secure)) {
        secure = NULL;
    }
    if (secure) { 
    secure_local_nonprim = config_node_property_boolean_parseFromJSON(secure); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_readtimeout
    cJSON *standby_readtimeout = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "standby.readtimeout");
    if (cJSON_IsNull(standby_readtimeout)) {
        standby_readtimeout = NULL;
    }
    if (standby_readtimeout) { 
    standby_readtimeout_local_nonprim = config_node_property_integer_parseFromJSON(standby_readtimeout); //nonprimitive
    }

    // org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties->standby_autoclean
    cJSON *standby_autoclean = cJSON_GetObjectItemCaseSensitive(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_propertiesJSON, "standby.autoclean");
    if (cJSON_IsNull(standby_autoclean)) {
        standby_autoclean = NULL;
    }
    if (standby_autoclean) { 
    standby_autoclean_local_nonprim = config_node_property_boolean_parseFromJSON(standby_autoclean); //nonprimitive
    }



    org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var = org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_create_internal (
        org_apache_sling_installer_configuration_persist ? org_apache_sling_installer_configuration_persist_local_nonprim : NULL,
        mode ? mode_local_nonprim : NULL,
        port ? port_local_nonprim : NULL,
        primary_host ? primary_host_local_nonprim : NULL,
        interval ? interval_local_nonprim : NULL,
        primary_allowed_client_ip_ranges ? primary_allowed_client_ip_ranges_local_nonprim : NULL,
        secure ? secure_local_nonprim : NULL,
        standby_readtimeout ? standby_readtimeout_local_nonprim : NULL,
        standby_autoclean ? standby_autoclean_local_nonprim : NULL
        );

    if (!org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var) {
        goto end;
    }

    return org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_local_var;
end:
    if (org_apache_sling_installer_configuration_persist_local_nonprim) {
        config_node_property_boolean_free(org_apache_sling_installer_configuration_persist_local_nonprim);
        org_apache_sling_installer_configuration_persist_local_nonprim = NULL;
    }
    if (mode_local_nonprim) {
        config_node_property_drop_down_free(mode_local_nonprim);
        mode_local_nonprim = NULL;
    }
    if (port_local_nonprim) {
        config_node_property_integer_free(port_local_nonprim);
        port_local_nonprim = NULL;
    }
    if (primary_host_local_nonprim) {
        config_node_property_string_free(primary_host_local_nonprim);
        primary_host_local_nonprim = NULL;
    }
    if (interval_local_nonprim) {
        config_node_property_integer_free(interval_local_nonprim);
        interval_local_nonprim = NULL;
    }
    if (primary_allowed_client_ip_ranges_local_nonprim) {
        config_node_property_array_free(primary_allowed_client_ip_ranges_local_nonprim);
        primary_allowed_client_ip_ranges_local_nonprim = NULL;
    }
    if (secure_local_nonprim) {
        config_node_property_boolean_free(secure_local_nonprim);
        secure_local_nonprim = NULL;
    }
    if (standby_readtimeout_local_nonprim) {
        config_node_property_integer_free(standby_readtimeout_local_nonprim);
        standby_readtimeout_local_nonprim = NULL;
    }
    if (standby_autoclean_local_nonprim) {
        config_node_property_boolean_free(standby_autoclean_local_nonprim);
        standby_autoclean_local_nonprim = NULL;
    }
    return NULL;

}
