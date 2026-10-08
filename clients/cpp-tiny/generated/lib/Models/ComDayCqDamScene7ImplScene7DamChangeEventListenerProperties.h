
/*
 * ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamscene7damchangeeventlistenerenabled();

	/*! \brief Set 
	 */
	void setCqdamscene7damchangeeventlistenerenabled(ConfigNodePropertyBoolean cqdamscene7damchangeeventlistenerenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdamscene7damchangeeventlistenerobservedpaths();

	/*! \brief Set 
	 */
	void setCqdamscene7damchangeeventlistenerobservedpaths(ConfigNodePropertyArray cqdamscene7damchangeeventlistenerobservedpaths);


    private:
    ConfigNodePropertyBoolean cqdamscene7damchangeeventlistenerenabled;
    ConfigNodePropertyArray cqdamscene7damchangeeventlistenerobservedpaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties_H_ */
