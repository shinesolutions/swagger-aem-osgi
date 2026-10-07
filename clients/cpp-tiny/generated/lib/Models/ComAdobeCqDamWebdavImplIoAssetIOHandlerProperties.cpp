

#include "ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties.h"

using namespace Tiny;

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties()
{
	serviceranking = ConfigNodePropertyInteger();
	pathPrefix = ConfigNodePropertyString();
	createVersion = ConfigNodePropertyBoolean();
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::~ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties()
{

}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *servicerankingKey = "service.ranking";

    if(object.has_key(servicerankingKey))
    {
        bourne::json value = object[servicerankingKey];




        ConfigNodePropertyInteger* obj = &serviceranking;
		obj->fromJson(value.dump());

    }

    const char *pathPrefixKey = "pathPrefix";

    if(object.has_key(pathPrefixKey))
    {
        bourne::json value = object[pathPrefixKey];




        ConfigNodePropertyString* obj = &pathPrefix;
		obj->fromJson(value.dump());

    }

    const char *createVersionKey = "createVersion";

    if(object.has_key(createVersionKey))
    {
        bourne::json value = object[createVersionKey];




        ConfigNodePropertyBoolean* obj = &createVersion;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["serviceranking"] = getServiceranking().toJson();






	object["pathPrefix"] = getPathPrefix().toJson();






	object["createVersion"] = getCreateVersion().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setServiceranking(ConfigNodePropertyInteger serviceranking)
{
	this->serviceranking = serviceranking;
}

ConfigNodePropertyString
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getPathPrefix()
{
	return pathPrefix;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setPathPrefix(ConfigNodePropertyString pathPrefix)
{
	this->pathPrefix = pathPrefix;
}

ConfigNodePropertyBoolean
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::getCreateVersion()
{
	return createVersion;
}

void
ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties::setCreateVersion(ConfigNodePropertyBoolean createVersion)
{
	this->createVersion = createVersion;
}



