

#include "ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.h"

using namespace Tiny;

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties()
{
	fromaddress = ConfigNodePropertyString();
	senderhost = ConfigNodePropertyString();
	maxbouncecount = ConfigNodePropertyString();
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::~ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties()
{

}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *fromaddressKey = "from.address";

    if(object.has_key(fromaddressKey))
    {
        bourne::json value = object[fromaddressKey];




        ConfigNodePropertyString* obj = &fromaddress;
		obj->fromJson(value.dump());

    }

    const char *senderhostKey = "sender.host";

    if(object.has_key(senderhostKey))
    {
        bourne::json value = object[senderhostKey];




        ConfigNodePropertyString* obj = &senderhost;
		obj->fromJson(value.dump());

    }

    const char *maxbouncecountKey = "max.bounce.count";

    if(object.has_key(maxbouncecountKey))
    {
        bourne::json value = object[maxbouncecountKey];




        ConfigNodePropertyString* obj = &maxbouncecount;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["fromaddress"] = getFromaddress().toJson();






	object["senderhost"] = getSenderhost().toJson();






	object["maxbouncecount"] = getMaxbouncecount().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getFromaddress()
{
	return fromaddress;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setFromaddress(ConfigNodePropertyString fromaddress)
{
	this->fromaddress = fromaddress;
}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getSenderhost()
{
	return senderhost;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setSenderhost(ConfigNodePropertyString senderhost)
{
	this->senderhost = senderhost;
}

ConfigNodePropertyString
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::getMaxbouncecount()
{
	return maxbouncecount;
}

void
ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties::setMaxbouncecount(ConfigNodePropertyString maxbouncecount)
{
	this->maxbouncecount = maxbouncecount;
}



