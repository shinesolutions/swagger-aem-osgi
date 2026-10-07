/*
 * ComDayCqNotificationImplNotificationServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqNotificationImplNotificationServiceImplProperties_H_
#define _ComDayCqNotificationImplNotificationServiceImplProperties_H_


#include <string>
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

class ComDayCqNotificationImplNotificationServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqNotificationImplNotificationServiceImplProperties();
	ComDayCqNotificationImplNotificationServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqNotificationImplNotificationServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString  eventfilter);

private:
	ConfigNodePropertyString eventfilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqNotificationImplNotificationServiceImplProperties_H_ */
