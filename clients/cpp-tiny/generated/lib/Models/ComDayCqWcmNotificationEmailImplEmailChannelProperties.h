
/*
 * ComDayCqWcmNotificationEmailImplEmailChannelProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_


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

class ComDayCqWcmNotificationEmailImplEmailChannelProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmNotificationEmailImplEmailChannelProperties();
    ComDayCqWcmNotificationEmailImplEmailChannelProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmNotificationEmailImplEmailChannelProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEmailfrom();

	/*! \brief Set 
	 */
	void setEmailfrom(ConfigNodePropertyString emailfrom);


    private:
    ConfigNodePropertyString emailfrom;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmNotificationEmailImplEmailChannelProperties_H_ */
