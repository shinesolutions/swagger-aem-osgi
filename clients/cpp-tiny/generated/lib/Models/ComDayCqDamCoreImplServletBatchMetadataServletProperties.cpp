

#include "ComDayCqDamCoreImplServletBatchMetadataServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletBatchMetadataServletProperties::ComDayCqDamCoreImplServletBatchMetadataServletProperties()
{
	cqdambatchmetadataassetdefault = ConfigNodePropertyArray();
	cqdambatchmetadatacollectiondefault = ConfigNodePropertyArray();
	cqdambatchmetadatamaxresources = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplServletBatchMetadataServletProperties::ComDayCqDamCoreImplServletBatchMetadataServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletBatchMetadataServletProperties::~ComDayCqDamCoreImplServletBatchMetadataServletProperties()
{

}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdambatchmetadataassetdefaultKey = "cq.dam.batch.metadata.asset.default";

    if(object.has_key(cqdambatchmetadataassetdefaultKey))
    {
        bourne::json value = object[cqdambatchmetadataassetdefaultKey];




        ConfigNodePropertyArray* obj = &cqdambatchmetadataassetdefault;
		obj->fromJson(value.dump());

    }

    const char *cqdambatchmetadatacollectiondefaultKey = "cq.dam.batch.metadata.collection.default";

    if(object.has_key(cqdambatchmetadatacollectiondefaultKey))
    {
        bourne::json value = object[cqdambatchmetadatacollectiondefaultKey];




        ConfigNodePropertyArray* obj = &cqdambatchmetadatacollectiondefault;
		obj->fromJson(value.dump());

    }

    const char *cqdambatchmetadatamaxresourcesKey = "cq.dam.batch.metadata.maxresources";

    if(object.has_key(cqdambatchmetadatamaxresourcesKey))
    {
        bourne::json value = object[cqdambatchmetadatamaxresourcesKey];




        ConfigNodePropertyInteger* obj = &cqdambatchmetadatamaxresources;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletBatchMetadataServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdambatchmetadataassetdefault"] = getCqdambatchmetadataassetdefault().toJson();






	object["cqdambatchmetadatacollectiondefault"] = getCqdambatchmetadatacollectiondefault().toJson();






	object["cqdambatchmetadatamaxresources"] = getCqdambatchmetadatamaxresources().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadataassetdefault()
{
	return cqdambatchmetadataassetdefault;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadataassetdefault(ConfigNodePropertyArray cqdambatchmetadataassetdefault)
{
	this->cqdambatchmetadataassetdefault = cqdambatchmetadataassetdefault;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadatacollectiondefault()
{
	return cqdambatchmetadatacollectiondefault;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadatacollectiondefault(ConfigNodePropertyArray cqdambatchmetadatacollectiondefault)
{
	this->cqdambatchmetadatacollectiondefault = cqdambatchmetadatacollectiondefault;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletBatchMetadataServletProperties::getCqdambatchmetadatamaxresources()
{
	return cqdambatchmetadatamaxresources;
}

void
ComDayCqDamCoreImplServletBatchMetadataServletProperties::setCqdambatchmetadatamaxresources(ConfigNodePropertyInteger cqdambatchmetadatamaxresources)
{
	this->cqdambatchmetadatamaxresources = cqdambatchmetadatamaxresources;
}



