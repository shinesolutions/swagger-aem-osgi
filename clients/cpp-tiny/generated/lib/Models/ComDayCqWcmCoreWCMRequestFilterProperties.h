
/*
 * ComDayCqWcmCoreWCMRequestFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreWCMRequestFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreWCMRequestFilterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreWCMRequestFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreWCMRequestFilterProperties();
    ComDayCqWcmCoreWCMRequestFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreWCMRequestFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getWcmfiltermode();

	/*! \brief Set 
	 */
	void setWcmfiltermode(ConfigNodePropertyDropDown wcmfiltermode);


    private:
    ConfigNodePropertyDropDown wcmfiltermode;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreWCMRequestFilterProperties_H_ */
