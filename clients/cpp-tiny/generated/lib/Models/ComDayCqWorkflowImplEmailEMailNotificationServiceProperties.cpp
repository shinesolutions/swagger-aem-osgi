

#include "ComDayCqWorkflowImplEmailEMailNotificationServiceProperties.h"

using namespace Tiny;

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{
	fromaddress = ConfigNodePropertyString();
	hostprefix = ConfigNodePropertyString();
	notifyonabort = ConfigNodePropertyBoolean();
	notifyoncomplete = ConfigNodePropertyBoolean();
	notifyoncontainercomplete = ConfigNodePropertyBoolean();
	notifyuseronly = ConfigNodePropertyBoolean();
}

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::ComDayCqWorkflowImplEmailEMailNotificationServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::~ComDayCqWorkflowImplEmailEMailNotificationServiceProperties()
{

}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fromaddressKey = "from.address";

    if(object.has_key(fromaddressKey))
    {
        bourne::json value = object[fromaddressKey];




        ConfigNodePropertyString* obj = &fromaddress;
		obj->fromJson(value.dump());

    }

    const char *hostprefixKey = "host.prefix";

    if(object.has_key(hostprefixKey))
    {
        bourne::json value = object[hostprefixKey];




        ConfigNodePropertyString* obj = &hostprefix;
		obj->fromJson(value.dump());

    }

    const char *notifyonabortKey = "notify.onabort";

    if(object.has_key(notifyonabortKey))
    {
        bourne::json value = object[notifyonabortKey];




        ConfigNodePropertyBoolean* obj = &notifyonabort;
		obj->fromJson(value.dump());

    }

    const char *notifyoncompleteKey = "notify.oncomplete";

    if(object.has_key(notifyoncompleteKey))
    {
        bourne::json value = object[notifyoncompleteKey];




        ConfigNodePropertyBoolean* obj = &notifyoncomplete;
		obj->fromJson(value.dump());

    }

    const char *notifyoncontainercompleteKey = "notify.oncontainercomplete";

    if(object.has_key(notifyoncontainercompleteKey))
    {
        bourne::json value = object[notifyoncontainercompleteKey];




        ConfigNodePropertyBoolean* obj = &notifyoncontainercomplete;
		obj->fromJson(value.dump());

    }

    const char *notifyuseronlyKey = "notify.useronly";

    if(object.has_key(notifyuseronlyKey))
    {
        bourne::json value = object[notifyuseronlyKey];




        ConfigNodePropertyBoolean* obj = &notifyuseronly;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fromaddress"] = getFromaddress().toJson();






	object["hostprefix"] = getHostprefix().toJson();






	object["notifyonabort"] = getNotifyonabort().toJson();






	object["notifyoncomplete"] = getNotifyoncomplete().toJson();






	object["notifyoncontainercomplete"] = getNotifyoncontainercomplete().toJson();






	object["notifyuseronly"] = getNotifyuseronly().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setFromaddress(ConfigNodePropertyString fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyString
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getHostprefix()
{
	return hostprefix;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setHostprefix(ConfigNodePropertyString hostprefix)
{
	this->hostprefix = hostprefix;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyonabort()
{
	return notifyonabort;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyonabort(ConfigNodePropertyBoolean notifyonabort)
{
	this->notifyonabort = notifyonabort;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyoncomplete()
{
	return notifyoncomplete;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyoncomplete(ConfigNodePropertyBoolean notifyoncomplete)
{
	this->notifyoncomplete = notifyoncomplete;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyoncontainercomplete()
{
	return notifyoncontainercomplete;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyoncontainercomplete(ConfigNodePropertyBoolean notifyoncontainercomplete)
{
	this->notifyoncontainercomplete = notifyoncontainercomplete;
}

ConfigNodePropertyBoolean
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::getNotifyuseronly()
{
	return notifyuseronly;
}

void
ComDayCqWorkflowImplEmailEMailNotificationServiceProperties::setNotifyuseronly(ConfigNodePropertyBoolean notifyuseronly)
{
	this->notifyuseronly = notifyuseronly;
}



