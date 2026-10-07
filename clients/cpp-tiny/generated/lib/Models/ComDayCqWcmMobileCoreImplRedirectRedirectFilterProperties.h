
/*
 * ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_


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

class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties();
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRedirectenabled();

	/*! \brief Set 
	 */
	void setRedirectenabled(ConfigNodePropertyBoolean redirectenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRedirectstatsenabled();

	/*! \brief Set 
	 */
	void setRedirectstatsenabled(ConfigNodePropertyBoolean redirectstatsenabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRedirectextensions();

	/*! \brief Set 
	 */
	void setRedirectextensions(ConfigNodePropertyArray redirectextensions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getRedirectpaths();

	/*! \brief Set 
	 */
	void setRedirectpaths(ConfigNodePropertyArray redirectpaths);


    private:
    ConfigNodePropertyBoolean redirectenabled;
    ConfigNodePropertyBoolean redirectstatsenabled;
    ConfigNodePropertyArray redirectextensions;
    ConfigNodePropertyArray redirectpaths;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties_H_ */
