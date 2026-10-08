

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties()
{
	patterntime = ConfigNodePropertyString();
	patternnewline = ConfigNodePropertyString();
	patterndayOfMonth = ConfigNodePropertyString();
	patternmonth = ConfigNodePropertyString();
	patternyear = ConfigNodePropertyString();
	patterndate = ConfigNodePropertyString();
	patterndateTime = ConfigNodePropertyString();
	patternemail = ConfigNodePropertyString();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *patterntimeKey = "pattern.time";

    if(object.has_key(patterntimeKey))
    {
        bourne::json value = object[patterntimeKey];




        ConfigNodePropertyString* obj = &patterntime;
		obj->fromJson(value.dump());

    }

    const char *patternnewlineKey = "pattern.newline";

    if(object.has_key(patternnewlineKey))
    {
        bourne::json value = object[patternnewlineKey];




        ConfigNodePropertyString* obj = &patternnewline;
		obj->fromJson(value.dump());

    }

    const char *patterndayOfMonthKey = "pattern.dayOfMonth";

    if(object.has_key(patterndayOfMonthKey))
    {
        bourne::json value = object[patterndayOfMonthKey];




        ConfigNodePropertyString* obj = &patterndayOfMonth;
		obj->fromJson(value.dump());

    }

    const char *patternmonthKey = "pattern.month";

    if(object.has_key(patternmonthKey))
    {
        bourne::json value = object[patternmonthKey];




        ConfigNodePropertyString* obj = &patternmonth;
		obj->fromJson(value.dump());

    }

    const char *patternyearKey = "pattern.year";

    if(object.has_key(patternyearKey))
    {
        bourne::json value = object[patternyearKey];




        ConfigNodePropertyString* obj = &patternyear;
		obj->fromJson(value.dump());

    }

    const char *patterndateKey = "pattern.date";

    if(object.has_key(patterndateKey))
    {
        bourne::json value = object[patterndateKey];




        ConfigNodePropertyString* obj = &patterndate;
		obj->fromJson(value.dump());

    }

    const char *patterndateTimeKey = "pattern.dateTime";

    if(object.has_key(patterndateTimeKey))
    {
        bourne::json value = object[patterndateTimeKey];




        ConfigNodePropertyString* obj = &patterndateTime;
		obj->fromJson(value.dump());

    }

    const char *patternemailKey = "pattern.email";

    if(object.has_key(patternemailKey))
    {
        bourne::json value = object[patternemailKey];




        ConfigNodePropertyString* obj = &patternemail;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["patterntime"] = getPatterntime().toJson();






	object["patternnewline"] = getPatternnewline().toJson();






	object["patterndayOfMonth"] = getPatterndayOfMonth().toJson();






	object["patternmonth"] = getPatternmonth().toJson();






	object["patternyear"] = getPatternyear().toJson();






	object["patterndate"] = getPatterndate().toJson();






	object["patterndateTime"] = getPatterndateTime().toJson();






	object["patternemail"] = getPatternemail().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterntime()
{
	return patterntime;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterntime(ConfigNodePropertyString patterntime)
{
	this->patterntime = patterntime;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternnewline()
{
	return patternnewline;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternnewline(ConfigNodePropertyString patternnewline)
{
	this->patternnewline = patternnewline;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndayOfMonth()
{
	return patterndayOfMonth;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndayOfMonth(ConfigNodePropertyString patterndayOfMonth)
{
	this->patterndayOfMonth = patterndayOfMonth;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternmonth()
{
	return patternmonth;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternmonth(ConfigNodePropertyString patternmonth)
{
	this->patternmonth = patternmonth;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternyear()
{
	return patternyear;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternyear(ConfigNodePropertyString patternyear)
{
	this->patternyear = patternyear;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndate()
{
	return patterndate;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndate(ConfigNodePropertyString patterndate)
{
	this->patterndate = patterndate;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatterndateTime()
{
	return patterndateTime;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatterndateTime(ConfigNodePropertyString patterndateTime)
{
	this->patterndateTime = patterndateTime;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::getPatternemail()
{
	return patternemail;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties::setPatternemail(ConfigNodePropertyString patternemail)
{
	this->patternemail = patternemail;
}



