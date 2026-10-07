#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties()
{
	//__init();
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::~ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::__init()
{
	//namewhitelist = new ConfigNodePropertyString();
	//allowexpressions = new ConfigNodePropertyBoolean();
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::__cleanup()
{
	//if(namewhitelist != NULL) {
	//
	//delete namewhitelist;
	//namewhitelist = NULL;
	//}
	//if(allowexpressions != NULL) {
	//
	//delete allowexpressions;
	//allowexpressions = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *namewhitelistKey = "name.whitelist";
	node = json_object_get_member(pJsonObject, namewhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&namewhitelist, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&namewhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowexpressionsKey = "allow.expressions";
	node = json_object_get_member(pJsonObject, allowexpressionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&allowexpressions, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&allowexpressions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNamewhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNamewhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *namewhitelistKey = "name.whitelist";
	json_object_set_member(pJsonObject, namewhitelistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAllowexpressions();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAllowexpressions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowexpressionsKey = "allow.expressions";
	json_object_set_member(pJsonObject, allowexpressionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::getNamewhitelist()
{
	return namewhitelist;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::setNamewhitelist(ConfigNodePropertyString  namewhitelist)
{
	this->namewhitelist = namewhitelist;
}

ConfigNodePropertyBoolean
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::getAllowexpressions()
{
	return allowexpressions;
}

void
ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties::setAllowexpressions(ConfigNodePropertyBoolean  allowexpressions)
{
	this->allowexpressions = allowexpressions;
}


