
/*
 * ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceTypefilters();

	/*! \brief Set 
	 */
	void setResourceTypefilters(ConfigNodePropertyArray resourceTypefilters);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getPriority();

	/*! \brief Set 
	 */
	void setPriority(ConfigNodePropertyInteger priority);


    private:
    ConfigNodePropertyArray resourceTypefilters;
    ConfigNodePropertyInteger priority;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties_H_ */
