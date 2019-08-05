/*
 * ComDayCqWcmNotificationImplNotificationManagerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_
#define _ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmNotificationImplNotificationManagerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmNotificationImplNotificationManagerImplProperties();
	ComDayCqWcmNotificationImplNotificationManagerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmNotificationImplNotificationManagerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyArray  eventtopics);

private:
	ConfigNodePropertyArray eventtopics;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_ */
