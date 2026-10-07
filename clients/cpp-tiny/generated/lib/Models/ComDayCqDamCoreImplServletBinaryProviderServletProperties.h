
/*
 * ComDayCqDamCoreImplServletBinaryProviderServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_


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

class ComDayCqDamCoreImplServletBinaryProviderServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletBinaryProviderServletProperties();
    ComDayCqDamCoreImplServletBinaryProviderServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletBinaryProviderServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyArray slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdrmenable();

	/*! \brief Set 
	 */
	void setCqdamdrmenable(ConfigNodePropertyBoolean cqdamdrmenable);


    private:
    ConfigNodePropertyArray slingservletresourceTypes;
    ConfigNodePropertyArray slingservletmethods;
    ConfigNodePropertyBoolean cqdamdrmenable;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletBinaryProviderServletProperties_H_ */
