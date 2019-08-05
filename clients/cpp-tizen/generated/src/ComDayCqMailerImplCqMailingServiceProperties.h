/*
 * ComDayCqMailerImplCqMailingServiceProperties.h
 *
 * 
 */

#ifndef _ComDayCqMailerImplCqMailingServiceProperties_H_
#define _ComDayCqMailerImplCqMailingServiceProperties_H_


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

class ComDayCqMailerImplCqMailingServiceProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqMailerImplCqMailingServiceProperties();
	ComDayCqMailerImplCqMailingServiceProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqMailerImplCqMailingServiceProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxrecipientcount();

	/*! \brief Set 
	 */
	void setMaxrecipientcount(ConfigNodePropertyString  maxrecipientcount);

private:
	ConfigNodePropertyString maxrecipientcount;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqMailerImplCqMailingServiceProperties_H_ */
