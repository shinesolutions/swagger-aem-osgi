

#include "ComDayCqDamCoreImplProcessTextExtractionProcessProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::ComDayCqDamCoreImplProcessTextExtractionProcessProperties()
{
	mimeTypes = ConfigNodePropertyArray();
	maxExtract = ConfigNodePropertyInteger();
}

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::ComDayCqDamCoreImplProcessTextExtractionProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplProcessTextExtractionProcessProperties::~ComDayCqDamCoreImplProcessTextExtractionProcessProperties()
{

}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *mimeTypesKey = "mimeTypes";

    if(object.has_key(mimeTypesKey))
    {
        bourne::json value = object[mimeTypesKey];




        ConfigNodePropertyArray* obj = &mimeTypes;
		obj->fromJson(value.dump());

    }

    const char *maxExtractKey = "maxExtract";

    if(object.has_key(maxExtractKey))
    {
        bourne::json value = object[maxExtractKey];




        ConfigNodePropertyInteger* obj = &maxExtract;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["mimeTypes"] = getMimeTypes().toJson();






	object["maxExtract"] = getMaxExtract().toJson();


    return object;

}

ConfigNodePropertyArray
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMimeTypes()
{
	return mimeTypes;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMimeTypes(ConfigNodePropertyArray mimeTypes)
{
	this->mimeTypes = mimeTypes;
}

ConfigNodePropertyInteger
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::getMaxExtract()
{
	return maxExtract;
}

void
ComDayCqDamCoreImplProcessTextExtractionProcessProperties::setMaxExtract(ConfigNodePropertyInteger maxExtract)
{
	this->maxExtract = maxExtract;
}



