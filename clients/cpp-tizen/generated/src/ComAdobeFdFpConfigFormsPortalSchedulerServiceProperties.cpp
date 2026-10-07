#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties()
{
	//__init();
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::~ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties()
{
	//__cleanup();
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::__init()
{
	//formportalinterval = new ConfigNodePropertyString();
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::__cleanup()
{
	//if(formportalinterval != NULL) {
	//
	//delete formportalinterval;
	//formportalinterval = NULL;
	//}
	//
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *formportalintervalKey = "formportal.interval";
	node = json_object_get_member(pJsonObject, formportalintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&formportalinterval, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&formportalinterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFormportalinterval();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFormportalinterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *formportalintervalKey = "formportal.interval";
	json_object_set_member(pJsonObject, formportalintervalKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::getFormportalinterval()
{
	return formportalinterval;
}

void
ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties::setFormportalinterval(ConfigNodePropertyString  formportalinterval)
{
	this->formportalinterval = formportalinterval;
}


