
/*
 * ComDayCqNotificationImplNotificationServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqNotificationImplNotificationServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqNotificationImplNotificationServiceImplProperties_H_


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

class ComDayCqNotificationImplNotificationServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqNotificationImplNotificationServiceImplProperties();
    ComDayCqNotificationImplNotificationServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqNotificationImplNotificationServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getEventfilter();

	/*! \brief Set 
	 */
	void setEventfilter(ConfigNodePropertyString eventfilter);


    private:
    ConfigNodePropertyString eventfilter;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqNotificationImplNotificationServiceImplProperties_H_ */
