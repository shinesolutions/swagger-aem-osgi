

#include "ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.h"

using namespace Tiny;

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{
	maileremailcharset = ConfigNodePropertyString();
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::~ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties()
{

}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maileremailcharsetKey = "mailer.email.charset";

    if(object.has_key(maileremailcharsetKey))
    {
        bourne::json value = object[maileremailcharsetKey];




        ConfigNodePropertyString* obj = &maileremailcharset;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maileremailcharset"] = getMaileremailcharset().toJson();


    return object;

}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::getMaileremailcharset()
{
	return maileremailcharset;
}

void
ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties::setMaileremailcharset(ConfigNodePropertyString maileremailcharset)
{
	this->maileremailcharset = maileremailcharset;
}



