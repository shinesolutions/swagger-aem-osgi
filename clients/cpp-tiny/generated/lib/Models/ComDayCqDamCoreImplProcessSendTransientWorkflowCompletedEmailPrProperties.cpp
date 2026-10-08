

#include "ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.h"

using namespace Tiny;

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties()
{
	processlabel = ConfigNodePropertyString();
	notifyonComplete = ConfigNodePropertyBoolean();
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::~ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties()
{

}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *processlabelKey = "process.label";

    if(object.has_key(processlabelKey))
    {
        bourne::json value = object[processlabelKey];




        ConfigNodePropertyString* obj = &processlabel;
		obj->fromJson(value.dump());

    }

    const char *notifyonCompleteKey = "Notify on Complete";

    if(object.has_key(notifyonCompleteKey))
    {
        bourne::json value = object[notifyonCompleteKey];




        ConfigNodePropertyBoolean* obj = &notifyonComplete;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["processlabel"] = getProcesslabel().toJson();






	object["notifyonComplete"] = getNotifyonComplete().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::setProcesslabel(ConfigNodePropertyString processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::getNotifyonComplete()
{
	return notifyonComplete;
}

void
ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties::setNotifyonComplete(ConfigNodePropertyBoolean notifyonComplete)
{
	this->notifyonComplete = notifyonComplete;
}



