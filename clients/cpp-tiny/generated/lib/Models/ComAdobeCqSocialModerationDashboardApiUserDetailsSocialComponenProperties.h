
/*
 * ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_


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

class ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties();
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger priority);


    private:
    ConfigNodePropertyInteger priority;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties_H_ */
