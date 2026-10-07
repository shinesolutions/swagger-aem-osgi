
/*
 * ComDayCqDamCoreImplProcessTextExtractionProcessProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_


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

class ComDayCqDamCoreImplProcessTextExtractionProcessProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties();
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplProcessTextExtractionProcessProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimeTypes();

	/*! \brief Set 
	 */
	void setMimeTypes(ConfigNodePropertyArray mimeTypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxExtract();

	/*! \brief Set 
	 */
	void setMaxExtract(ConfigNodePropertyInteger maxExtract);


    private:
    ConfigNodePropertyArray mimeTypes;
    ConfigNodePropertyInteger maxExtract;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplProcessTextExtractionProcessProperties_H_ */
