

#include "ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties()
{
	nodetypes = ConfigNodePropertyArray();
	ignorableprops = ConfigNodePropertyArray();
	ignorablenodes = ConfigNodePropertyString();
	enabled = ConfigNodePropertyBoolean();
	distfolders = ConfigNodePropertyString();
}

ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::~ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties()
{

}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nodetypesKey = "nodetypes";

    if(object.has_key(nodetypesKey))
    {
        bourne::json value = object[nodetypesKey];




        ConfigNodePropertyArray* obj = &nodetypes;
		obj->fromJson(value.dump());

    }

    const char *ignorablepropsKey = "ignorableprops";

    if(object.has_key(ignorablepropsKey))
    {
        bourne::json value = object[ignorablepropsKey];




        ConfigNodePropertyArray* obj = &ignorableprops;
		obj->fromJson(value.dump());

    }

    const char *ignorablenodesKey = "ignorablenodes";

    if(object.has_key(ignorablenodesKey))
    {
        bourne::json value = object[ignorablenodesKey];




        ConfigNodePropertyString* obj = &ignorablenodes;
		obj->fromJson(value.dump());

    }

    const char *enabledKey = "enabled";

    if(object.has_key(enabledKey))
    {
        bourne::json value = object[enabledKey];




        ConfigNodePropertyBoolean* obj = &enabled;
		obj->fromJson(value.dump());

    }

    const char *distfoldersKey = "distfolders";

    if(object.has_key(distfoldersKey))
    {
        bourne::json value = object[distfoldersKey];




        ConfigNodePropertyString* obj = &distfolders;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["nodetypes"] = getNodetypes().toJson();






	object["ignorableprops"] = getIgnorableprops().toJson();






	object["ignorablenodes"] = getIgnorablenodes().toJson();






	object["enabled"] = getEnabled().toJson();






	object["distfolders"] = getDistfolders().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::getNodetypes()
{
	return nodetypes;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::setNodetypes(ConfigNodePropertyArray nodetypes)
{
	this->nodetypes = nodetypes;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::getIgnorableprops()
{
	return ignorableprops;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::setIgnorableprops(ConfigNodePropertyArray ignorableprops)
{
	this->ignorableprops = ignorableprops;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::getIgnorablenodes()
{
	return ignorablenodes;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::setIgnorablenodes(ConfigNodePropertyString ignorablenodes)
{
	this->ignorablenodes = ignorablenodes;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyString
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::getDistfolders()
{
	return distfolders;
}

void
ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties::setDistfolders(ConfigNodePropertyString distfolders)
{
	this->distfolders = distfolders;
}



