/*
 * ComDayCqWcmNotificationEmailImplEmailChannelProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_
#define _ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_


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

class ComDayCqWcmNotificationEmailImplEmailChannelProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmNotificationEmailImplEmailChannelProperties();
	ComDayCqWcmNotificationEmailImplEmailChannelProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmNotificationEmailImplEmailChannelProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailfrom();

	/*! \brief Set 
	 */
	void setEmailfrom(ConfigNodePropertyString  emailfrom);

private:
	ConfigNodePropertyString emailfrom;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_ */
