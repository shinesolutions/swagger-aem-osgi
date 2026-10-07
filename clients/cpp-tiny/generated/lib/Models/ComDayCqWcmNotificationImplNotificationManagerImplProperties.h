
/*
 * ComDayCqWcmNotificationImplNotificationManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmNotificationImplNotificationManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmNotificationImplNotificationManagerImplProperties();
    ComDayCqWcmNotificationImplNotificationManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmNotificationImplNotificationManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getEventtopics();

	/*! \brief Set 
	 */
	void setEventtopics(ConfigNodePropertyArray eventtopics);


    private:
    ConfigNodePropertyArray eventtopics;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmNotificationImplNotificationManagerImplProperties_H_ */
