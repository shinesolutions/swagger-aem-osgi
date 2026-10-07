

#include "ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.h"

using namespace Tiny;

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::ComDayCqWcmFoundationImplPageImpressionsTrackerProperties()
{
	slingauthrequirements = ConfigNodePropertyString();
}

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::~ComDayCqWcmFoundationImplPageImpressionsTrackerProperties()
{

}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *slingauthrequirementsKey = "sling.auth.requirements";

    if(object.has_key(slingauthrequirementsKey))
    {
        bourne::json value = object[slingauthrequirementsKey];




        ConfigNodePropertyString* obj = &slingauthrequirements;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["slingauthrequirements"] = getSlingauthrequirements().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::setSlingauthrequirements(ConfigNodePropertyString slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}



