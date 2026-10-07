/*
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_
#define _ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_


#include <string>
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

class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();
	ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxunreadnotificationcount();

	/*! \brief Set 
	 */
	void setMaxunreadnotificationcount(ConfigNodePropertyInteger  maxunreadnotificationcount);

private:
	ConfigNodePropertyInteger maxunreadnotificationcount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_ */
