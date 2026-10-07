

#include "ComDayCqDamCoreImplServletCollectionsServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCollectionsServletProperties::ComDayCqDamCoreImplServletCollectionsServletProperties()
{
	cqdambatchcollectionsproperties = ConfigNodePropertyArray();
	cqdambatchcollectionslimit = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplServletCollectionsServletProperties::ComDayCqDamCoreImplServletCollectionsServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCollectionsServletProperties::~ComDayCqDamCoreImplServletCollectionsServletProperties()
{

}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdambatchcollectionspropertiesKey = "cq.dam.batch.collections.properties";

    if(object.has_key(cqdambatchcollectionspropertiesKey))
    {
        bourne::json value = object[cqdambatchcollectionspropertiesKey];




        ConfigNodePropertyArray* obj = &cqdambatchcollectionsproperties;
		obj->fromJson(value.dump());

    }

    const char *cqdambatchcollectionslimitKey = "cq.dam.batch.collections.limit";

    if(object.has_key(cqdambatchcollectionslimitKey))
    {
        bourne::json value = object[cqdambatchcollectionslimitKey];




        ConfigNodePropertyInteger* obj = &cqdambatchcollectionslimit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCollectionsServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdambatchcollectionsproperties"] = getCqdambatchcollectionsproperties().toJson();






	object["cqdambatchcollectionslimit"] = getCqdambatchcollectionslimit().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletCollectionsServletProperties::getCqdambatchcollectionsproperties()
{
	return cqdambatchcollectionsproperties;
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::setCqdambatchcollectionsproperties(ConfigNodePropertyArray cqdambatchcollectionsproperties)
{
	this->cqdambatchcollectionsproperties = cqdambatchcollectionsproperties;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletCollectionsServletProperties::getCqdambatchcollectionslimit()
{
	return cqdambatchcollectionslimit;
}

void
ComDayCqDamCoreImplServletCollectionsServletProperties::setCqdambatchcollectionslimit(ConfigNodePropertyInteger cqdambatchcollectionslimit)
{
	this->cqdambatchcollectionslimit = cqdambatchcollectionslimit;
}



