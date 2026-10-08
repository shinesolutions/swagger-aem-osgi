
/*
 * ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties();
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailname();

	/*! \brief Set 
	 */
	void setEmailname(ConfigNodePropertyString emailname);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailcreatePostFromReply();

	/*! \brief Set 
	 */
	void setEmailcreatePostFromReply(ConfigNodePropertyBoolean emailcreatePostFromReply);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getEmailaddCommentIdTo();

	/*! \brief Set 
	 */
	void setEmailaddCommentIdTo(ConfigNodePropertyDropDown emailaddCommentIdTo);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getEmailsubjectMaximumLength();

	/*! \brief Set 
	 */
	void setEmailsubjectMaximumLength(ConfigNodePropertyInteger emailsubjectMaximumLength);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailreplyToAddress();

	/*! \brief Set 
	 */
	void setEmailreplyToAddress(ConfigNodePropertyString emailreplyToAddress);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailreplyToDelimiter();

	/*! \brief Set 
	 */
	void setEmailreplyToDelimiter(ConfigNodePropertyString emailreplyToDelimiter);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtrackerIdPrefixInSubject();

	/*! \brief Set 
	 */
	void setEmailtrackerIdPrefixInSubject(ConfigNodePropertyString emailtrackerIdPrefixInSubject);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtrackerIdPrefixInBody();

	/*! \brief Set 
	 */
	void setEmailtrackerIdPrefixInBody(ConfigNodePropertyString emailtrackerIdPrefixInBody);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEmailasHTML();

	/*! \brief Set 
	 */
	void setEmailasHTML(ConfigNodePropertyBoolean emailasHTML);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmaildefaultUserName();

	/*! \brief Set 
	 */
	void setEmaildefaultUserName(ConfigNodePropertyString emaildefaultUserName);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailtemplatesrootPath();

	/*! \brief Set 
	 */
	void setEmailtemplatesrootPath(ConfigNodePropertyString emailtemplatesrootPath);


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
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties_H_ */
