#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties()
{
	//__init();
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::~ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//dispatcheraddress = new ConfigNodePropertyString();
	//dispatcherfilterallowed = new ConfigNodePropertyArray();
	//dispatcherfilterblocked = new ConfigNodePropertyArray();
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(dispatcheraddress != NULL) {
	//
	//delete dispatcheraddress;
	//dispatcheraddress = NULL;
	//}
	//if(dispatcherfilterallowed != NULL) {
	//
	//delete dispatcherfilterallowed;
	//dispatcherfilterallowed = NULL;
	//}
	//if(dispatcherfilterblocked != NULL) {
	//
	//delete dispatcherfilterblocked;
	//dispatcherfilterblocked = NULL;
	//}
	//
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *dispatcheraddressKey = "dispatcher.address";
	node = json_object_get_member(pJsonObject, dispatcheraddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&dispatcheraddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&dispatcheraddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dispatcherfilterallowedKey = "dispatcher.filter.allowed";
	node = json_object_get_member(pJsonObject, dispatcherfilterallowedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&dispatcherfilterallowed, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&dispatcherfilterallowed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *dispatcherfilterblockedKey = "dispatcher.filter.blocked";
	node = json_object_get_member(pJsonObject, dispatcherfilterblockedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&dispatcherfilterblocked, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&dispatcherfilterblocked);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDispatcheraddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDispatcheraddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dispatcheraddressKey = "dispatcher.address";
	json_object_set_member(pJsonObject, dispatcheraddressKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDispatcherfilterallowed();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDispatcherfilterallowed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dispatcherfilterallowedKey = "dispatcher.filter.allowed";
	json_object_set_member(pJsonObject, dispatcherfilterallowedKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDispatcherfilterblocked();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDispatcherfilterblocked());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dispatcherfilterblockedKey = "dispatcher.filter.blocked";
	json_object_set_member(pJsonObject, dispatcherfilterblockedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcheraddress()
{
	return dispatcheraddress;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcheraddress(ConfigNodePropertyString  dispatcheraddress)
{
	this->dispatcheraddress = dispatcheraddress;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcherfilterallowed()
{
	return dispatcherfilterallowed;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcherfilterallowed(ConfigNodePropertyArray  dispatcherfilterallowed)
{
	this->dispatcherfilterallowed = dispatcherfilterallowed;
}

ConfigNodePropertyArray
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::getDispatcherfilterblocked()
{
	return dispatcherfilterblocked;
}

void
ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties::setDispatcherfilterblocked(ConfigNodePropertyArray  dispatcherfilterblocked)
{
	this->dispatcherfilterblocked = dispatcherfilterblocked;
}


