

#include "ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties()
{
	isPrimaryPublisher = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::~ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties()
{

}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *isPrimaryPublisherKey = "isPrimaryPublisher";

    if(object.has_key(isPrimaryPublisherKey))
    {
        bourne::json value = object[isPrimaryPublisherKey];




        ConfigNodePropertyBoolean* obj = &isPrimaryPublisher;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["isPrimaryPublisher"] = getIsPrimaryPublisher().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::getIsPrimaryPublisher()
{
	return isPrimaryPublisher;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::setIsPrimaryPublisher(ConfigNodePropertyBoolean isPrimaryPublisher)
{
	this->isPrimaryPublisher = isPrimaryPublisher;
}



