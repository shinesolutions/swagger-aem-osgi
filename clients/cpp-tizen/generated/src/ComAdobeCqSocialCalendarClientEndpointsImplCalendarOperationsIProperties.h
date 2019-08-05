/*
 * ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_
#define _ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties();
	ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxRetry();

	/*! \brief Set 
	 */
	void setMaxRetry(ConfigNodePropertyInteger  maxRetry);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getFieldWhitelist();

	/*! \brief Set 
	 */
	void setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAttachmentTypeBlacklist();

	/*! \brief Set 
	 */
	void setAttachmentTypeBlacklist(ConfigNodePropertyArray  attachmentTypeBlacklist);

private:
	ConfigNodePropertyInteger maxRetry;
	ConfigNodePropertyArray fieldWhitelist;
	ConfigNodePropertyArray attachmentTypeBlacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties_H_ */
