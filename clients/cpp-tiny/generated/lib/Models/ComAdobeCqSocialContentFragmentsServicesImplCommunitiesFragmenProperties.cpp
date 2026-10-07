

#include "ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.h"

using namespace Tiny;

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties()
{
	cqsocialcontentfragmentsservicesenabled = ConfigNodePropertyBoolean();
	cqsocialcontentfragmentsserviceswaitTimeSeconds = ConfigNodePropertyInteger();
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::~ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties()
{

}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqsocialcontentfragmentsservicesenabledKey = "cq.social.content.fragments.services.enabled";

    if(object.has_key(cqsocialcontentfragmentsservicesenabledKey))
    {
        bourne::json value = object[cqsocialcontentfragmentsservicesenabledKey];




        ConfigNodePropertyBoolean* obj = &cqsocialcontentfragmentsservicesenabled;
		obj->fromJson(value.dump());

    }

    const char *cqsocialcontentfragmentsserviceswaitTimeSecondsKey = "cq.social.content.fragments.services.waitTimeSeconds";

    if(object.has_key(cqsocialcontentfragmentsserviceswaitTimeSecondsKey))
    {
        bourne::json value = object[cqsocialcontentfragmentsserviceswaitTimeSecondsKey];




        ConfigNodePropertyInteger* obj = &cqsocialcontentfragmentsserviceswaitTimeSeconds;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqsocialcontentfragmentsservicesenabled"] = getCqsocialcontentfragmentsservicesenabled().toJson();






	object["cqsocialcontentfragmentsserviceswaitTimeSeconds"] = getCqsocialcontentfragmentsserviceswaitTimeSeconds().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::getCqsocialcontentfragmentsservicesenabled()
{
	return cqsocialcontentfragmentsservicesenabled;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::setCqsocialcontentfragmentsservicesenabled(ConfigNodePropertyBoolean cqsocialcontentfragmentsservicesenabled)
{
	this->cqsocialcontentfragmentsservicesenabled = cqsocialcontentfragmentsservicesenabled;
}

ConfigNodePropertyInteger
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::getCqsocialcontentfragmentsserviceswaitTimeSeconds()
{
	return cqsocialcontentfragmentsserviceswaitTimeSeconds;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::setCqsocialcontentfragmentsserviceswaitTimeSeconds(ConfigNodePropertyInteger cqsocialcontentfragmentsserviceswaitTimeSeconds)
{
	this->cqsocialcontentfragmentsserviceswaitTimeSeconds = cqsocialcontentfragmentsserviceswaitTimeSeconds;
}



