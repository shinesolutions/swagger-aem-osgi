
/*
 * ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_


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

class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties();
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletDamContentDispositionFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqmimetypeblacklist();

	/*! \brief Set 
	 */
	void setCqmimetypeblacklist(ConfigNodePropertyArray cqmimetypeblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamemptymime();

	/*! \brief Set 
	 */
	void setCqdamemptymime(ConfigNodePropertyBoolean cqdamemptymime);


    private:
    ConfigNodePropertyArray cqmimetypeblacklist;
    ConfigNodePropertyBoolean cqdamemptymime;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletDamContentDispositionFilterProperties_H_ */
