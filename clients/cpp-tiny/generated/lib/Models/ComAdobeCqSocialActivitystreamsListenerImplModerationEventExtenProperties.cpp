

#include "ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.h"

using namespace Tiny;

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties()
{
	accepted = ConfigNodePropertyBoolean();
	ranked = ConfigNodePropertyInteger();
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::~ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties()
{

}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *acceptedKey = "accepted";

    if(object.has_key(acceptedKey))
    {
        bourne::json value = object[acceptedKey];




        ConfigNodePropertyBoolean* obj = &accepted;
		obj->fromJson(value.dump());

    }

    const char *rankedKey = "ranked";

    if(object.has_key(rankedKey))
    {
        bourne::json value = object[rankedKey];




        ConfigNodePropertyInteger* obj = &ranked;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["accepted"] = getAccepted().toJson();






	object["ranked"] = getRanked().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::getAccepted()
{
	return accepted;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::setAccepted(ConfigNodePropertyBoolean accepted)
{
	this->accepted = accepted;
}

ConfigNodePropertyInteger
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::getRanked()
{
	return ranked;
}

void
ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties::setRanked(ConfigNodePropertyInteger ranked)
{
	this->ranked = ranked;
}



