

#include "OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h"

using namespace Tiny;

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties()
{
	resourceresolversearchpath = ConfigNodePropertyArray();
	resourceresolvermanglenamespaces = ConfigNodePropertyBoolean();
	resourceresolverallowDirect = ConfigNodePropertyBoolean();
	resourceresolverrequiredproviders = ConfigNodePropertyArray();
	resourceresolverrequiredprovidernames = ConfigNodePropertyArray();
	resourceresolvervirtual = ConfigNodePropertyArray();
	resourceresolvermapping = ConfigNodePropertyArray();
	resourceresolvermaplocation = ConfigNodePropertyString();
	resourceresolvermapobservation = ConfigNodePropertyArray();
	resourceresolverdefaultvanityredirectstatus = ConfigNodePropertyInteger();
	resourceresolverenablevanitypath = ConfigNodePropertyBoolean();
	resourceresolvervanitypathmaxEntries = ConfigNodePropertyInteger();
	resourceresolvervanitypathmaxEntriesstartup = ConfigNodePropertyBoolean();
	resourceresolvervanitypathbloomfiltermaxBytes = ConfigNodePropertyInteger();
	resourceresolveroptimizealiasresolution = ConfigNodePropertyBoolean();
	resourceresolvervanitypathwhitelist = ConfigNodePropertyArray();
	resourceresolvervanitypathblacklist = ConfigNodePropertyArray();
	resourceresolvervanityprecedence = ConfigNodePropertyBoolean();
	resourceresolverproviderhandlingparanoid = ConfigNodePropertyBoolean();
	resourceresolverlogclosing = ConfigNodePropertyBoolean();
	resourceresolverlogunclosed = ConfigNodePropertyBoolean();
}

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::~OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties()
{

}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resourceresolversearchpathKey = "resource.resolver.searchpath";

    if(object.has_key(resourceresolversearchpathKey))
    {
        bourne::json value = object[resourceresolversearchpathKey];




        ConfigNodePropertyArray* obj = &resourceresolversearchpath;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvermanglenamespacesKey = "resource.resolver.manglenamespaces";

    if(object.has_key(resourceresolvermanglenamespacesKey))
    {
        bourne::json value = object[resourceresolvermanglenamespacesKey];




        ConfigNodePropertyBoolean* obj = &resourceresolvermanglenamespaces;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverallowDirectKey = "resource.resolver.allowDirect";

    if(object.has_key(resourceresolverallowDirectKey))
    {
        bourne::json value = object[resourceresolverallowDirectKey];




        ConfigNodePropertyBoolean* obj = &resourceresolverallowDirect;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverrequiredprovidersKey = "resource.resolver.required.providers";

    if(object.has_key(resourceresolverrequiredprovidersKey))
    {
        bourne::json value = object[resourceresolverrequiredprovidersKey];




        ConfigNodePropertyArray* obj = &resourceresolverrequiredproviders;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverrequiredprovidernamesKey = "resource.resolver.required.providernames";

    if(object.has_key(resourceresolverrequiredprovidernamesKey))
    {
        bourne::json value = object[resourceresolverrequiredprovidernamesKey];




        ConfigNodePropertyArray* obj = &resourceresolverrequiredprovidernames;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervirtualKey = "resource.resolver.virtual";

    if(object.has_key(resourceresolvervirtualKey))
    {
        bourne::json value = object[resourceresolvervirtualKey];




        ConfigNodePropertyArray* obj = &resourceresolvervirtual;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvermappingKey = "resource.resolver.mapping";

    if(object.has_key(resourceresolvermappingKey))
    {
        bourne::json value = object[resourceresolvermappingKey];




        ConfigNodePropertyArray* obj = &resourceresolvermapping;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvermaplocationKey = "resource.resolver.map.location";

    if(object.has_key(resourceresolvermaplocationKey))
    {
        bourne::json value = object[resourceresolvermaplocationKey];




        ConfigNodePropertyString* obj = &resourceresolvermaplocation;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvermapobservationKey = "resource.resolver.map.observation";

    if(object.has_key(resourceresolvermapobservationKey))
    {
        bourne::json value = object[resourceresolvermapobservationKey];




        ConfigNodePropertyArray* obj = &resourceresolvermapobservation;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverdefaultvanityredirectstatusKey = "resource.resolver.default.vanity.redirect.status";

    if(object.has_key(resourceresolverdefaultvanityredirectstatusKey))
    {
        bourne::json value = object[resourceresolverdefaultvanityredirectstatusKey];




        ConfigNodePropertyInteger* obj = &resourceresolverdefaultvanityredirectstatus;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverenablevanitypathKey = "resource.resolver.enable.vanitypath";

    if(object.has_key(resourceresolverenablevanitypathKey))
    {
        bourne::json value = object[resourceresolverenablevanitypathKey];




        ConfigNodePropertyBoolean* obj = &resourceresolverenablevanitypath;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanitypathmaxEntriesKey = "resource.resolver.vanitypath.maxEntries";

    if(object.has_key(resourceresolvervanitypathmaxEntriesKey))
    {
        bourne::json value = object[resourceresolvervanitypathmaxEntriesKey];




        ConfigNodePropertyInteger* obj = &resourceresolvervanitypathmaxEntries;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanitypathmaxEntriesstartupKey = "resource.resolver.vanitypath.maxEntries.startup";

    if(object.has_key(resourceresolvervanitypathmaxEntriesstartupKey))
    {
        bourne::json value = object[resourceresolvervanitypathmaxEntriesstartupKey];




        ConfigNodePropertyBoolean* obj = &resourceresolvervanitypathmaxEntriesstartup;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanitypathbloomfiltermaxBytesKey = "resource.resolver.vanitypath.bloomfilter.maxBytes";

    if(object.has_key(resourceresolvervanitypathbloomfiltermaxBytesKey))
    {
        bourne::json value = object[resourceresolvervanitypathbloomfiltermaxBytesKey];




        ConfigNodePropertyInteger* obj = &resourceresolvervanitypathbloomfiltermaxBytes;
		obj->fromJson(value.dump());

    }

    const char *resourceresolveroptimizealiasresolutionKey = "resource.resolver.optimize.alias.resolution";

    if(object.has_key(resourceresolveroptimizealiasresolutionKey))
    {
        bourne::json value = object[resourceresolveroptimizealiasresolutionKey];




        ConfigNodePropertyBoolean* obj = &resourceresolveroptimizealiasresolution;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanitypathwhitelistKey = "resource.resolver.vanitypath.whitelist";

    if(object.has_key(resourceresolvervanitypathwhitelistKey))
    {
        bourne::json value = object[resourceresolvervanitypathwhitelistKey];




        ConfigNodePropertyArray* obj = &resourceresolvervanitypathwhitelist;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanitypathblacklistKey = "resource.resolver.vanitypath.blacklist";

    if(object.has_key(resourceresolvervanitypathblacklistKey))
    {
        bourne::json value = object[resourceresolvervanitypathblacklistKey];




        ConfigNodePropertyArray* obj = &resourceresolvervanitypathblacklist;
		obj->fromJson(value.dump());

    }

    const char *resourceresolvervanityprecedenceKey = "resource.resolver.vanity.precedence";

    if(object.has_key(resourceresolvervanityprecedenceKey))
    {
        bourne::json value = object[resourceresolvervanityprecedenceKey];




        ConfigNodePropertyBoolean* obj = &resourceresolvervanityprecedence;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverproviderhandlingparanoidKey = "resource.resolver.providerhandling.paranoid";

    if(object.has_key(resourceresolverproviderhandlingparanoidKey))
    {
        bourne::json value = object[resourceresolverproviderhandlingparanoidKey];




        ConfigNodePropertyBoolean* obj = &resourceresolverproviderhandlingparanoid;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverlogclosingKey = "resource.resolver.log.closing";

    if(object.has_key(resourceresolverlogclosingKey))
    {
        bourne::json value = object[resourceresolverlogclosingKey];




        ConfigNodePropertyBoolean* obj = &resourceresolverlogclosing;
		obj->fromJson(value.dump());

    }

    const char *resourceresolverlogunclosedKey = "resource.resolver.log.unclosed";

    if(object.has_key(resourceresolverlogunclosedKey))
    {
        bourne::json value = object[resourceresolverlogunclosedKey];




        ConfigNodePropertyBoolean* obj = &resourceresolverlogunclosed;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["resourceresolversearchpath"] = getResourceresolversearchpath().toJson();






	object["resourceresolvermanglenamespaces"] = getResourceresolvermanglenamespaces().toJson();






	object["resourceresolverallowDirect"] = getResourceresolverallowDirect().toJson();






	object["resourceresolverrequiredproviders"] = getResourceresolverrequiredproviders().toJson();






	object["resourceresolverrequiredprovidernames"] = getResourceresolverrequiredprovidernames().toJson();






	object["resourceresolvervirtual"] = getResourceresolvervirtual().toJson();






	object["resourceresolvermapping"] = getResourceresolvermapping().toJson();






	object["resourceresolvermaplocation"] = getResourceresolvermaplocation().toJson();






	object["resourceresolvermapobservation"] = getResourceresolvermapobservation().toJson();






	object["resourceresolverdefaultvanityredirectstatus"] = getResourceresolverdefaultvanityredirectstatus().toJson();






	object["resourceresolverenablevanitypath"] = getResourceresolverenablevanitypath().toJson();






	object["resourceresolvervanitypathmaxEntries"] = getResourceresolvervanitypathmaxEntries().toJson();






	object["resourceresolvervanitypathmaxEntriesstartup"] = getResourceresolvervanitypathmaxEntriesstartup().toJson();






	object["resourceresolvervanitypathbloomfiltermaxBytes"] = getResourceresolvervanitypathbloomfiltermaxBytes().toJson();






	object["resourceresolveroptimizealiasresolution"] = getResourceresolveroptimizealiasresolution().toJson();






	object["resourceresolvervanitypathwhitelist"] = getResourceresolvervanitypathwhitelist().toJson();






	object["resourceresolvervanitypathblacklist"] = getResourceresolvervanitypathblacklist().toJson();






	object["resourceresolvervanityprecedence"] = getResourceresolvervanityprecedence().toJson();






	object["resourceresolverproviderhandlingparanoid"] = getResourceresolverproviderhandlingparanoid().toJson();






	object["resourceresolverlogclosing"] = getResourceresolverlogclosing().toJson();






	object["resourceresolverlogunclosed"] = getResourceresolverlogunclosed().toJson();


    return object;

}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolversearchpath()
{
	return resourceresolversearchpath;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolversearchpath(ConfigNodePropertyArray resourceresolversearchpath)
{
	this->resourceresolversearchpath = resourceresolversearchpath;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermanglenamespaces()
{
	return resourceresolvermanglenamespaces;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermanglenamespaces(ConfigNodePropertyBoolean resourceresolvermanglenamespaces)
{
	this->resourceresolvermanglenamespaces = resourceresolvermanglenamespaces;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverallowDirect()
{
	return resourceresolverallowDirect;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverallowDirect(ConfigNodePropertyBoolean resourceresolverallowDirect)
{
	this->resourceresolverallowDirect = resourceresolverallowDirect;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverrequiredproviders()
{
	return resourceresolverrequiredproviders;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverrequiredproviders(ConfigNodePropertyArray resourceresolverrequiredproviders)
{
	this->resourceresolverrequiredproviders = resourceresolverrequiredproviders;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverrequiredprovidernames()
{
	return resourceresolverrequiredprovidernames;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverrequiredprovidernames(ConfigNodePropertyArray resourceresolverrequiredprovidernames)
{
	this->resourceresolverrequiredprovidernames = resourceresolverrequiredprovidernames;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervirtual()
{
	return resourceresolvervirtual;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervirtual(ConfigNodePropertyArray resourceresolvervirtual)
{
	this->resourceresolvervirtual = resourceresolvervirtual;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermapping()
{
	return resourceresolvermapping;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermapping(ConfigNodePropertyArray resourceresolvermapping)
{
	this->resourceresolvermapping = resourceresolvermapping;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermaplocation()
{
	return resourceresolvermaplocation;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermaplocation(ConfigNodePropertyString resourceresolvermaplocation)
{
	this->resourceresolvermaplocation = resourceresolvermaplocation;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermapobservation()
{
	return resourceresolvermapobservation;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermapobservation(ConfigNodePropertyArray resourceresolvermapobservation)
{
	this->resourceresolvermapobservation = resourceresolvermapobservation;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverdefaultvanityredirectstatus()
{
	return resourceresolverdefaultvanityredirectstatus;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverdefaultvanityredirectstatus(ConfigNodePropertyInteger resourceresolverdefaultvanityredirectstatus)
{
	this->resourceresolverdefaultvanityredirectstatus = resourceresolverdefaultvanityredirectstatus;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverenablevanitypath()
{
	return resourceresolverenablevanitypath;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverenablevanitypath(ConfigNodePropertyBoolean resourceresolverenablevanitypath)
{
	this->resourceresolverenablevanitypath = resourceresolverenablevanitypath;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathmaxEntries()
{
	return resourceresolvervanitypathmaxEntries;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathmaxEntries(ConfigNodePropertyInteger resourceresolvervanitypathmaxEntries)
{
	this->resourceresolvervanitypathmaxEntries = resourceresolvervanitypathmaxEntries;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathmaxEntriesstartup()
{
	return resourceresolvervanitypathmaxEntriesstartup;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathmaxEntriesstartup(ConfigNodePropertyBoolean resourceresolvervanitypathmaxEntriesstartup)
{
	this->resourceresolvervanitypathmaxEntriesstartup = resourceresolvervanitypathmaxEntriesstartup;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathbloomfiltermaxBytes()
{
	return resourceresolvervanitypathbloomfiltermaxBytes;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathbloomfiltermaxBytes(ConfigNodePropertyInteger resourceresolvervanitypathbloomfiltermaxBytes)
{
	this->resourceresolvervanitypathbloomfiltermaxBytes = resourceresolvervanitypathbloomfiltermaxBytes;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolveroptimizealiasresolution()
{
	return resourceresolveroptimizealiasresolution;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolveroptimizealiasresolution(ConfigNodePropertyBoolean resourceresolveroptimizealiasresolution)
{
	this->resourceresolveroptimizealiasresolution = resourceresolveroptimizealiasresolution;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathwhitelist()
{
	return resourceresolvervanitypathwhitelist;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathwhitelist(ConfigNodePropertyArray resourceresolvervanitypathwhitelist)
{
	this->resourceresolvervanitypathwhitelist = resourceresolvervanitypathwhitelist;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathblacklist()
{
	return resourceresolvervanitypathblacklist;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathblacklist(ConfigNodePropertyArray resourceresolvervanitypathblacklist)
{
	this->resourceresolvervanitypathblacklist = resourceresolvervanitypathblacklist;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanityprecedence()
{
	return resourceresolvervanityprecedence;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanityprecedence(ConfigNodePropertyBoolean resourceresolvervanityprecedence)
{
	this->resourceresolvervanityprecedence = resourceresolvervanityprecedence;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverproviderhandlingparanoid()
{
	return resourceresolverproviderhandlingparanoid;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverproviderhandlingparanoid(ConfigNodePropertyBoolean resourceresolverproviderhandlingparanoid)
{
	this->resourceresolverproviderhandlingparanoid = resourceresolverproviderhandlingparanoid;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverlogclosing()
{
	return resourceresolverlogclosing;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverlogclosing(ConfigNodePropertyBoolean resourceresolverlogclosing)
{
	this->resourceresolverlogclosing = resourceresolverlogclosing;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverlogunclosed()
{
	return resourceresolverlogunclosed;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverlogunclosed(ConfigNodePropertyBoolean resourceresolverlogunclosed)
{
	this->resourceresolverlogunclosed = resourceresolverlogunclosed;
}



