

#include "ComAdobeGraniteRepositoryServiceUserConfigurationProperties.h"

using namespace Tiny;

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::ComAdobeGraniteRepositoryServiceUserConfigurationProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	serviceuserssimpleSubjectPopulation = ConfigNodePropertyBoolean();
	serviceuserslist = ConfigNodePropertyArray();
}

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::ComAdobeGraniteRepositoryServiceUserConfigurationProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteRepositoryServiceUserConfigurationProperties::~ComAdobeGraniteRepositoryServiceUserConfigurationProperties()
{

}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *serviceuserssimpleSubjectPopulationKey = "serviceusers.simpleSubjectPopulation";

    if(object.has_key(serviceuserssimpleSubjectPopulationKey))
    {
        bourne::json value = object[serviceuserssimpleSubjectPopulationKey];




        ConfigNodePropertyBoolean* obj = &serviceuserssimpleSubjectPopulation;
		obj->fromJson(value.dump());

    }

    const char *serviceuserslistKey = "serviceusers.list";

    if(object.has_key(serviceuserslistKey))
    {
        bourne::json value = object[serviceuserslistKey];




        ConfigNodePropertyArray* obj = &serviceuserslist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["serviceuserssimpleSubjectPopulation"] = getServiceuserssimpleSubjectPopulation().toJson();






	object["serviceuserslist"] = getServiceuserslist().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyBoolean
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceuserssimpleSubjectPopulation()
{
	return serviceuserssimpleSubjectPopulation;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceuserssimpleSubjectPopulation(ConfigNodePropertyBoolean serviceuserssimpleSubjectPopulation)
{
	this->serviceuserssimpleSubjectPopulation = serviceuserssimpleSubjectPopulation;
}

ConfigNodePropertyArray
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::getServiceuserslist()
{
	return serviceuserslist;
}

void
ComAdobeGraniteRepositoryServiceUserConfigurationProperties::setServiceuserslist(ConfigNodePropertyArray serviceuserslist)
{
	this->serviceuserslist = serviceuserslist;
}



