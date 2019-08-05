#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties()
{
	//__init();
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::~OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//path = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}


