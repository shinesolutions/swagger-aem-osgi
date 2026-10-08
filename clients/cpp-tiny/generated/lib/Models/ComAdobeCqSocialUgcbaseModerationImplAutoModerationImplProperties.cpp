

#include "ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties()
{
	automoderationsequence = ConfigNodePropertyArray();
	automoderationonfailurestop = ConfigNodePropertyBoolean();
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::~ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties()
{

}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *automoderationsequenceKey = "automoderation.sequence";

    if(object.has_key(automoderationsequenceKey))
    {
        bourne::json value = object[automoderationsequenceKey];




        ConfigNodePropertyArray* obj = &automoderationsequence;
		obj->fromJson(value.dump());

    }

    const char *automoderationonfailurestopKey = "automoderation.onfailurestop";

    if(object.has_key(automoderationonfailurestopKey))
    {
        bourne::json value = object[automoderationonfailurestopKey];




        ConfigNodePropertyBoolean* obj = &automoderationonfailurestop;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["automoderationsequence"] = getAutomoderationsequence().toJson();






	object["automoderationonfailurestop"] = getAutomoderationonfailurestop().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::getAutomoderationsequence()
{
	return automoderationsequence;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::setAutomoderationsequence(ConfigNodePropertyArray automoderationsequence)
{
	this->automoderationsequence = automoderationsequence;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::getAutomoderationonfailurestop()
{
	return automoderationonfailurestop;
}

void
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties::setAutomoderationonfailurestop(ConfigNodePropertyBoolean automoderationonfailurestop)
{
	this->automoderationonfailurestop = automoderationonfailurestop;
}



