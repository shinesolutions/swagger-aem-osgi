
/*
 * ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties();
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamscene7configurationeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdamscene7configurationeventlistenerenabled(ConfigNodePropertyBoolean cqdamscene7configurationeventlistenerenabled);


    private:
    ConfigNodePropertyBoolean cqdamscene7configurationeventlistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties_H_ */
