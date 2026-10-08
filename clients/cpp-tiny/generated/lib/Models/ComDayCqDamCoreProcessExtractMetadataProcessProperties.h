
/*
 * ComDayCqDamCoreProcessExtractMetadataProcessProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqDamCoreProcessExtractMetadataProcessProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreProcessExtractMetadataProcessProperties();
    ComDayCqDamCoreProcessExtractMetadataProcessProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreProcessExtractMetadataProcessProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProcesslabel();

	/*! \brief Set 
	 */
	void setProcesslabel(ConfigNodePropertyString processlabel);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenablesha1();

	/*! \brief Set 
	 */
	void setCqdamenablesha1(ConfigNodePropertyBoolean cqdamenablesha1);


    private:
    ConfigNodePropertyString processlabel;
    ConfigNodePropertyBoolean cqdamenablesha1;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreProcessExtractMetadataProcessProperties_H_ */
