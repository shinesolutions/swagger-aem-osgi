
/*
 * ComDayCqDamCoreImplServletMetadataGetServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMetadataGetServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMetadataGetServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreImplServletMetadataGetServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletMetadataGetServletProperties();
    ComDayCqDamCoreImplServletMetadataGetServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletMetadataGetServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletresourceTypes();

	/*! \brief Set 
	 */
	void setSlingservletresourceTypes(ConfigNodePropertyString slingservletresourceTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyString slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletextensions();

	/*! \brief Set 
	 */
	void setSlingservletextensions(ConfigNodePropertyString slingservletextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletselectors();

	/*! \brief Set 
	 */
	void setSlingservletselectors(ConfigNodePropertyString slingservletselectors);


    private:
    ConfigNodePropertyString slingservletresourceTypes;
    ConfigNodePropertyString slingservletmethods;
    ConfigNodePropertyString slingservletextensions;
    ConfigNodePropertyString slingservletselectors;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMetadataGetServletProperties_H_ */
