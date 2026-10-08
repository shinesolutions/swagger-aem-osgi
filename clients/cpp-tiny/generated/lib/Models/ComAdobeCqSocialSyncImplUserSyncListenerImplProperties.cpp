

#include "ComAdobeCqSocialSyncImplUserSyncListenerImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::ComAdobeCqSocialSyncImplUserSyncListenerImplProperties()
{
	nodetypes = ConfigNodePropertyArray();
	ignorableprops = ConfigNodePropertyArray();
	ignorablenodes = ConfigNodePropertyArray();
	enabled = ConfigNodePropertyBoolean();
	distfolders = ConfigNodePropertyArray();
}

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::~ComAdobeCqSocialSyncImplUserSyncListenerImplProperties()
{

}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::fromJson(std::string jsonObj)
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




        ConfigNodePropertyArray* obj = &ignorablenodes;
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




        ConfigNodePropertyArray* obj = &distfolders;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::toJson()
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
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getNodetypes()
{
	return nodetypes;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setNodetypes(ConfigNodePropertyArray nodetypes)
{
	this->nodetypes = nodetypes;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getIgnorableprops()
{
	return ignorableprops;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setIgnorableprops(ConfigNodePropertyArray ignorableprops)
{
	this->ignorableprops = ignorableprops;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getIgnorablenodes()
{
	return ignorablenodes;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setIgnorablenodes(ConfigNodePropertyArray ignorablenodes)
{
	this->ignorablenodes = ignorablenodes;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getEnabled()
{
	return enabled;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setEnabled(ConfigNodePropertyBoolean enabled)
{
	this->enabled = enabled;
}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::getDistfolders()
{
	return distfolders;
}

void
ComAdobeCqSocialSyncImplUserSyncListenerImplProperties::setDistfolders(ConfigNodePropertyArray distfolders)
{
	this->distfolders = distfolders;
}



