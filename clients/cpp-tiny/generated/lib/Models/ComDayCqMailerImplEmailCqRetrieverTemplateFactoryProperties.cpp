

#include "ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.h"

using namespace Tiny;

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties()
{
	maileremailembed = ConfigNodePropertyBoolean();
	maileremailcharset = ConfigNodePropertyString();
	maileremailretrieverUserID = ConfigNodePropertyString();
	maileremailretrieverUserPWD = ConfigNodePropertyString();
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::~ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties()
{

}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maileremailembedKey = "mailer.email.embed";

    if(object.has_key(maileremailembedKey))
    {
        bourne::json value = object[maileremailembedKey];




        ConfigNodePropertyBoolean* obj = &maileremailembed;
		obj->fromJson(value.dump());

    }

    const char *maileremailcharsetKey = "mailer.email.charset";

    if(object.has_key(maileremailcharsetKey))
    {
        bourne::json value = object[maileremailcharsetKey];




        ConfigNodePropertyString* obj = &maileremailcharset;
		obj->fromJson(value.dump());

    }

    const char *maileremailretrieverUserIDKey = "mailer.email.retrieverUserID";

    if(object.has_key(maileremailretrieverUserIDKey))
    {
        bourne::json value = object[maileremailretrieverUserIDKey];




        ConfigNodePropertyString* obj = &maileremailretrieverUserID;
		obj->fromJson(value.dump());

    }

    const char *maileremailretrieverUserPWDKey = "mailer.email.retrieverUserPWD";

    if(object.has_key(maileremailretrieverUserPWDKey))
    {
        bourne::json value = object[maileremailretrieverUserPWDKey];




        ConfigNodePropertyString* obj = &maileremailretrieverUserPWD;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maileremailembed"] = getMaileremailembed().toJson();






	object["maileremailcharset"] = getMaileremailcharset().toJson();






	object["maileremailretrieverUserID"] = getMaileremailretrieverUserID().toJson();






	object["maileremailretrieverUserPWD"] = getMaileremailretrieverUserPWD().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailembed()
{
	return maileremailembed;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailembed(ConfigNodePropertyBoolean maileremailembed)
{
	this->maileremailembed = maileremailembed;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailcharset()
{
	return maileremailcharset;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailcharset(ConfigNodePropertyString maileremailcharset)
{
	this->maileremailcharset = maileremailcharset;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailretrieverUserID()
{
	return maileremailretrieverUserID;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailretrieverUserID(ConfigNodePropertyString maileremailretrieverUserID)
{
	this->maileremailretrieverUserID = maileremailretrieverUserID;
}

ConfigNodePropertyString
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::getMaileremailretrieverUserPWD()
{
	return maileremailretrieverUserPWD;
}

void
ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties::setMaileremailretrieverUserPWD(ConfigNodePropertyString maileremailretrieverUserPWD)
{
	this->maileremailretrieverUserPWD = maileremailretrieverUserPWD;
}



