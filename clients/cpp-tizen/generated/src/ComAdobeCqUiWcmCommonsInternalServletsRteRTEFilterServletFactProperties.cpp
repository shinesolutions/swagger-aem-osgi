#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties()
{
	//__init();
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::~ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties()
{
	//__cleanup();
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::__init()
{
	//resourcetypes = new ConfigNodePropertyArray();
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::__cleanup()
{
	//if(resourcetypes != NULL) {
	//
	//delete resourcetypes;
	//resourcetypes = NULL;
	//}
	//
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resourcetypesKey = "resource.types";
	node = json_object_get_member(pJsonObject, resourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourcetypesKey = "resource.types";
	json_object_set_member(pJsonObject, resourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::getResourcetypes()
{
	return resourcetypes;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties::setResourcetypes(ConfigNodePropertyArray  resourcetypes)
{
	this->resourcetypes = resourcetypes;
}


