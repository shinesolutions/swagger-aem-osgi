

#include "OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.h"

using namespace Tiny;

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	typecollections = ConfigNodePropertyString();
	typenoncollections = ConfigNodePropertyString();
	typecontent = ConfigNodePropertyString();
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::~OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties()
{

}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *typecollectionsKey = "type.collections";

    if(object.has_key(typecollectionsKey))
    {
        bourne::json value = object[typecollectionsKey];




        ConfigNodePropertyString* obj = &typecollections;
		obj->fromJson(value.dump());

    }

    const char *typenoncollectionsKey = "type.noncollections";

    if(object.has_key(typenoncollectionsKey))
    {
        bourne::json value = object[typenoncollectionsKey];




        ConfigNodePropertyString* obj = &typenoncollections;
		obj->fromJson(value.dump());

    }

    const char *typecontentKey = "type.content";

    if(object.has_key(typecontentKey))
    {
        bourne::json value = object[typecontentKey];




        ConfigNodePropertyString* obj = &typecontent;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["typecollections"] = getTypecollections().toJson();






	object["typenoncollections"] = getTypenoncollections().toJson();






	object["typecontent"] = getTypecontent().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getServiceranking()
{
	return serviceranking;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypecollections()
{
	return typecollections;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypecollections(ConfigNodePropertyString typecollections)
{
	this->typecollections = typecollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypenoncollections()
{
	return typenoncollections;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypenoncollections(ConfigNodePropertyString typenoncollections)
{
	this->typenoncollections = typenoncollections;
}

ConfigNodePropertyString
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::getTypecontent()
{
	return typecontent;
}

void
OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties::setTypecontent(ConfigNodePropertyString typecontent)
{
	this->typecontent = typecontent;
}



