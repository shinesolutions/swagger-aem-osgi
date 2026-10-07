/*
 * ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_
#define _ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_


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

class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqSocialCalendarServletsTimeZoneServletProperties();
	ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqSocialCalendarServletsTimeZoneServletProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimezonesexpirytime();

	/*! \brief Set 
	 */
	void setTimezonesexpirytime(ConfigNodePropertyInteger  timezonesexpirytime);

private:
	ConfigNodePropertyInteger timezonesexpirytime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_ */
