
/*
 * ComDayCqDamCoreImplServletCollectionServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionServletProperties_H_


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

class ComDayCqDamCoreImplServletCollectionServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletCollectionServletProperties();
    ComDayCqDamCoreImplServletCollectionServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletCollectionServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqdambatchcollectionproperties();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionproperties(ConfigNodePropertyArray cqdambatchcollectionproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCqdambatchcollectionmaxcollections();

	/*! \brief Set 
	 */
	void setCqdambatchcollectionmaxcollections(ConfigNodePropertyInteger cqdambatchcollectionmaxcollections);


    private:
    ConfigNodePropertyArray cqdambatchcollectionproperties;
    ConfigNodePropertyInteger cqdambatchcollectionmaxcollections;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletCollectionServletProperties_H_ */
