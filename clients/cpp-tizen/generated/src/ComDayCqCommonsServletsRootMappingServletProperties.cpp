#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqCommonsServletsRootMappingServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqCommonsServletsRootMappingServletProperties::ComDayCqCommonsServletsRootMappingServletProperties()
{
	//__init();
}

ComDayCqCommonsServletsRootMappingServletProperties::~ComDayCqCommonsServletsRootMappingServletProperties()
{
	//__cleanup();
}

void
ComDayCqCommonsServletsRootMappingServletProperties::__init()
{
	//rootmappingtarget = new ConfigNodePropertyString();
}

void
ComDayCqCommonsServletsRootMappingServletProperties::__cleanup()
{
	//if(rootmappingtarget != NULL) {
	//
	//delete rootmappingtarget;
	//rootmappingtarget = NULL;
	//}
	//
}

void
ComDayCqCommonsServletsRootMappingServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rootmappingtargetKey = "rootmapping.target";
	node = json_object_get_member(pJsonObject, rootmappingtargetKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&rootmappingtarget, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&rootmappingtarget);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqCommonsServletsRootMappingServletProperties::ComDayCqCommonsServletsRootMappingServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqCommonsServletsRootMappingServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRootmappingtarget();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRootmappingtarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rootmappingtargetKey = "rootmapping.target";
	json_object_set_member(pJsonObject, rootmappingtargetKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqCommonsServletsRootMappingServletProperties::getRootmappingtarget()
{
	return rootmappingtarget;
}

void
ComDayCqCommonsServletsRootMappingServletProperties::setRootmappingtarget(ConfigNodePropertyString  rootmappingtarget)
{
	this->rootmappingtarget = rootmappingtarget;
}


