
/*
 * ComAdobeCqSocialNotificationsImplMentionsRouterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplMentionsRouterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplMentionsRouterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialNotificationsImplMentionsRouterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialNotificationsImplMentionsRouterProperties();
    ComAdobeCqSocialNotificationsImplMentionsRouterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialNotificationsImplMentionsRouterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyString eventtopics);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);


    private:
    ConfigNodePropertyString eventtopics;
    ConfigNodePropertyString eventfilter;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialNotificationsImplMentionsRouterProperties_H_ */
