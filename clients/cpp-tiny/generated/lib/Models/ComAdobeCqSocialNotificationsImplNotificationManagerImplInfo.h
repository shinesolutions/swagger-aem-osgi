
/*
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo();
    ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo();


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
	ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties properties);


    private:
    std::string pid{};
    std::string title{};
    std::string description{};
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo_H_ */
