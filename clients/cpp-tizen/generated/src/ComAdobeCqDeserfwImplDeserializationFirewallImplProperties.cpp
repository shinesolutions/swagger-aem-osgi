#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::ComAdobeCqDeserfwImplDeserializationFirewallImplProperties()
{
	//__init();
}

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::~ComAdobeCqDeserfwImplDeserializationFirewallImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::__init()
{
	//firewalldeserializationwhitelist = new ConfigNodePropertyArray();
	//firewalldeserializationblacklist = new ConfigNodePropertyArray();
	//firewalldeserializationdiagnostics = new ConfigNodePropertyString();
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::__cleanup()
{
	//if(firewalldeserializationwhitelist != NULL) {
	//
	//delete firewalldeserializationwhitelist;
	//firewalldeserializationwhitelist = NULL;
	//}
	//if(firewalldeserializationblacklist != NULL) {
	//
	//delete firewalldeserializationblacklist;
	//firewalldeserializationblacklist = NULL;
	//}
	//if(firewalldeserializationdiagnostics != NULL) {
	//
	//delete firewalldeserializationdiagnostics;
	//firewalldeserializationdiagnostics = NULL;
	//}
	//
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *firewalldeserializationwhitelistKey = "firewall.deserialization.whitelist";
	node = json_object_get_member(pJsonObject, firewalldeserializationwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&firewalldeserializationwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&firewalldeserializationwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *firewalldeserializationblacklistKey = "firewall.deserialization.blacklist";
	node = json_object_get_member(pJsonObject, firewalldeserializationblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&firewalldeserializationblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&firewalldeserializationblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *firewalldeserializationdiagnosticsKey = "firewall.deserialization.diagnostics";
	node = json_object_get_member(pJsonObject, firewalldeserializationdiagnosticsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&firewalldeserializationdiagnostics, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&firewalldeserializationdiagnostics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFirewalldeserializationwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFirewalldeserializationwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *firewalldeserializationwhitelistKey = "firewall.deserialization.whitelist";
	json_object_set_member(pJsonObject, firewalldeserializationwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFirewalldeserializationblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFirewalldeserializationblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *firewalldeserializationblacklistKey = "firewall.deserialization.blacklist";
	json_object_set_member(pJsonObject, firewalldeserializationblacklistKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getFirewalldeserializationdiagnostics();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getFirewalldeserializationdiagnostics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *firewalldeserializationdiagnosticsKey = "firewall.deserialization.diagnostics";
	json_object_set_member(pJsonObject, firewalldeserializationdiagnosticsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationwhitelist()
{
	return firewalldeserializationwhitelist;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationwhitelist(ConfigNodePropertyArray  firewalldeserializationwhitelist)
{
	this->firewalldeserializationwhitelist = firewalldeserializationwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationblacklist()
{
	return firewalldeserializationblacklist;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationblacklist(ConfigNodePropertyArray  firewalldeserializationblacklist)
{
	this->firewalldeserializationblacklist = firewalldeserializationblacklist;
}

ConfigNodePropertyString
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationdiagnostics()
{
	return firewalldeserializationdiagnostics;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationdiagnostics(ConfigNodePropertyString  firewalldeserializationdiagnostics)
{
	this->firewalldeserializationdiagnostics = firewalldeserializationdiagnostics;
}


