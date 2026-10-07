#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties()
{
	//__init();
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::~OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties()
{
	//__cleanup();
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::__init()
{
	//felixmemoryusagedumpthreshold = new ConfigNodePropertyInteger();
	//felixmemoryusagedumpinterval = new ConfigNodePropertyInteger();
	//felixmemoryusagedumplocation = new ConfigNodePropertyString();
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::__cleanup()
{
	//if(felixmemoryusagedumpthreshold != NULL) {
	//
	//delete felixmemoryusagedumpthreshold;
	//felixmemoryusagedumpthreshold = NULL;
	//}
	//if(felixmemoryusagedumpinterval != NULL) {
	//
	//delete felixmemoryusagedumpinterval;
	//felixmemoryusagedumpinterval = NULL;
	//}
	//if(felixmemoryusagedumplocation != NULL) {
	//
	//delete felixmemoryusagedumplocation;
	//felixmemoryusagedumplocation = NULL;
	//}
	//
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *felixmemoryusagedumpthresholdKey = "felix.memoryusage.dump.threshold";
	node = json_object_get_member(pJsonObject, felixmemoryusagedumpthresholdKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&felixmemoryusagedumpthreshold, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&felixmemoryusagedumpthreshold);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *felixmemoryusagedumpintervalKey = "felix.memoryusage.dump.interval";
	node = json_object_get_member(pJsonObject, felixmemoryusagedumpintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&felixmemoryusagedumpinterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&felixmemoryusagedumpinterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *felixmemoryusagedumplocationKey = "felix.memoryusage.dump.location";
	node = json_object_get_member(pJsonObject, felixmemoryusagedumplocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&felixmemoryusagedumplocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&felixmemoryusagedumplocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFelixmemoryusagedumpthreshold();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFelixmemoryusagedumpthreshold());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *felixmemoryusagedumpthresholdKey = "felix.memoryusage.dump.threshold";
	json_object_set_member(pJsonObject, felixmemoryusagedumpthresholdKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getFelixmemoryusagedumpinterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getFelixmemoryusagedumpinterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *felixmemoryusagedumpintervalKey = "felix.memoryusage.dump.interval";
	json_object_set_member(pJsonObject, felixmemoryusagedumpintervalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFelixmemoryusagedumplocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFelixmemoryusagedumplocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *felixmemoryusagedumplocationKey = "felix.memoryusage.dump.location";
	json_object_set_member(pJsonObject, felixmemoryusagedumplocationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumpthreshold()
{
	return felixmemoryusagedumpthreshold;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumpthreshold(ConfigNodePropertyInteger  felixmemoryusagedumpthreshold)
{
	this->felixmemoryusagedumpthreshold = felixmemoryusagedumpthreshold;
}

ConfigNodePropertyInteger
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumpinterval()
{
	return felixmemoryusagedumpinterval;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumpinterval(ConfigNodePropertyInteger  felixmemoryusagedumpinterval)
{
	this->felixmemoryusagedumpinterval = felixmemoryusagedumpinterval;
}

ConfigNodePropertyString
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::getFelixmemoryusagedumplocation()
{
	return felixmemoryusagedumplocation;
}

void
OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties::setFelixmemoryusagedumplocation(ConfigNodePropertyString  felixmemoryusagedumplocation)
{
	this->felixmemoryusagedumplocation = felixmemoryusagedumplocation;
}


