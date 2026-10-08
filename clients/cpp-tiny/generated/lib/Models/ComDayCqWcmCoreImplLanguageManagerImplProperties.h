
/*
 * ComDayCqWcmCoreImplLanguageManagerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplLanguageManagerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplLanguageManagerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplLanguageManagerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplLanguageManagerImplProperties();
    ComDayCqWcmCoreImplLanguageManagerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplLanguageManagerImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getLangmgrlistpath();

	/*! \brief Set 
	 */
	void setLangmgrlistpath(ConfigNodePropertyString langmgrlistpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLangmgrcountrydefault();

	/*! \brief Set 
	 */
	void setLangmgrcountrydefault(ConfigNodePropertyArray langmgrcountrydefault);


    private:
    ConfigNodePropertyString langmgrlistpath;
    ConfigNodePropertyArray langmgrcountrydefault;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplLanguageManagerImplProperties_H_ */
