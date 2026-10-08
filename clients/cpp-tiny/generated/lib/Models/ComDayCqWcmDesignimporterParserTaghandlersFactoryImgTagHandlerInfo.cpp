

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties properties)
{
	this->properties = properties;
}



