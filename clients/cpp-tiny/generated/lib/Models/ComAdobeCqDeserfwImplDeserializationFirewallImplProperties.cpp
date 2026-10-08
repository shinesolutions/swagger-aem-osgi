

#include "ComAdobeCqDeserfwImplDeserializationFirewallImplProperties.h"

using namespace Tiny;

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::ComAdobeCqDeserfwImplDeserializationFirewallImplProperties()
{
	firewalldeserializationwhitelist = ConfigNodePropertyArray();
	firewalldeserializationblacklist = ConfigNodePropertyArray();
	firewalldeserializationdiagnostics = ConfigNodePropertyString();
}

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::ComAdobeCqDeserfwImplDeserializationFirewallImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::~ComAdobeCqDeserfwImplDeserializationFirewallImplProperties()
{

}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *firewalldeserializationwhitelistKey = "firewall.deserialization.whitelist";

    if(object.has_key(firewalldeserializationwhitelistKey))
    {
        bourne::json value = object[firewalldeserializationwhitelistKey];




        ConfigNodePropertyArray* obj = &firewalldeserializationwhitelist;
		obj->fromJson(value.dump());

    }

    const char *firewalldeserializationblacklistKey = "firewall.deserialization.blacklist";

    if(object.has_key(firewalldeserializationblacklistKey))
    {
        bourne::json value = object[firewalldeserializationblacklistKey];




        ConfigNodePropertyArray* obj = &firewalldeserializationblacklist;
		obj->fromJson(value.dump());

    }

    const char *firewalldeserializationdiagnosticsKey = "firewall.deserialization.diagnostics";

    if(object.has_key(firewalldeserializationdiagnosticsKey))
    {
        bourne::json value = object[firewalldeserializationdiagnosticsKey];




        ConfigNodePropertyString* obj = &firewalldeserializationdiagnostics;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["firewalldeserializationwhitelist"] = getFirewalldeserializationwhitelist().toJson();






	object["firewalldeserializationblacklist"] = getFirewalldeserializationblacklist().toJson();






	object["firewalldeserializationdiagnostics"] = getFirewalldeserializationdiagnostics().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationwhitelist()
{
	return firewalldeserializationwhitelist;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationwhitelist(ConfigNodePropertyArray firewalldeserializationwhitelist)
{
	this->firewalldeserializationwhitelist = firewalldeserializationwhitelist;
}

ConfigNodePropertyArray
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationblacklist()
{
	return firewalldeserializationblacklist;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationblacklist(ConfigNodePropertyArray firewalldeserializationblacklist)
{
	this->firewalldeserializationblacklist = firewalldeserializationblacklist;
}

ConfigNodePropertyString
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::getFirewalldeserializationdiagnostics()
{
	return firewalldeserializationdiagnostics;
}

void
ComAdobeCqDeserfwImplDeserializationFirewallImplProperties::setFirewalldeserializationdiagnostics(ConfigNodePropertyString firewalldeserializationdiagnostics)
{
	this->firewalldeserializationdiagnostics = firewalldeserializationdiagnostics;
}



