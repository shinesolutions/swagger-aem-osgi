

#include "ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties.h"

using namespace Tiny;

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties()
{
	notifyonupdate = ConfigNodePropertyBoolean();
	notifyoncomplete = ConfigNodePropertyBoolean();
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::~ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties()
{

}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *notifyonupdateKey = "notify.onupdate";

    if(object.has_key(notifyonupdateKey))
    {
        bourne::json value = object[notifyonupdateKey];




        ConfigNodePropertyBoolean* obj = &notifyonupdate;
		obj->fromJson(value.dump());

    }

    const char *notifyoncompleteKey = "notify.oncomplete";

    if(object.has_key(notifyoncompleteKey))
    {
        bourne::json value = object[notifyoncompleteKey];




        ConfigNodePropertyBoolean* obj = &notifyoncomplete;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["notifyonupdate"] = getNotifyonupdate().toJson();






	object["notifyoncomplete"] = getNotifyoncomplete().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::getNotifyonupdate()
{
	return notifyonupdate;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::setNotifyonupdate(ConfigNodePropertyBoolean notifyonupdate)
{
	this->notifyonupdate = notifyonupdate;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::getNotifyoncomplete()
{
	return notifyoncomplete;
}

void
ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties::setNotifyoncomplete(ConfigNodePropertyBoolean notifyoncomplete)
{
	this->notifyoncomplete = notifyoncomplete;
}



