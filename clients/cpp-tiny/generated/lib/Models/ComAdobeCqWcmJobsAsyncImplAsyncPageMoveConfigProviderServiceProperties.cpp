

#include "ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties()
{
	threshold = ConfigNodePropertyInteger();
	jobTopicName = ConfigNodePropertyString();
	emailEnabled = ConfigNodePropertyBoolean();
}

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::~ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::fromJson(std::string jsonObj)
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
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["threshold"] = getThreshold().toJson();






	object["jobTopicName"] = getJobTopicName().toJson();






	object["emailEnabled"] = getEmailEnabled().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::getThreshold()
{
	return threshold;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::setThreshold(ConfigNodePropertyInteger threshold)
{
	this->threshold = threshold;
}

ConfigNodePropertyString
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::getJobTopicName()
{
	return jobTopicName;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::setJobTopicName(ConfigNodePropertyString jobTopicName)
{
	this->jobTopicName = jobTopicName;
}

ConfigNodePropertyBoolean
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties::setEmailEnabled(ConfigNodePropertyBoolean emailEnabled)
{
	this->emailEnabled = emailEnabled;
}



