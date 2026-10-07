/*
 * ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_
#define _ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties();
	ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTokenrequiredattr();

	/*! \brief Set 
	 */
	void setTokenrequiredattr(ConfigNodePropertyDropDown  tokenrequiredattr);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getTokenalternateurl();

	/*! \brief Set 
	 */
	void setTokenalternateurl(ConfigNodePropertyString  tokenalternateurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getTokenencapsulated();

	/*! \brief Set 
	 */
	void setTokenencapsulated(ConfigNodePropertyBoolean  tokenencapsulated);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSkiptokenrefresh();

	/*! \brief Set 
	 */
	void setSkiptokenrefresh(ConfigNodePropertyArray  skiptokenrefresh);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyDropDown tokenrequiredattr;
	ConfigNodePropertyString tokenalternateurl;
	ConfigNodePropertyBoolean tokenencapsulated;
	ConfigNodePropertyArray skiptokenrefresh;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties_H_ */
