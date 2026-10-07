

#include "ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties()
{
	serviceranking = ConfigNodePropertyInteger();
}

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::~ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties()
{

}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}



