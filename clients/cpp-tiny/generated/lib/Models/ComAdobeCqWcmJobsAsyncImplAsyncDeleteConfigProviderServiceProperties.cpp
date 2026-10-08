

#include "ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties.h"

using namespace Tiny;

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties()
{
	threshold = ConfigNodePropertyInteger();
	jobTopicName = ConfigNodePropertyString();
	emailEnabled = ConfigNodePropertyBoolean();
}

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::~ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties()
{

}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::fromJson(std::string jsonObj)
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
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["threshold"] = getThreshold().toJson();






	object["jobTopicName"] = getJobTopicName().toJson();






	object["emailEnabled"] = getEmailEnabled().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::getThreshold()
{
	return threshold;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::setThreshold(ConfigNodePropertyInteger threshold)
{
	this->threshold = threshold;
}

ConfigNodePropertyString
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::getJobTopicName()
{
	return jobTopicName;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::setJobTopicName(ConfigNodePropertyString jobTopicName)
{
	this->jobTopicName = jobTopicName;
}

ConfigNodePropertyBoolean
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::getEmailEnabled()
{
	return emailEnabled;
}

void
ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties::setEmailEnabled(ConfigNodePropertyBoolean emailEnabled)
{
	this->emailEnabled = emailEnabled;
}



