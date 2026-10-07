
/*
 * ComDayCqDamCoreImplDamChangeEventListenerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplDamChangeEventListenerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplDamChangeEventListenerProperties_H_


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

class ComDayCqDamCoreImplDamChangeEventListenerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplDamChangeEventListenerProperties();
    ComDayCqDamCoreImplDamChangeEventListenerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplDamChangeEventListenerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getChangeeventlistenerobservedpaths();

	/*! \brief Set 
	 */
	void setChangeeventlistenerobservedpaths(ConfigNodePropertyArray changeeventlistenerobservedpaths);


    private:
    ConfigNodePropertyArray changeeventlistenerobservedpaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplDamChangeEventListenerProperties_H_ */
