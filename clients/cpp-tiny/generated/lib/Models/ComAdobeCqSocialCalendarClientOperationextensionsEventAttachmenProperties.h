
/*
 * ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties();
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyString attachmentTypeBlacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtensionorder();

	/*! \brief Set 
	 */
	void setExtensionorder(ConfigNodePropertyInteger extensionorder);


    private:
    ConfigNodePropertyString attachmentTypeBlacklist;
    ConfigNodePropertyInteger extensionorder;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_ */
