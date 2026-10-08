

#include "ComDayCqDamCoreProcessMetadataProcessorProcessProperties.h"

using namespace Tiny;

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::ComDayCqDamCoreProcessMetadataProcessorProcessProperties()
{
	processlabel = ConfigNodePropertyString();
	cqdamenablesha1 = ConfigNodePropertyBoolean();
	cqdammetadataxssprotectedproperties = ConfigNodePropertyArray();
}

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::ComDayCqDamCoreProcessMetadataProcessorProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreProcessMetadataProcessorProcessProperties::~ComDayCqDamCoreProcessMetadataProcessorProcessProperties()
{

}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::fromJson(std::string jsonObj)
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

    const char *cqdammetadataxssprotectedpropertiesKey = "cq.dam.metadata.xssprotected.properties";

    if(object.has_key(cqdammetadataxssprotectedpropertiesKey))
    {
        bourne::json value = object[cqdammetadataxssprotectedpropertiesKey];




        ConfigNodePropertyArray* obj = &cqdammetadataxssprotectedproperties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();






	object["cqdamenablesha1"] = getCqdamenablesha1().toJson();






	object["cqdammetadataxssprotectedproperties"] = getCqdammetadataxssprotectedproperties().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getCqdamenablesha1()
{
	return cqdamenablesha1;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setCqdamenablesha1(ConfigNodePropertyBoolean cqdamenablesha1)
{
	this->cqdamenablesha1 = cqdamenablesha1;
}

ConfigNodePropertyArray
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::getCqdammetadataxssprotectedproperties()
{
	return cqdammetadataxssprotectedproperties;
}

void
ComDayCqDamCoreProcessMetadataProcessorProcessProperties::setCqdammetadataxssprotectedproperties(ConfigNodePropertyArray cqdammetadataxssprotectedproperties)
{
	this->cqdammetadataxssprotectedproperties = cqdammetadataxssprotectedproperties;
}



