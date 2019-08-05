#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::__init()
{
	//emailname = new ConfigNodePropertyString();
	//emailcreatePostFromReply = new ConfigNodePropertyBoolean();
	//emailaddCommentIdTo = new ConfigNodePropertyDropDown();
	//emailsubjectMaximumLength = new ConfigNodePropertyInteger();
	//emailreplyToAddress = new ConfigNodePropertyString();
	//emailreplyToDelimiter = new ConfigNodePropertyString();
	//emailtrackerIdPrefixInSubject = new ConfigNodePropertyString();
	//emailtrackerIdPrefixInBody = new ConfigNodePropertyString();
	//emailasHTML = new ConfigNodePropertyBoolean();
	//emaildefaultUserName = new ConfigNodePropertyString();
	//emailtemplatesrootPath = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::__cleanup()
{
	//if(emailname != NULL) {
	//
	//delete emailname;
	//emailname = NULL;
	//}
	//if(emailcreatePostFromReply != NULL) {
	//
	//delete emailcreatePostFromReply;
	//emailcreatePostFromReply = NULL;
	//}
	//if(emailaddCommentIdTo != NULL) {
	//
	//delete emailaddCommentIdTo;
	//emailaddCommentIdTo = NULL;
	//}
	//if(emailsubjectMaximumLength != NULL) {
	//
	//delete emailsubjectMaximumLength;
	//emailsubjectMaximumLength = NULL;
	//}
	//if(emailreplyToAddress != NULL) {
	//
	//delete emailreplyToAddress;
	//emailreplyToAddress = NULL;
	//}
	//if(emailreplyToDelimiter != NULL) {
	//
	//delete emailreplyToDelimiter;
	//emailreplyToDelimiter = NULL;
	//}
	//if(emailtrackerIdPrefixInSubject != NULL) {
	//
	//delete emailtrackerIdPrefixInSubject;
	//emailtrackerIdPrefixInSubject = NULL;
	//}
	//if(emailtrackerIdPrefixInBody != NULL) {
	//
	//delete emailtrackerIdPrefixInBody;
	//emailtrackerIdPrefixInBody = NULL;
	//}
	//if(emailasHTML != NULL) {
	//
	//delete emailasHTML;
	//emailasHTML = NULL;
	//}
	//if(emaildefaultUserName != NULL) {
	//
	//delete emaildefaultUserName;
	//emaildefaultUserName = NULL;
	//}
	//if(emailtemplatesrootPath != NULL) {
	//
	//delete emailtemplatesrootPath;
	//emailtemplatesrootPath = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailnameKey = "email.name";
	node = json_object_get_member(pJsonObject, emailnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailcreatePostFromReplyKey = "email.createPostFromReply";
	node = json_object_get_member(pJsonObject, emailcreatePostFromReplyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&emailcreatePostFromReply, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&emailcreatePostFromReply);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailaddCommentIdToKey = "email.addCommentIdTo";
	node = json_object_get_member(pJsonObject, emailaddCommentIdToKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&emailaddCommentIdTo, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&emailaddCommentIdTo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailsubjectMaximumLengthKey = "email.subjectMaximumLength";
	node = json_object_get_member(pJsonObject, emailsubjectMaximumLengthKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&emailsubjectMaximumLength, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&emailsubjectMaximumLength);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailreplyToAddressKey = "email.replyToAddress";
	node = json_object_get_member(pJsonObject, emailreplyToAddressKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailreplyToAddress, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailreplyToAddress);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailreplyToDelimiterKey = "email.replyToDelimiter";
	node = json_object_get_member(pJsonObject, emailreplyToDelimiterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailreplyToDelimiter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailreplyToDelimiter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailtrackerIdPrefixInSubjectKey = "email.trackerIdPrefixInSubject";
	node = json_object_get_member(pJsonObject, emailtrackerIdPrefixInSubjectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailtrackerIdPrefixInSubject, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailtrackerIdPrefixInSubject);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailtrackerIdPrefixInBodyKey = "email.trackerIdPrefixInBody";
	node = json_object_get_member(pJsonObject, emailtrackerIdPrefixInBodyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailtrackerIdPrefixInBody, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailtrackerIdPrefixInBody);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailasHTMLKey = "email.asHTML";
	node = json_object_get_member(pJsonObject, emailasHTMLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&emailasHTML, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&emailasHTML);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emaildefaultUserNameKey = "email.defaultUserName";
	node = json_object_get_member(pJsonObject, emaildefaultUserNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emaildefaultUserName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emaildefaultUserName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *emailtemplatesrootPathKey = "email.templates.rootPath";
	node = json_object_get_member(pJsonObject, emailtemplatesrootPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&emailtemplatesrootPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&emailtemplatesrootPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailnameKey = "email.name";
	json_object_set_member(pJsonObject, emailnameKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEmailcreatePostFromReply();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEmailcreatePostFromReply());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailcreatePostFromReplyKey = "email.createPostFromReply";
	json_object_set_member(pJsonObject, emailcreatePostFromReplyKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getEmailaddCommentIdTo();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getEmailaddCommentIdTo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailaddCommentIdToKey = "email.addCommentIdTo";
	json_object_set_member(pJsonObject, emailaddCommentIdToKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getEmailsubjectMaximumLength();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getEmailsubjectMaximumLength());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailsubjectMaximumLengthKey = "email.subjectMaximumLength";
	json_object_set_member(pJsonObject, emailsubjectMaximumLengthKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailreplyToAddress();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailreplyToAddress());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailreplyToAddressKey = "email.replyToAddress";
	json_object_set_member(pJsonObject, emailreplyToAddressKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailreplyToDelimiter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailreplyToDelimiter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailreplyToDelimiterKey = "email.replyToDelimiter";
	json_object_set_member(pJsonObject, emailreplyToDelimiterKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailtrackerIdPrefixInSubject();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailtrackerIdPrefixInSubject());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailtrackerIdPrefixInSubjectKey = "email.trackerIdPrefixInSubject";
	json_object_set_member(pJsonObject, emailtrackerIdPrefixInSubjectKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailtrackerIdPrefixInBody();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailtrackerIdPrefixInBody());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailtrackerIdPrefixInBodyKey = "email.trackerIdPrefixInBody";
	json_object_set_member(pJsonObject, emailtrackerIdPrefixInBodyKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEmailasHTML();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEmailasHTML());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailasHTMLKey = "email.asHTML";
	json_object_set_member(pJsonObject, emailasHTMLKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmaildefaultUserName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmaildefaultUserName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emaildefaultUserNameKey = "email.defaultUserName";
	json_object_set_member(pJsonObject, emaildefaultUserNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getEmailtemplatesrootPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getEmailtemplatesrootPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *emailtemplatesrootPathKey = "email.templates.rootPath";
	json_object_set_member(pJsonObject, emailtemplatesrootPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailname()
{
	return emailname;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailname(ConfigNodePropertyString  emailname)
{
	this->emailname = emailname;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailcreatePostFromReply()
{
	return emailcreatePostFromReply;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailcreatePostFromReply(ConfigNodePropertyBoolean  emailcreatePostFromReply)
{
	this->emailcreatePostFromReply = emailcreatePostFromReply;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailaddCommentIdTo()
{
	return emailaddCommentIdTo;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailaddCommentIdTo(ConfigNodePropertyDropDown  emailaddCommentIdTo)
{
	this->emailaddCommentIdTo = emailaddCommentIdTo;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailsubjectMaximumLength()
{
	return emailsubjectMaximumLength;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailsubjectMaximumLength(ConfigNodePropertyInteger  emailsubjectMaximumLength)
{
	this->emailsubjectMaximumLength = emailsubjectMaximumLength;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailreplyToAddress()
{
	return emailreplyToAddress;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailreplyToAddress(ConfigNodePropertyString  emailreplyToAddress)
{
	this->emailreplyToAddress = emailreplyToAddress;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailreplyToDelimiter()
{
	return emailreplyToDelimiter;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailreplyToDelimiter(ConfigNodePropertyString  emailreplyToDelimiter)
{
	this->emailreplyToDelimiter = emailreplyToDelimiter;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtrackerIdPrefixInSubject()
{
	return emailtrackerIdPrefixInSubject;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtrackerIdPrefixInSubject(ConfigNodePropertyString  emailtrackerIdPrefixInSubject)
{
	this->emailtrackerIdPrefixInSubject = emailtrackerIdPrefixInSubject;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtrackerIdPrefixInBody()
{
	return emailtrackerIdPrefixInBody;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtrackerIdPrefixInBody(ConfigNodePropertyString  emailtrackerIdPrefixInBody)
{
	this->emailtrackerIdPrefixInBody = emailtrackerIdPrefixInBody;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailasHTML()
{
	return emailasHTML;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailasHTML(ConfigNodePropertyBoolean  emailasHTML)
{
	this->emailasHTML = emailasHTML;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmaildefaultUserName()
{
	return emaildefaultUserName;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmaildefaultUserName(ConfigNodePropertyString  emaildefaultUserName)
{
	this->emaildefaultUserName = emaildefaultUserName;
}

ConfigNodePropertyString
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::getEmailtemplatesrootPath()
{
	return emailtemplatesrootPath;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties::setEmailtemplatesrootPath(ConfigNodePropertyString  emailtemplatesrootPath)
{
	this->emailtemplatesrootPath = emailtemplatesrootPath;
}


