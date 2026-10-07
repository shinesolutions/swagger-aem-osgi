

#include "ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.h"

using namespace Tiny;

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties()
{
	watchwordspositive = ConfigNodePropertyArray();
	watchwordsnegative = ConfigNodePropertyArray();
	watchwordspath = ConfigNodePropertyString();
	sentimentpath = ConfigNodePropertyString();
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::~ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties()
{

}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *watchwordspositiveKey = "watchwords.positive";

    if(object.has_key(watchwordspositiveKey))
    {
        bourne::json value = object[watchwordspositiveKey];




        ConfigNodePropertyArray* obj = &watchwordspositive;
		obj->fromJson(value.dump());

    }

    const char *watchwordsnegativeKey = "watchwords.negative";

    if(object.has_key(watchwordsnegativeKey))
    {
        bourne::json value = object[watchwordsnegativeKey];




        ConfigNodePropertyArray* obj = &watchwordsnegative;
		obj->fromJson(value.dump());

    }

    const char *watchwordspathKey = "watchwords.path";

    if(object.has_key(watchwordspathKey))
    {
        bourne::json value = object[watchwordspathKey];




        ConfigNodePropertyString* obj = &watchwordspath;
		obj->fromJson(value.dump());

    }

    const char *sentimentpathKey = "sentiment.path";

    if(object.has_key(sentimentpathKey))
    {
        bourne::json value = object[sentimentpathKey];




        ConfigNodePropertyString* obj = &sentimentpath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["watchwordspositive"] = getWatchwordspositive().toJson();






	object["watchwordsnegative"] = getWatchwordsnegative().toJson();






	object["watchwordspath"] = getWatchwordspath().toJson();






	object["sentimentpath"] = getSentimentpath().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordspositive()
{
	return watchwordspositive;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordspositive(ConfigNodePropertyArray watchwordspositive)
{
	this->watchwordspositive = watchwordspositive;
}

ConfigNodePropertyArray
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordsnegative()
{
	return watchwordsnegative;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordsnegative(ConfigNodePropertyArray watchwordsnegative)
{
	this->watchwordsnegative = watchwordsnegative;
}

ConfigNodePropertyString
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getWatchwordspath()
{
	return watchwordspath;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setWatchwordspath(ConfigNodePropertyString watchwordspath)
{
	this->watchwordspath = watchwordspath;
}

ConfigNodePropertyString
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::getSentimentpath()
{
	return sentimentpath;
}

void
ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties::setSentimentpath(ConfigNodePropertyString sentimentpath)
{
	this->sentimentpath = sentimentpath;
}



