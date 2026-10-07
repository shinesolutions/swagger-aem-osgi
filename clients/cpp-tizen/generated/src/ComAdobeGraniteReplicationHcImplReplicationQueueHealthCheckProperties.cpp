#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::~ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::__init()
{
	//numberofretriesallowed = new ConfigNodePropertyInteger();
	//hctags = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::__cleanup()
{
	//if(numberofretriesallowed != NULL) {
	//
	//delete numberofretriesallowed;
	//numberofretriesallowed = NULL;
	//}
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *numberofretriesallowedKey = "number.of.retries.allowed";
	node = json_object_get_member(pJsonObject, numberofretriesallowedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&numberofretriesallowed, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&numberofretriesallowed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNumberofretriesallowed();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNumberofretriesallowed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numberofretriesallowedKey = "number.of.retries.allowed";
	json_object_set_member(pJsonObject, numberofretriesallowedKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::getNumberofretriesallowed()
{
	return numberofretriesallowed;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::setNumberofretriesallowed(ConfigNodePropertyInteger  numberofretriesallowed)
{
	this->numberofretriesallowed = numberofretriesallowed;
}

ConfigNodePropertyArray
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}


