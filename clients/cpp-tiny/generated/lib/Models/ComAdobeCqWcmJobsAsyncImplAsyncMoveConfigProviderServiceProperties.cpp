

#include "ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties()
{
	threshold = ConfigNodePropertyInteger();
	jobTopicName = ConfigNodePropertyString();
	emailEnabled = ConfigNodePropertyBoolean();
}

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::~ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *thresholdKey = "threshold";

    if(object.has_key(thresholdKey))
    {
        bourne::json value = object[thresholdKey];




        ConfigNodePropertyInteger* obj = &threshold;
		obj->fromJson(value.dump());

    }

    const char *jobTopicNameKey = "jobTopicName";

    if(object.has_key(jobTopicNameKey))
    {
        bourne::json value = object[jobTopicNameKey];




        ConfigNodePropertyString* obj = &jobTopicName;
		obj->fromJson(value.dump());

    }

    const char *emailEnabledKey = "emailEnabled";

    if(object.has_key(emailEnabledKey))
    {
        bourne::json value = object[emailEnabledKey];




        ConfigNodePropertyBoolean* obj = &emailEnabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["threshold"] = getThreshold().toJson();






	object["jobTopicName"] = getJobTopicName().toJson();






	object["emailEnabled"] = getEmailEnabled().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getThreshold()
{
	return threshold;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setThreshold(ConfigNodePropertyInteger threshold)
{
	this->threshold = threshold;
}

ConfigNodePropertyString
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getJobTopicName()
{
	return jobTopicName;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setJobTopicName(ConfigNodePropertyString jobTopicName)
{
	this->jobTopicName = jobTopicName;
}

ConfigNodePropertyBoolean
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties::setEmailEnabled(ConfigNodePropertyBoolean emailEnabled)
{
	this->emailEnabled = emailEnabled;
}



