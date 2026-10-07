

#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties()
{
	emailname = ConfigNodePropertyString();
	emailcreatePostFromReply = ConfigNodePropertyBoolean();
	emailaddCommentIdTo = ConfigNodePropertyDropDown();
	emailsubjectMaximumLength = ConfigNodePropertyInteger();
	emailreplyToAddress = ConfigNodePropertyString();
	emailreplyToDelimiter = ConfigNodePropertyString();
	emailtrackerIdPrefixInSubject = ConfigNodePropertyString();
	emailtrackerIdPrefixInBody = ConfigNodePropertyString();
	emailasHTML = ConfigNodePropertyBoolean();
	emaildefaultUserName = ConfigNodePropertyString();
	emailtemplatesrootPath = ConfigNodePropertyString();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties()
{

}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *emailnameKey = "email.name";

    if(object.has_key(emailnameKey))
    {
        bourne::json value = object[emailnameKey];




        ConfigNodePropertyString* obj = &emailname;
		obj->fromJson(value.dump());

    }

    const char *emailcreatePostFromReplyKey = "email.createPostFromReply";

    if(object.has_key(emailcreatePostFromReplyKey))
    {
        bourne::json value = object[emailcreatePostFromReplyKey];




        ConfigNodePropertyBoolean* obj = &emailcreatePostFromReply;
		obj->fromJson(value.dump());

    }

    const char *emailaddCommentIdToKey = "email.addCommentIdTo";

    if(object.has_key(emailaddCommentIdToKey))
    {
        bourne::json value = object[emailaddCommentIdToKey];




        ConfigNodePropertyDropDown* obj = &emailaddCommentIdTo;
		obj->fromJson(value.dump());

    }

    const char *emailsubjectMaximumLengthKey = "email.subjectMaximumLength";

    if(object.has_key(emailsubjectMaximumLengthKey))
    {
        bourne::json value = object[emailsubjectMaximumLengthKey];




        ConfigNodePropertyInteger* obj = &emailsubjectMaximumLength;
		obj->fromJson(value.dump());

    }

    const char *emailreplyToAddressKey = "email.replyToAddress";

    if(object.has_key(emailreplyToAddressKey))
    {
        bourne::json value = object[emailreplyToAddressKey];




        ConfigNodePropertyString* obj = &emailreplyToAddress;
		obj->fromJson(value.dump());

    }

    const char *emailreplyToDelimiterKey = "email.replyToDelimiter";

    if(object.has_key(emailreplyToDelimiterKey))
    {
        bourne::json value = object[emailreplyToDelimiterKey];




        ConfigNodePropertyString* obj = &emailreplyToDelimiter;
		obj->fromJson(value.dump());

    }

    const char *emailtrackerIdPrefixInSubjectKey = "email.trackerIdPrefixInSubject";

    if(object.has_key(emailtrackerIdPrefixInSubjectKey))
    {
        bourne::json value = object[emailtrackerIdPrefixInSubjectKey];




        ConfigNodePropertyString* obj = &emailtrackerIdPrefixInSubject;
		obj->fromJson(value.dump());

    }

    const char *emailtrackerIdPrefixInBodyKey = "email.trackerIdPrefixInBody";

    if(object.has_key(emailtrackerIdPrefixInBodyKey))
    {
        bourne::json value = object[emailtrackerIdPrefixInBodyKey];




        ConfigNodePropertyString* obj = &emailtrackerIdPrefixInBody;
		obj->fromJson(value.dump());

    }

    const char *emailasHTMLKey = "email.asHTML";

    if(object.has_key(emailasHTMLKey))
    {
        bourne::json value = object[emailasHTMLKey];




        ConfigNodePropertyBoolean* obj = &emailasHTML;
		obj->fromJson(value.dump());

    }

    const char *emaildefaultUserNameKey = "email.defaultUserName";

    if(object.has_key(emaildefaultUserNameKey))
    {
        bourne::json value = object[emaildefaultUserNameKey];




        ConfigNodePropertyString* obj = &emaildefaultUserName;
		obj->fromJson(value.dump());

    }

    const char *emailtemplatesrootPathKey = "email.templates.rootPath";

    if(object.has_key(emailtemplatesrootPathKey))
    {
        bourne::json value = object[emailtemplatesrootPathKey];




        ConfigNodePropertyString* obj = &emailtemplatesrootPath;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["emailname"] = getEmailname().toJson();






	object["emailcreatePostFromReply"] = getEmailcreatePostFromReply().toJson();






	object["emailaddCommentIdTo"] = getEmailaddCommentIdTo().toJson();






	object["emailsubjectMaximumLength"] = getEmailsubjectMaximumLength().toJson();






	object["emailreplyToAddress"] = getEmailreplyToAddress().toJson();






	object["emailreplyToDelimiter"] = getEmailreplyToDelimiter().toJson();






	object["emailtrackerIdPrefixInSubject"] = getEmailtrackerIdPrefixInSubject().toJson();






	object["emailtrackerIdPrefixInBody"] = getEmailtrackerIdPrefixInBody().toJson();






	object["emailasHTML"] = getEmailasHTML().toJson();






	object["emaildefaultUserName"] = getEmaildefaultUserName().toJson();






	object["emailtemplatesrootPath"] = getEmailtemplatesrootPath().toJson();


    return object;

}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailname()
{
	return emailname;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailname(ConfigNodePropertyString emailname)
{
	this->emailname = emailname;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailcreatePostFromReply()
{
	return emailcreatePostFromReply;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailcreatePostFromReply(ConfigNodePropertyBoolean emailcreatePostFromReply)
{
	this->emailcreatePostFromReply = emailcreatePostFromReply;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailaddCommentIdTo()
{
	return emailaddCommentIdTo;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailaddCommentIdTo(ConfigNodePropertyDropDown emailaddCommentIdTo)
{
	this->emailaddCommentIdTo = emailaddCommentIdTo;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailsubjectMaximumLength()
{
	return emailsubjectMaximumLength;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailsubjectMaximumLength(ConfigNodePropertyInteger emailsubjectMaximumLength)
{
	this->emailsubjectMaximumLength = emailsubjectMaximumLength;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailreplyToAddress()
{
	return emailreplyToAddress;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailreplyToAddress(ConfigNodePropertyString emailreplyToAddress)
{
	this->emailreplyToAddress = emailreplyToAddress;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailreplyToDelimiter()
{
	return emailreplyToDelimiter;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailreplyToDelimiter(ConfigNodePropertyString emailreplyToDelimiter)
{
	this->emailreplyToDelimiter = emailreplyToDelimiter;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtrackerIdPrefixInSubject()
{
	return emailtrackerIdPrefixInSubject;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtrackerIdPrefixInSubject(ConfigNodePropertyString emailtrackerIdPrefixInSubject)
{
	this->emailtrackerIdPrefixInSubject = emailtrackerIdPrefixInSubject;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtrackerIdPrefixInBody()
{
	return emailtrackerIdPrefixInBody;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtrackerIdPrefixInBody(ConfigNodePropertyString emailtrackerIdPrefixInBody)
{
	this->emailtrackerIdPrefixInBody = emailtrackerIdPrefixInBody;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailasHTML()
{
	return emailasHTML;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailasHTML(ConfigNodePropertyBoolean emailasHTML)
{
	this->emailasHTML = emailasHTML;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmaildefaultUserName()
{
	return emaildefaultUserName;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmaildefaultUserName(ConfigNodePropertyString emaildefaultUserName)
{
	this->emaildefaultUserName = emaildefaultUserName;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtemplatesrootPath()
{
	return emailtemplatesrootPath;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtemplatesrootPath(ConfigNodePropertyString emailtemplatesrootPath)
{
	this->emailtemplatesrootPath = emailtemplatesrootPath;
}



