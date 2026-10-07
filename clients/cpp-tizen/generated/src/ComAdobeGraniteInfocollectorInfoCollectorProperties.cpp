#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteInfocollectorInfoCollectorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteInfocollectorInfoCollectorProperties::ComAdobeGraniteInfocollectorInfoCollectorProperties()
{
	//__init();
}

ComAdobeGraniteInfocollectorInfoCollectorProperties::~ComAdobeGraniteInfocollectorInfoCollectorProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::__init()
{
	//graniteinfocollectorincludeThreadDumps = new ConfigNodePropertyBoolean();
	//graniteinfocollectorincludeHeapDump = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::__cleanup()
{
	//if(graniteinfocollectorincludeThreadDumps != NULL) {
	//
	//delete graniteinfocollectorincludeThreadDumps;
	//graniteinfocollectorincludeThreadDumps = NULL;
	//}
	//if(graniteinfocollectorincludeHeapDump != NULL) {
	//
	//delete graniteinfocollectorincludeHeapDump;
	//graniteinfocollectorincludeHeapDump = NULL;
	//}
	//
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *graniteinfocollectorincludeThreadDumpsKey = "granite.infocollector.includeThreadDumps";
	node = json_object_get_member(pJsonObject, graniteinfocollectorincludeThreadDumpsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteinfocollectorincludeThreadDumps, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteinfocollectorincludeThreadDumps);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *graniteinfocollectorincludeHeapDumpKey = "granite.infocollector.includeHeapDump";
	node = json_object_get_member(pJsonObject, graniteinfocollectorincludeHeapDumpKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&graniteinfocollectorincludeHeapDump, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&graniteinfocollectorincludeHeapDump);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteInfocollectorInfoCollectorProperties::ComAdobeGraniteInfocollectorInfoCollectorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteInfocollectorInfoCollectorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteinfocollectorincludeThreadDumps();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteinfocollectorincludeThreadDumps());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteinfocollectorincludeThreadDumpsKey = "granite.infocollector.includeThreadDumps";
	json_object_set_member(pJsonObject, graniteinfocollectorincludeThreadDumpsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGraniteinfocollectorincludeHeapDump();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGraniteinfocollectorincludeHeapDump());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *graniteinfocollectorincludeHeapDumpKey = "granite.infocollector.includeHeapDump";
	json_object_set_member(pJsonObject, graniteinfocollectorincludeHeapDumpKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteInfocollectorInfoCollectorProperties::getGraniteinfocollectorincludeThreadDumps()
{
	return graniteinfocollectorincludeThreadDumps;
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::setGraniteinfocollectorincludeThreadDumps(ConfigNodePropertyBoolean  graniteinfocollectorincludeThreadDumps)
{
	this->graniteinfocollectorincludeThreadDumps = graniteinfocollectorincludeThreadDumps;
}

ConfigNodePropertyBoolean
ComAdobeGraniteInfocollectorInfoCollectorProperties::getGraniteinfocollectorincludeHeapDump()
{
	return graniteinfocollectorincludeHeapDump;
}

void
ComAdobeGraniteInfocollectorInfoCollectorProperties::setGraniteinfocollectorincludeHeapDump(ConfigNodePropertyBoolean  graniteinfocollectorincludeHeapDump)
{
	this->graniteinfocollectorincludeHeapDump = graniteinfocollectorincludeHeapDump;
}


