#ifndef org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_TEST
#define org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info.h"
org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_t* instantiate_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(int include_optional);

#include "test_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties.c"


org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_t* instantiate_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(int include_optional) {
  org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_t* org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info = NULL;
  if (include_optional) {
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_create(
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_properties(0),
      "0",
      "0"
    );
  } else {
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_create(
      "0",
      "0",
      "0",
      NULL,
      "0",
      "0"
    );
  }

  return org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info;
}


#ifdef org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_MAIN

void test_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(int include_optional) {
    org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_t* org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_1 = instantiate_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(include_optional);

	cJSON* jsonorg_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_1 = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_convertToJSON(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_1);
	printf("org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info :\n%s\n", cJSON_Print(jsonorg_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_1));
	org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_t* org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_2 = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_parseFromJSON(jsonorg_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_1);
	cJSON* jsonorg_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_2 = org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_convertToJSON(org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_2);
	printf("repeating org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info:\n%s\n", cJSON_Print(jsonorg_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_2));
}

int main() {
  test_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(1);
  test_org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_MAIN
#endif // org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_info_TEST
