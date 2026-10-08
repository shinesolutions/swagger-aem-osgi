
/*
 * ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCalendarServletsTimeZoneServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties();
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCalendarServletsTimeZoneServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getTimezonesexpirytime();

	/*! \brief Set 
	 */
	void setTimezonesexpirytime(ConfigNodePropertyInteger timezonesexpirytime);


    private:
    ConfigNodePropertyInteger timezonesexpirytime;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCalendarServletsTimeZoneServletProperties_H_ */
