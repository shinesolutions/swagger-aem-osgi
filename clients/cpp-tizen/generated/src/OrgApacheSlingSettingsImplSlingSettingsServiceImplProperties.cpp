#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties()
{
	//__init();
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::~OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::__init()
{
	//slingname = new ConfigNodePropertyString();
	//slingdescription = new ConfigNodePropertyString();
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::__cleanup()
{
	//if(slingname != NULL) {
	//
	//delete slingname;
	//slingname = NULL;
	//}
	//if(slingdescription != NULL) {
	//
	//delete slingdescription;
	//slingdescription = NULL;
	//}
	//
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingnameKey = "sling.name";
	node = json_object_get_member(pJsonObject, slingnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingdescriptionKey = "sling.description";
	node = json_object_get_member(pJsonObject, slingdescriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingdescription, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingdescription);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingnameKey = "sling.name";
	json_object_set_member(pJsonObject, slingnameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingdescription();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingdescription());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingdescriptionKey = "sling.description";
	json_object_set_member(pJsonObject, slingdescriptionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::getSlingname()
{
	return slingname;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::setSlingname(ConfigNodePropertyString  slingname)
{
	this->slingname = slingname;
}

ConfigNodePropertyString
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::getSlingdescription()
{
	return slingdescription;
}

void
OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties::setSlingdescription(ConfigNodePropertyString  slingdescription)
{
	this->slingdescription = slingdescription;
}


