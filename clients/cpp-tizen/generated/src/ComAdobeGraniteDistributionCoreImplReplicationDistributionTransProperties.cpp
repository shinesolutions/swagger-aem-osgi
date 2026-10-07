#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::~ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::__init()
{
	//forwardrequests = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::__cleanup()
{
	//if(forwardrequests != NULL) {
	//
	//delete forwardrequests;
	//forwardrequests = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *forwardrequestsKey = "forward.requests";
	node = json_object_get_member(pJsonObject, forwardrequestsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&forwardrequests, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&forwardrequests);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getForwardrequests();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getForwardrequests());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *forwardrequestsKey = "forward.requests";
	json_object_set_member(pJsonObject, forwardrequestsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::getForwardrequests()
{
	return forwardrequests;
}

void
ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties::setForwardrequests(ConfigNodePropertyBoolean  forwardrequests)
{
	this->forwardrequests = forwardrequests;
}


