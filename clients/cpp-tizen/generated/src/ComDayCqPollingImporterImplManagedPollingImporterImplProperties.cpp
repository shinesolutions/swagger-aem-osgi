#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqPollingImporterImplManagedPollingImporterImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::ComDayCqPollingImporterImplManagedPollingImporterImplProperties()
{
	//__init();
}

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::~ComDayCqPollingImporterImplManagedPollingImporterImplProperties()
{
	//__cleanup();
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::__init()
{
	//importeruser = new ConfigNodePropertyString();
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::__cleanup()
{
	//if(importeruser != NULL) {
	//
	//delete importeruser;
	//importeruser = NULL;
	//}
	//
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *importeruserKey = "importer.user";
	node = json_object_get_member(pJsonObject, importeruserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&importeruser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&importeruser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqPollingImporterImplManagedPollingImporterImplProperties::ComDayCqPollingImporterImplManagedPollingImporterImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImporteruser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImporteruser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importeruserKey = "importer.user";
	json_object_set_member(pJsonObject, importeruserKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::getImporteruser()
{
	return importeruser;
}

void
ComDayCqPollingImporterImplManagedPollingImporterImplProperties::setImporteruser(ConfigNodePropertyString  importeruser)
{
	this->importeruser = importeruser;
}


