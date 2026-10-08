
/*
 * ComDayCqDamCoreImplServletGuidLookupFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_


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

class ComDayCqDamCoreImplServletGuidLookupFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletGuidLookupFilterProperties();
    ComDayCqDamCoreImplServletGuidLookupFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletGuidLookupFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamcoreguidlookupfilterenabled();

	/*! \brief Set 
	 */
	void setCqdamcoreguidlookupfilterenabled(ConfigNodePropertyBoolean cqdamcoreguidlookupfilterenabled);


    private:
    ConfigNodePropertyBoolean cqdamcoreguidlookupfilterenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletGuidLookupFilterProperties_H_ */
