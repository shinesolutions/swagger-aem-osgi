

#include "ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{
	activeRunModes = ConfigNodePropertyArray();
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::~ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties()
{

}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *activeRunModesKey = "activeRunModes";

    if(object.has_key(activeRunModesKey))
    {
        bourne::json value = object[activeRunModesKey];




        ConfigNodePropertyArray* obj = &activeRunModes;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["activeRunModes"] = getActiveRunModes().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::getActiveRunModes()
{
	return activeRunModes;
}

void
ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties::setActiveRunModes(ConfigNodePropertyArray activeRunModes)
{
	this->activeRunModes = activeRunModes;
}



