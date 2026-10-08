
/*
 * ComDayCqDamCoreImplServletCollectionsServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionsServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionsServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletCollectionsServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletCollectionsServletProperties();
    ComDayCqDamCoreImplServletCollectionsServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletCollectionsServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchcollectionsproperties();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionsproperties(ConfigNodePropertyArray cqdambatchcollectionsproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchcollectionslimit();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionslimit(ConfigNodePropertyInteger cqdambatchcollectionslimit);


    private:
    ConfigNodePropertyArray cqdambatchcollectionsproperties;
    ConfigNodePropertyInteger cqdambatchcollectionslimit;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionsServletProperties_H_ */
