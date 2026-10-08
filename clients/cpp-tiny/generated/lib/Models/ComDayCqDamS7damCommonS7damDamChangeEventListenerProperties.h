
/*
 * ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_


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

class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties();
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdams7damdamchangeeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdams7damdamchangeeventlistenerenabled(ConfigNodePropertyBoolean cqdams7damdamchangeeventlistenerenabled);


    private:
    ConfigNodePropertyBoolean cqdams7damdamchangeeventlistenerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties_H_ */
