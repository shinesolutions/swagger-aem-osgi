

#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo.h"

using namespace Tiny;

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties();
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::~ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo()
{

}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo::setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties properties)
{
	this->properties = properties;
}



