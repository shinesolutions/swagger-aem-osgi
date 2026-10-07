
/*
 * ComDayCqDamCoreImplRenditionMakerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplRenditionMakerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplRenditionMakerImplProperties_H_


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

class ComDayCqDamCoreImplRenditionMakerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplRenditionMakerImplProperties();
    ComDayCqDamCoreImplRenditionMakerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplRenditionMakerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getXmppropagate();

	/*! \brief Set 
	 */
	void setXmppropagate(ConfigNodePropertyBoolean xmppropagate);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmpexcludes();

	/*! \brief Set 
	 */
	void setXmpexcludes(ConfigNodePropertyArray xmpexcludes);


    private:
    ConfigNodePropertyBoolean xmppropagate;
    ConfigNodePropertyArray xmpexcludes;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplRenditionMakerImplProperties_H_ */
