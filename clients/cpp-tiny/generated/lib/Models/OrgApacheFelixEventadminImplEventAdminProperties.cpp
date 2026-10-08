

#include "OrgApacheFelixEventadminImplEventAdminProperties.h"

using namespace Tiny;

OrgApacheFelixEventadminImplEventAdminProperties::OrgApacheFelixEventadminImplEventAdminProperties()
{
	orgapachefelixeventadminThreadPoolSize = ConfigNodePropertyInteger();
	orgapachefelixeventadminAsyncToSyncThreadRatio = ConfigNodePropertyFloat();
	orgapachefelixeventadminTimeout = ConfigNodePropertyInteger();
	orgapachefelixeventadminRequireTopic = ConfigNodePropertyBoolean();
	orgapachefelixeventadminIgnoreTimeout = ConfigNodePropertyArray();
	orgapachefelixeventadminIgnoreTopic = ConfigNodePropertyArray();
}

OrgApacheFelixEventadminImplEventAdminProperties::OrgApacheFelixEventadminImplEventAdminProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheFelixEventadminImplEventAdminProperties::~OrgApacheFelixEventadminImplEventAdminProperties()
{

}

void
OrgApacheFelixEventadminImplEventAdminProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *orgapachefelixeventadminThreadPoolSizeKey = "org.apache.felix.eventadmin.ThreadPoolSize";

    if(object.has_key(orgapachefelixeventadminThreadPoolSizeKey))
    {
        bourne::json value = object[orgapachefelixeventadminThreadPoolSizeKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixeventadminThreadPoolSize;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixeventadminAsyncToSyncThreadRatioKey = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio";

    if(object.has_key(orgapachefelixeventadminAsyncToSyncThreadRatioKey))
    {
        bourne::json value = object[orgapachefelixeventadminAsyncToSyncThreadRatioKey];




        ConfigNodePropertyFloat* obj = &orgapachefelixeventadminAsyncToSyncThreadRatio;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixeventadminTimeoutKey = "org.apache.felix.eventadmin.Timeout";

    if(object.has_key(orgapachefelixeventadminTimeoutKey))
    {
        bourne::json value = object[orgapachefelixeventadminTimeoutKey];




        ConfigNodePropertyInteger* obj = &orgapachefelixeventadminTimeout;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixeventadminRequireTopicKey = "org.apache.felix.eventadmin.RequireTopic";

    if(object.has_key(orgapachefelixeventadminRequireTopicKey))
    {
        bourne::json value = object[orgapachefelixeventadminRequireTopicKey];




        ConfigNodePropertyBoolean* obj = &orgapachefelixeventadminRequireTopic;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixeventadminIgnoreTimeoutKey = "org.apache.felix.eventadmin.IgnoreTimeout";

    if(object.has_key(orgapachefelixeventadminIgnoreTimeoutKey))
    {
        bourne::json value = object[orgapachefelixeventadminIgnoreTimeoutKey];




        ConfigNodePropertyArray* obj = &orgapachefelixeventadminIgnoreTimeout;
		obj->fromJson(value.dump());

    }

    const char *orgapachefelixeventadminIgnoreTopicKey = "org.apache.felix.eventadmin.IgnoreTopic";

    if(object.has_key(orgapachefelixeventadminIgnoreTopicKey))
    {
        bourne::json value = object[orgapachefelixeventadminIgnoreTopicKey];




        ConfigNodePropertyArray* obj = &orgapachefelixeventadminIgnoreTopic;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheFelixEventadminImplEventAdminProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["orgapachefelixeventadminThreadPoolSize"] = getOrgapachefelixeventadminThreadPoolSize().toJson();






	object["orgapachefelixeventadminAsyncToSyncThreadRatio"] = getOrgapachefelixeventadminAsyncToSyncThreadRatio().toJson();






	object["orgapachefelixeventadminTimeout"] = getOrgapachefelixeventadminTimeout().toJson();






	object["orgapachefelixeventadminRequireTopic"] = getOrgapachefelixeventadminRequireTopic().toJson();






	object["orgapachefelixeventadminIgnoreTimeout"] = getOrgapachefelixeventadminIgnoreTimeout().toJson();






	object["orgapachefelixeventadminIgnoreTopic"] = getOrgapachefelixeventadminIgnoreTopic().toJson();


    return object;

}

ConfigNodePropertyInteger
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminThreadPoolSize()
{
	return orgapachefelixeventadminThreadPoolSize;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminThreadPoolSize(ConfigNodePropertyInteger orgapachefelixeventadminThreadPoolSize)
{
	this->orgapachefelixeventadminThreadPoolSize = orgapachefelixeventadminThreadPoolSize;
}

ConfigNodePropertyFloat
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminAsyncToSyncThreadRatio()
{
	return orgapachefelixeventadminAsyncToSyncThreadRatio;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminAsyncToSyncThreadRatio(ConfigNodePropertyFloat orgapachefelixeventadminAsyncToSyncThreadRatio)
{
	this->orgapachefelixeventadminAsyncToSyncThreadRatio = orgapachefelixeventadminAsyncToSyncThreadRatio;
}

ConfigNodePropertyInteger
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminTimeout()
{
	return orgapachefelixeventadminTimeout;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminTimeout(ConfigNodePropertyInteger orgapachefelixeventadminTimeout)
{
	this->orgapachefelixeventadminTimeout = orgapachefelixeventadminTimeout;
}

ConfigNodePropertyBoolean
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminRequireTopic()
{
	return orgapachefelixeventadminRequireTopic;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminRequireTopic(ConfigNodePropertyBoolean orgapachefelixeventadminRequireTopic)
{
	this->orgapachefelixeventadminRequireTopic = orgapachefelixeventadminRequireTopic;
}

ConfigNodePropertyArray
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminIgnoreTimeout()
{
	return orgapachefelixeventadminIgnoreTimeout;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminIgnoreTimeout(ConfigNodePropertyArray orgapachefelixeventadminIgnoreTimeout)
{
	this->orgapachefelixeventadminIgnoreTimeout = orgapachefelixeventadminIgnoreTimeout;
}

ConfigNodePropertyArray
OrgApacheFelixEventadminImplEventAdminProperties::getOrgapachefelixeventadminIgnoreTopic()
{
	return orgapachefelixeventadminIgnoreTopic;
}

void
OrgApacheFelixEventadminImplEventAdminProperties::setOrgapachefelixeventadminIgnoreTopic(ConfigNodePropertyArray orgapachefelixeventadminIgnoreTopic)
{
	this->orgapachefelixeventadminIgnoreTopic = orgapachefelixeventadminIgnoreTopic;
}



