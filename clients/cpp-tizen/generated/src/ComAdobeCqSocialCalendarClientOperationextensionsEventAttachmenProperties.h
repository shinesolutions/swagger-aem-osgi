/*
 * ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_
#define _ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_


#include <string>
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

class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties();
	ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyString  attachmentTypeBlacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getExtensionorder();

	/*! \brief Set 
	 */
	void setExtensionorder(ConfigNodePropertyInteger  extensionorder);

private:
	ConfigNodePropertyString attachmentTypeBlacklist;
	ConfigNodePropertyInteger extensionorder;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties_H_ */
