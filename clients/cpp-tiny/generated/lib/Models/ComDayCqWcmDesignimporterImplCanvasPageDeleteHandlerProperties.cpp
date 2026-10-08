

#include "ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.h"

using namespace Tiny;

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties()
{
	minThreadPoolSize = ConfigNodePropertyInteger();
	maxThreadPoolSize = ConfigNodePropertyInteger();
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::~ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties()
{

}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *minThreadPoolSizeKey = "minThreadPoolSize";

    if(object.has_key(minThreadPoolSizeKey))
    {
        bourne::json value = object[minThreadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &minThreadPoolSize;
		obj->fromJson(value.dump());

    }

    const char *maxThreadPoolSizeKey = "maxThreadPoolSize";

    if(object.has_key(maxThreadPoolSizeKey))
    {
        bourne::json value = object[maxThreadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &maxThreadPoolSize;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["minThreadPoolSize"] = getMinThreadPoolSize().toJson();






	object["maxThreadPoolSize"] = getMaxThreadPoolSize().toJson();


    return object;

}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::getMinThreadPoolSize()
{
	return minThreadPoolSize;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize)
{
	this->minThreadPoolSize = minThreadPoolSize;
}

ConfigNodePropertyInteger
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::getMaxThreadPoolSize()
{
	return maxThreadPoolSize;
}

void
ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties::setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize)
{
	this->maxThreadPoolSize = maxThreadPoolSize;
}



