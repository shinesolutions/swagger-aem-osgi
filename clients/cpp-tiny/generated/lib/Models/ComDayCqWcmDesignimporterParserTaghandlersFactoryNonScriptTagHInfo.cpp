

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties properties)
{
	this->properties = properties;
}



