

#include "ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties.h"

using namespace Tiny;

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties()
{
	importername = ConfigNodePropertyArray();
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::~ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties()
{

}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *importernameKey = "importer.name";

    if(object.has_key(importernameKey))
    {
        bourne::json value = object[importernameKey];




        ConfigNodePropertyArray* obj = &importername;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["importername"] = getImportername().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::getImportername()
{
	return importername;
}

void
ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties::setImportername(ConfigNodePropertyArray importername)
{
	this->importername = importername;
}



