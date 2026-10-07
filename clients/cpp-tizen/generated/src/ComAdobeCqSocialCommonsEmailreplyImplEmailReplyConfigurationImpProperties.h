/*
 * ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_
#define _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties();
	ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailname();

	/*! \brief Set 
	 */
	void setEmailname(ConfigNodePropertyString  emailname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailcreatePostFromReply();

	/*! \brief Set 
	 */
	void setEmailcreatePostFromReply(ConfigNodePropertyBoolean  emailcreatePostFromReply);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEmailaddCommentIdTo();

	/*! \brief Set 
	 */
	void setEmailaddCommentIdTo(ConfigNodePropertyDropDown  emailaddCommentIdTo);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getEmailsubjectMaximumLength();

	/*! \brief Set 
	 */
	void setEmailsubjectMaximumLength(ConfigNodePropertyInteger  emailsubjectMaximumLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailreplyToAddress();

	/*! \brief Set 
	 */
	void setEmailreplyToAddress(ConfigNodePropertyString  emailreplyToAddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailreplyToDelimiter();

	/*! \brief Set 
	 */
	void setEmailreplyToDelimiter(ConfigNodePropertyString  emailreplyToDelimiter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtrackerIdPrefixInSubject();

	/*! \brief Set 
	 */
	void setEmailtrackerIdPrefixInSubject(ConfigNodePropertyString  emailtrackerIdPrefixInSubject);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtrackerIdPrefixInBody();

	/*! \brief Set 
	 */
	void setEmailtrackerIdPrefixInBody(ConfigNodePropertyString  emailtrackerIdPrefixInBody);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailasHTML();

	/*! \brief Set 
	 */
	void setEmailasHTML(ConfigNodePropertyBoolean  emailasHTML);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmaildefaultUserName();

	/*! \brief Set 
	 */
	void setEmaildefaultUserName(ConfigNodePropertyString  emaildefaultUserName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtemplatesrootPath();

	/*! \brief Set 
	 */
	void setEmailtemplatesrootPath(ConfigNodePropertyString  emailtemplatesrootPath);

private:
	ConfigNodePropertyString emailname;
	ConfigNodePropertyBoolean emailcreatePostFromReply;
	ConfigNodePropertyDropDown emailaddCommentIdTo;
	ConfigNodePropertyInteger emailsubjectMaximumLength;
	ConfigNodePropertyString emailreplyToAddress;
	ConfigNodePropertyString emailreplyToDelimiter;
	ConfigNodePropertyString emailtrackerIdPrefixInSubject;
	ConfigNodePropertyString emailtrackerIdPrefixInBody;
	ConfigNodePropertyBoolean emailasHTML;
	ConfigNodePropertyString emaildefaultUserName;
	ConfigNodePropertyString emailtemplatesrootPath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_ */
