
/*
 * ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo();
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string description);
	/*! \brief Get 
	 */
	ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo_H_ */
