
/*
 * ComDayCqMailerImplCqMailingServiceProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqMailerImplCqMailingServiceProperties_H_
#define TINY_CPP_CLIENT_ComDayCqMailerImplCqMailingServiceProperties_H_


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

class ComDayCqMailerImplCqMailingServiceProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqMailerImplCqMailingServiceProperties();
    ComDayCqMailerImplCqMailingServiceProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqMailerImplCqMailingServiceProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMaxrecipientcount();

	/*! \brief Set 
	 */
	void setMaxrecipientcount(ConfigNodePropertyString maxrecipientcount);


    private:
    ConfigNodePropertyString maxrecipientcount;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqMailerImplCqMailingServiceProperties_H_ */
