#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties()
{
	//__init();
}

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::~ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::__init()
{
	//providerName = new ConfigNodePropertyString();
	//forwardrequests = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::__cleanup()
{
	//if(providerName != NULL) {
	//
	//delete providerName;
	//providerName = NULL;
	//}
	//if(forwardrequests != NULL) {
	//
	//delete forwardrequests;
	//forwardrequests = NULL;
	//}
	//
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *providerNameKey = "providerName";
	node = json_object_get_member(pJsonObject, providerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&providerName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&providerName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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

ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProviderName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProviderName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *providerNameKey = "providerName";
	json_object_set_member(pJsonObject, providerNameKey, node);
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

ConfigNodePropertyString
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::getProviderName()
{
	return providerName;
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::setProviderName(ConfigNodePropertyString  providerName)
{
	this->providerName = providerName;
}

ConfigNodePropertyBoolean
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::getForwardrequests()
{
	return forwardrequests;
}

void
ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties::setForwardrequests(ConfigNodePropertyBoolean  forwardrequests)
{
	this->forwardrequests = forwardrequests;
}


