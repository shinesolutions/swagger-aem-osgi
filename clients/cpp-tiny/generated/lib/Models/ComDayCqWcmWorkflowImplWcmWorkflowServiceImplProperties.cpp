

#include "ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties.h"

using namespace Tiny;

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{
	eventfilter = ConfigNodePropertyString();
	minThreadPoolSize = ConfigNodePropertyInteger();
	maxThreadPoolSize = ConfigNodePropertyInteger();
	cqwcmworkflowterminateonactivate = ConfigNodePropertyBoolean();
	cqwcmworklfowterminateexclusionlist = ConfigNodePropertyArray();
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::~ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties()
{

}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *eventfilterKey = "event.filter";

    if(object.has_key(eventfilterKey))
    {
        bourne::json value = object[eventfilterKey];




        ConfigNodePropertyString* obj = &eventfilter;
		obj->fromJson(value.dump());

    }

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

    const char *cqwcmworkflowterminateonactivateKey = "cq.wcm.workflow.terminate.on.activate";

    if(object.has_key(cqwcmworkflowterminateonactivateKey))
    {
        bourne::json value = object[cqwcmworkflowterminateonactivateKey];




        ConfigNodePropertyBoolean* obj = &cqwcmworkflowterminateonactivate;
		obj->fromJson(value.dump());

    }

    const char *cqwcmworklfowterminateexclusionlistKey = "cq.wcm.worklfow.terminate.exclusion.list";

    if(object.has_key(cqwcmworklfowterminateexclusionlistKey))
    {
        bourne::json value = object[cqwcmworklfowterminateexclusionlistKey];




        ConfigNodePropertyArray* obj = &cqwcmworklfowterminateexclusionlist;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["eventfilter"] = getEventfilter().toJson();






	object["minThreadPoolSize"] = getMinThreadPoolSize().toJson();






	object["maxThreadPoolSize"] = getMaxThreadPoolSize().toJson();






	object["cqwcmworkflowterminateonactivate"] = getCqwcmworkflowterminateonactivate().toJson();






	object["cqwcmworklfowterminateexclusionlist"] = getCqwcmworklfowterminateexclusionlist().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getEventfilter()
{
	return eventfilter;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setEventfilter(ConfigNodePropertyString eventfilter)
{
	this->eventfilter = eventfilter;
}

ConfigNodePropertyInteger
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMinThreadPoolSize()
{
	return minThreadPoolSize;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMinThreadPoolSize(ConfigNodePropertyInteger minThreadPoolSize)
{
	this->minThreadPoolSize = minThreadPoolSize;
}

ConfigNodePropertyInteger
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getMaxThreadPoolSize()
{
	return maxThreadPoolSize;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setMaxThreadPoolSize(ConfigNodePropertyInteger maxThreadPoolSize)
{
	this->maxThreadPoolSize = maxThreadPoolSize;
}

ConfigNodePropertyBoolean
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqwcmworkflowterminateonactivate()
{
	return cqwcmworkflowterminateonactivate;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqwcmworkflowterminateonactivate(ConfigNodePropertyBoolean cqwcmworkflowterminateonactivate)
{
	this->cqwcmworkflowterminateonactivate = cqwcmworkflowterminateonactivate;
}

ConfigNodePropertyArray
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::getCqwcmworklfowterminateexclusionlist()
{
	return cqwcmworklfowterminateexclusionlist;
}

void
ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties::setCqwcmworklfowterminateexclusionlist(ConfigNodePropertyArray cqwcmworklfowterminateexclusionlist)
{
	this->cqwcmworklfowterminateexclusionlist = cqwcmworklfowterminateexclusionlist;
}



