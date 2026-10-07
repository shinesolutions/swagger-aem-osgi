

#include "ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.h"

using namespace Tiny;

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties()
{
	communitiesintegrationlivefyreslingeventfilter = ConfigNodePropertyString();
}

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::~ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties()
{

}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *communitiesintegrationlivefyreslingeventfilterKey = "communities.integration.livefyre.sling.event.filter";

    if(object.has_key(communitiesintegrationlivefyreslingeventfilterKey))
    {
        bourne::json value = object[communitiesintegrationlivefyreslingeventfilterKey];




        ConfigNodePropertyString* obj = &communitiesintegrationlivefyreslingeventfilter;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["communitiesintegrationlivefyreslingeventfilter"] = getCommunitiesintegrationlivefyreslingeventfilter().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::getCommunitiesintegrationlivefyreslingeventfilter()
{
	return communitiesintegrationlivefyreslingeventfilter;
}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::setCommunitiesintegrationlivefyreslingeventfilter(ConfigNodePropertyString communitiesintegrationlivefyreslingeventfilter)
{
	this->communitiesintegrationlivefyreslingeventfilter = communitiesintegrationlivefyreslingeventfilter;
}



