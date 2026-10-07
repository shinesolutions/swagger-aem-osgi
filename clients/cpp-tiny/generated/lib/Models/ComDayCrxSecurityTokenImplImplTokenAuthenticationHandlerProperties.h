
/*
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties();
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString path);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTokenrequiredattr();

	/*! \brief Set 
	 */
	void setTokenrequiredattr(ConfigNodePropertyDropDown tokenrequiredattr);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenalternateurl();

	/*! \brief Set 
	 */
	void setTokenalternateurl(ConfigNodePropertyString tokenalternateurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTokenencapsulated();

	/*! \brief Set 
	 */
	void setTokenencapsulated(ConfigNodePropertyBoolean tokenencapsulated);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSkiptokenrefresh();

	/*! \brief Set 
	 */
	void setSkiptokenrefresh(ConfigNodePropertyArray skiptokenrefresh);


    private:
    ConfigNodePropertyString path;
    ConfigNodePropertyDropDown tokenrequiredattr;
    ConfigNodePropertyString tokenalternateurl;
    ConfigNodePropertyBoolean tokenencapsulated;
    ConfigNodePropertyArray skiptokenrefresh;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_ */
