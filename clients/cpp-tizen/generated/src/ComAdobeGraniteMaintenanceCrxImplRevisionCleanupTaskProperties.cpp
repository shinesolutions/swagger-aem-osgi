#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties()
{
	//__init();
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::~ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::__init()
{
	//fullgcdays = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::__cleanup()
{
	//if(fullgcdays != NULL) {
	//
	//delete fullgcdays;
	//fullgcdays = NULL;
	//}
	//
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fullgcdaysKey = "full.gc.days";
	node = json_object_get_member(pJsonObject, fullgcdaysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fullgcdays, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fullgcdays);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFullgcdays();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFullgcdays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fullgcdaysKey = "full.gc.days";
	json_object_set_member(pJsonObject, fullgcdaysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::getFullgcdays()
{
	return fullgcdays;
}

void
ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties::setFullgcdays(ConfigNodePropertyArray  fullgcdays)
{
	this->fullgcdays = fullgcdays;
}


