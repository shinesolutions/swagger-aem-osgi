#ifndef com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_TEST
#define com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties.h"
com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t* instantiate_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(int include_optional);

#include "test_config_node_property_boolean.c"
#include "test_config_node_property_string.c"


com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t* instantiate_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(int include_optional) {
  com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t* com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties = NULL;
  if (include_optional) {
    com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties = com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_create(
       // false, not to have infinite recursion
      instantiate_config_node_property_boolean(0),
       // false, not to have infinite recursion
      instantiate_config_node_property_string(0)
    );
  } else {
    com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties = com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_create(
      NULL,
      NULL
    );
  }

  return com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties;
}


#ifdef com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_MAIN

void test_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(int include_optional) {
    com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t* com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_1 = instantiate_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(include_optional);

	cJSON* jsoncom_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_1 = com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_convertToJSON(com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_1);
	printf("com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties :\n%s\n", cJSON_Print(jsoncom_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_1));
	com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_t* com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_2 = com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_parseFromJSON(jsoncom_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_1);
	cJSON* jsoncom_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_2 = com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_convertToJSON(com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_2);
	printf("repeating com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties:\n%s\n", cJSON_Print(jsoncom_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_2));
}

int main() {
  test_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(1);
  test_com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_MAIN
#endif // com_adobe_cq_commerce_impl_asset_dynamic_image_handler_properties_TEST
