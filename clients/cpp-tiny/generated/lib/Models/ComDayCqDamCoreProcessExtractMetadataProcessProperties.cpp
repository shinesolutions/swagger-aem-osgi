

#include "ComDayCqDamCoreProcessExtractMetadataProcessProperties.h"

using namespace Tiny;

ComDayCqDamCoreProcessExtractMetadataProcessProperties::ComDayCqDamCoreProcessExtractMetadataProcessProperties()
{
	processlabel = ConfigNodePropertyString();
	cqdamenablesha1 = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreProcessExtractMetadataProcessProperties::ComDayCqDamCoreProcessExtractMetadataProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreProcessExtractMetadataProcessProperties::~ComDayCqDamCoreProcessExtractMetadataProcessProperties()
{

}

void
ComDayCqDamCoreProcessExtractMetadataProcessProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }

    const char *cqdamenablesha1Key = "cq.dam.enable.sha1";

    if(object.has_key(cqdamenablesha1Key))
    {
        bourne::json value = object[cqdamenablesha1Key];




        ConfigNodePropertyBoolean* obj = &cqdamenablesha1;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreProcessExtractMetadataProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();






	object["cqdamenablesha1"] = getCqdamenablesha1().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreProcessExtractMetadataProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreProcessExtractMetadataProcessProperties::getCqdamenablesha1()
{
	return cqdamenablesha1;
}

void
ComDayCqDamCoreProcessExtractMetadataProcessProperties::setCqdamenablesha1(ConfigNodePropertyBoolean cqdamenablesha1)
{
	this->cqdamenablesha1 = cqdamenablesha1;
}



