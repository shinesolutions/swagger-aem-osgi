

#include "OrgApacheSlingI18nImplI18NFilterProperties.h"

using namespace Tiny;

OrgApacheSlingI18nImplI18NFilterProperties::OrgApacheSlingI18nImplI18NFilterProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	slingfilterscope = ConfigNodePropertyArray();
}

OrgApacheSlingI18nImplI18NFilterProperties::OrgApacheSlingI18nImplI18NFilterProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingI18nImplI18NFilterProperties::~OrgApacheSlingI18nImplI18NFilterProperties()
{

}

void
OrgApacheSlingI18nImplI18NFilterProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *slingfilterscopeKey = "sling.filter.scope";

    if(object.has_key(slingfilterscopeKey))
    {
        bourne::json value = object[slingfilterscopeKey];




        ConfigNodePropertyArray* obj = &slingfilterscope;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingI18nImplI18NFilterProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["slingfilterscope"] = getSlingfilterscope().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingI18nImplI18NFilterProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingI18nImplI18NFilterProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyArray
OrgApacheSlingI18nImplI18NFilterProperties::getSlingfilterscope()
{
	return slingfilterscope;
}

void
OrgApacheSlingI18nImplI18NFilterProperties::setSlingfilterscope(ConfigNodePropertyArray slingfilterscope)
{
	this->slingfilterscope = slingfilterscope;
}



