
/*
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_


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

class ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxunreadnotificationcount();

	/*! \brief Set 
	 */
	void setMaxunreadnotificationcount(ConfigNodePropertyInteger maxunreadnotificationcount);


    private:
    ConfigNodePropertyInteger maxunreadnotificationcount;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_ */
