#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "com_day_cq_reporting_impl_config_service_impl_properties.h"



static com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_create_internal(
    config_node_property_string_t *repconf_timezone,
    config_node_property_string_t *repconf_locale,
    config_node_property_string_t *repconf_snapshots,
    config_node_property_string_t *repconf_repdir,
    config_node_property_integer_t *repconf_hourofday,
    config_node_property_integer_t *repconf_minofhour,
    config_node_property_integer_t *repconf_maxrows,
    config_node_property_boolean_t *repconf_fakedata,
    config_node_property_string_t *repconf_snapshotuser,
    config_node_property_boolean_t *repconf_enforcesnapshotuser
    ) {
    com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_local_var = malloc(sizeof(com_day_cq_reporting_impl_config_service_impl_properties_t));
    if (!com_day_cq_reporting_impl_config_service_impl_properties_local_var) {
        return NULL;
    }
    memset(com_day_cq_reporting_impl_config_service_impl_properties_local_var, 0, sizeof(com_day_cq_reporting_impl_config_service_impl_properties_t));
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->_library_owned = 1;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_timezone = repconf_timezone;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_locale = repconf_locale;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_snapshots = repconf_snapshots;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_repdir = repconf_repdir;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_hourofday = repconf_hourofday;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_minofhour = repconf_minofhour;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_maxrows = repconf_maxrows;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_fakedata = repconf_fakedata;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_snapshotuser = repconf_snapshotuser;
    com_day_cq_reporting_impl_config_service_impl_properties_local_var->repconf_enforcesnapshotuser = repconf_enforcesnapshotuser;
    return com_day_cq_reporting_impl_config_service_impl_properties_local_var;
}

__attribute__((deprecated)) com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_create(
    config_node_property_string_t *repconf_timezone,
    config_node_property_string_t *repconf_locale,
    config_node_property_string_t *repconf_snapshots,
    config_node_property_string_t *repconf_repdir,
    config_node_property_integer_t *repconf_hourofday,
    config_node_property_integer_t *repconf_minofhour,
    config_node_property_integer_t *repconf_maxrows,
    config_node_property_boolean_t *repconf_fakedata,
    config_node_property_string_t *repconf_snapshotuser,
    config_node_property_boolean_t *repconf_enforcesnapshotuser
    ) {
    com_day_cq_reporting_impl_config_service_impl_properties_t *result = com_day_cq_reporting_impl_config_service_impl_properties_create_internal (
        repconf_timezone,
        repconf_locale,
        repconf_snapshots,
        repconf_repdir,
        repconf_hourofday,
        repconf_minofhour,
        repconf_maxrows,
        repconf_fakedata,
        repconf_snapshotuser,
        repconf_enforcesnapshotuser
        );
    if (!result) {
    }
    return result;
}

void com_day_cq_reporting_impl_config_service_impl_properties_free(com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties) {
    if(NULL == com_day_cq_reporting_impl_config_service_impl_properties){
        return ;
    }
    if(com_day_cq_reporting_impl_config_service_impl_properties->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "com_day_cq_reporting_impl_config_service_impl_properties_free");
        return ;
    }
    listEntry_t *listEntry;
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone) {
        config_node_property_string_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale) {
        config_node_property_string_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots) {
        config_node_property_string_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir) {
        config_node_property_string_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday) {
        config_node_property_integer_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour) {
        config_node_property_integer_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows) {
        config_node_property_integer_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata) {
        config_node_property_boolean_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser) {
        config_node_property_string_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser = NULL;
    }
    if (com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser) {
        config_node_property_boolean_free(com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser);
        com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser = NULL;
    }
    free(com_day_cq_reporting_impl_config_service_impl_properties);
}

cJSON *com_day_cq_reporting_impl_config_service_impl_properties_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties) {
    cJSON *item = cJSON_CreateObject();

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone) {
    cJSON *repconf_timezone_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone);
    if(repconf_timezone_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.timezone", repconf_timezone_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale) {
    cJSON *repconf_locale_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale);
    if(repconf_locale_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.locale", repconf_locale_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots) {
    cJSON *repconf_snapshots_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots);
    if(repconf_snapshots_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.snapshots", repconf_snapshots_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir) {
    cJSON *repconf_repdir_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir);
    if(repconf_repdir_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.repdir", repconf_repdir_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday) {
    cJSON *repconf_hourofday_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday);
    if(repconf_hourofday_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.hourofday", repconf_hourofday_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour) {
    cJSON *repconf_minofhour_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour);
    if(repconf_minofhour_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.minofhour", repconf_minofhour_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows) {
    cJSON *repconf_maxrows_local_JSON = config_node_property_integer_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows);
    if(repconf_maxrows_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.maxrows", repconf_maxrows_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata) {
    cJSON *repconf_fakedata_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata);
    if(repconf_fakedata_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.fakedata", repconf_fakedata_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser) {
    cJSON *repconf_snapshotuser_local_JSON = config_node_property_string_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser);
    if(repconf_snapshotuser_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.snapshotuser", repconf_snapshotuser_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser
    if(com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser) {
    cJSON *repconf_enforcesnapshotuser_local_JSON = config_node_property_boolean_convertToJSON(com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser);
    if(repconf_enforcesnapshotuser_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "repconf.enforcesnapshotuser", repconf_enforcesnapshotuser_local_JSON);
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

com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_parseFromJSON(cJSON *com_day_cq_reporting_impl_config_service_impl_propertiesJSON){

    com_day_cq_reporting_impl_config_service_impl_properties_t *com_day_cq_reporting_impl_config_service_impl_properties_local_var = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone
    config_node_property_string_t *repconf_timezone_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale
    config_node_property_string_t *repconf_locale_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots
    config_node_property_string_t *repconf_snapshots_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir
    config_node_property_string_t *repconf_repdir_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday
    config_node_property_integer_t *repconf_hourofday_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour
    config_node_property_integer_t *repconf_minofhour_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows
    config_node_property_integer_t *repconf_maxrows_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata
    config_node_property_boolean_t *repconf_fakedata_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser
    config_node_property_string_t *repconf_snapshotuser_local_nonprim = NULL;

    // define the local variable for com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser
    config_node_property_boolean_t *repconf_enforcesnapshotuser_local_nonprim = NULL;

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_timezone
    cJSON *repconf_timezone = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.timezone");
    if (cJSON_IsNull(repconf_timezone)) {
        repconf_timezone = NULL;
    }
    if (repconf_timezone) { 
    repconf_timezone_local_nonprim = config_node_property_string_parseFromJSON(repconf_timezone); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_locale
    cJSON *repconf_locale = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.locale");
    if (cJSON_IsNull(repconf_locale)) {
        repconf_locale = NULL;
    }
    if (repconf_locale) { 
    repconf_locale_local_nonprim = config_node_property_string_parseFromJSON(repconf_locale); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshots
    cJSON *repconf_snapshots = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.snapshots");
    if (cJSON_IsNull(repconf_snapshots)) {
        repconf_snapshots = NULL;
    }
    if (repconf_snapshots) { 
    repconf_snapshots_local_nonprim = config_node_property_string_parseFromJSON(repconf_snapshots); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_repdir
    cJSON *repconf_repdir = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.repdir");
    if (cJSON_IsNull(repconf_repdir)) {
        repconf_repdir = NULL;
    }
    if (repconf_repdir) { 
    repconf_repdir_local_nonprim = config_node_property_string_parseFromJSON(repconf_repdir); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_hourofday
    cJSON *repconf_hourofday = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.hourofday");
    if (cJSON_IsNull(repconf_hourofday)) {
        repconf_hourofday = NULL;
    }
    if (repconf_hourofday) { 
    repconf_hourofday_local_nonprim = config_node_property_integer_parseFromJSON(repconf_hourofday); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_minofhour
    cJSON *repconf_minofhour = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.minofhour");
    if (cJSON_IsNull(repconf_minofhour)) {
        repconf_minofhour = NULL;
    }
    if (repconf_minofhour) { 
    repconf_minofhour_local_nonprim = config_node_property_integer_parseFromJSON(repconf_minofhour); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_maxrows
    cJSON *repconf_maxrows = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.maxrows");
    if (cJSON_IsNull(repconf_maxrows)) {
        repconf_maxrows = NULL;
    }
    if (repconf_maxrows) { 
    repconf_maxrows_local_nonprim = config_node_property_integer_parseFromJSON(repconf_maxrows); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_fakedata
    cJSON *repconf_fakedata = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.fakedata");
    if (cJSON_IsNull(repconf_fakedata)) {
        repconf_fakedata = NULL;
    }
    if (repconf_fakedata) { 
    repconf_fakedata_local_nonprim = config_node_property_boolean_parseFromJSON(repconf_fakedata); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_snapshotuser
    cJSON *repconf_snapshotuser = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.snapshotuser");
    if (cJSON_IsNull(repconf_snapshotuser)) {
        repconf_snapshotuser = NULL;
    }
    if (repconf_snapshotuser) { 
    repconf_snapshotuser_local_nonprim = config_node_property_string_parseFromJSON(repconf_snapshotuser); //nonprimitive
    }

    // com_day_cq_reporting_impl_config_service_impl_properties->repconf_enforcesnapshotuser
    cJSON *repconf_enforcesnapshotuser = cJSON_GetObjectItemCaseSensitive(com_day_cq_reporting_impl_config_service_impl_propertiesJSON, "repconf.enforcesnapshotuser");
    if (cJSON_IsNull(repconf_enforcesnapshotuser)) {
        repconf_enforcesnapshotuser = NULL;
    }
    if (repconf_enforcesnapshotuser) { 
    repconf_enforcesnapshotuser_local_nonprim = config_node_property_boolean_parseFromJSON(repconf_enforcesnapshotuser); //nonprimitive
    }



    com_day_cq_reporting_impl_config_service_impl_properties_local_var = com_day_cq_reporting_impl_config_service_impl_properties_create_internal (
        repconf_timezone ? repconf_timezone_local_nonprim : NULL,
        repconf_locale ? repconf_locale_local_nonprim : NULL,
        repconf_snapshots ? repconf_snapshots_local_nonprim : NULL,
        repconf_repdir ? repconf_repdir_local_nonprim : NULL,
        repconf_hourofday ? repconf_hourofday_local_nonprim : NULL,
        repconf_minofhour ? repconf_minofhour_local_nonprim : NULL,
        repconf_maxrows ? repconf_maxrows_local_nonprim : NULL,
        repconf_fakedata ? repconf_fakedata_local_nonprim : NULL,
        repconf_snapshotuser ? repconf_snapshotuser_local_nonprim : NULL,
        repconf_enforcesnapshotuser ? repconf_enforcesnapshotuser_local_nonprim : NULL
        );

    if (!com_day_cq_reporting_impl_config_service_impl_properties_local_var) {
        goto end;
    }

    return com_day_cq_reporting_impl_config_service_impl_properties_local_var;
end:
    if (repconf_timezone_local_nonprim) {
        config_node_property_string_free(repconf_timezone_local_nonprim);
        repconf_timezone_local_nonprim = NULL;
    }
    if (repconf_locale_local_nonprim) {
        config_node_property_string_free(repconf_locale_local_nonprim);
        repconf_locale_local_nonprim = NULL;
    }
    if (repconf_snapshots_local_nonprim) {
        config_node_property_string_free(repconf_snapshots_local_nonprim);
        repconf_snapshots_local_nonprim = NULL;
    }
    if (repconf_repdir_local_nonprim) {
        config_node_property_string_free(repconf_repdir_local_nonprim);
        repconf_repdir_local_nonprim = NULL;
    }
    if (repconf_hourofday_local_nonprim) {
        config_node_property_integer_free(repconf_hourofday_local_nonprim);
        repconf_hourofday_local_nonprim = NULL;
    }
    if (repconf_minofhour_local_nonprim) {
        config_node_property_integer_free(repconf_minofhour_local_nonprim);
        repconf_minofhour_local_nonprim = NULL;
    }
    if (repconf_maxrows_local_nonprim) {
        config_node_property_integer_free(repconf_maxrows_local_nonprim);
        repconf_maxrows_local_nonprim = NULL;
    }
    if (repconf_fakedata_local_nonprim) {
        config_node_property_boolean_free(repconf_fakedata_local_nonprim);
        repconf_fakedata_local_nonprim = NULL;
    }
    if (repconf_snapshotuser_local_nonprim) {
        config_node_property_string_free(repconf_snapshotuser_local_nonprim);
        repconf_snapshotuser_local_nonprim = NULL;
    }
    if (repconf_enforcesnapshotuser_local_nonprim) {
        config_node_property_boolean_free(repconf_enforcesnapshotuser_local_nonprim);
        repconf_enforcesnapshotuser_local_nonprim = NULL;
    }
    return NULL;

}
