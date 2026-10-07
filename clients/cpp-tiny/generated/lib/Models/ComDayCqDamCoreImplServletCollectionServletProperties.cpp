

#include "ComDayCqDamCoreImplServletCollectionServletProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplServletCollectionServletProperties::ComDayCqDamCoreImplServletCollectionServletProperties()
{
	cqdambatchcollectionproperties = ConfigNodePropertyArray();
	cqdambatchcollectionmaxcollections = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplServletCollectionServletProperties::ComDayCqDamCoreImplServletCollectionServletProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplServletCollectionServletProperties::~ComDayCqDamCoreImplServletCollectionServletProperties()
{

}

void
ComDayCqDamCoreImplServletCollectionServletProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqdambatchcollectionpropertiesKey = "cq.dam.batch.collection.properties";

    if(object.has_key(cqdambatchcollectionpropertiesKey))
    {
        bourne::json value = object[cqdambatchcollectionpropertiesKey];




        ConfigNodePropertyArray* obj = &cqdambatchcollectionproperties;
		obj->fromJson(value.dump());

    }

    const char *cqdambatchcollectionmaxcollectionsKey = "cq.dam.batch.collection.maxcollections";

    if(object.has_key(cqdambatchcollectionmaxcollectionsKey))
    {
        bourne::json value = object[cqdambatchcollectionmaxcollectionsKey];




        ConfigNodePropertyInteger* obj = &cqdambatchcollectionmaxcollections;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplServletCollectionServletProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqdambatchcollectionproperties"] = getCqdambatchcollectionproperties().toJson();






	object["cqdambatchcollectionmaxcollections"] = getCqdambatchcollectionmaxcollections().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletCollectionServletProperties::getCqdambatchcollectionproperties()
{
	return cqdambatchcollectionproperties;
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::setCqdambatchcollectionproperties(ConfigNodePropertyArray cqdambatchcollectionproperties)
{
	this->cqdambatchcollectionproperties = cqdambatchcollectionproperties;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplServletCollectionServletProperties::getCqdambatchcollectionmaxcollections()
{
	return cqdambatchcollectionmaxcollections;
}

void
ComDayCqDamCoreImplServletCollectionServletProperties::setCqdambatchcollectionmaxcollections(ConfigNodePropertyInteger cqdambatchcollectionmaxcollections)
{
	this->cqdambatchcollectionmaxcollections = cqdambatchcollectionmaxcollections;
}



