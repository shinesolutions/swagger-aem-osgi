

#include "ComAdobeCqCommercePimImplPageEventListenerProperties.h"

using namespace Tiny;

ComAdobeCqCommercePimImplPageEventListenerProperties::ComAdobeCqCommercePimImplPageEventListenerProperties()
{
	cqcommercepageeventlistenerenabled = ConfigNodePropertyBoolean();
}

ComAdobeCqCommercePimImplPageEventListenerProperties::ComAdobeCqCommercePimImplPageEventListenerProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqCommercePimImplPageEventListenerProperties::~ComAdobeCqCommercePimImplPageEventListenerProperties()
{

}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *cqcommercepageeventlistenerenabledKey = "cq.commerce.pageeventlistener.enabled";

    if(object.has_key(cqcommercepageeventlistenerenabledKey))
    {
        bourne::json value = object[cqcommercepageeventlistenerenabledKey];




        ConfigNodePropertyBoolean* obj = &cqcommercepageeventlistenerenabled;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqCommercePimImplPageEventListenerProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["cqcommercepageeventlistenerenabled"] = getCqcommercepageeventlistenerenabled().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqCommercePimImplPageEventListenerProperties::getCqcommercepageeventlistenerenabled()
{
	return cqcommercepageeventlistenerenabled;
}

void
ComAdobeCqCommercePimImplPageEventListenerProperties::setCqcommercepageeventlistenerenabled(ConfigNodePropertyBoolean cqcommercepageeventlistenerenabled)
{
	this->cqcommercepageeventlistenerenabled = cqcommercepageeventlistenerenabled;
}



