
/*
 * ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_


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

class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdetectassetmimefromcontent();

	/*! \brief Set 
	 */
	void setCqdamdetectassetmimefromcontent(ConfigNodePropertyBoolean cqdamdetectassetmimefromcontent);


    private:
    ConfigNodePropertyBoolean cqdamdetectassetmimefromcontent;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties_H_ */
