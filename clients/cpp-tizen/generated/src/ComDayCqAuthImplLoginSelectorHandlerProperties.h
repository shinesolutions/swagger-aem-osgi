/*
 * ComDayCqAuthImplLoginSelectorHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqAuthImplLoginSelectorHandlerProperties_H_
#define _ComDayCqAuthImplLoginSelectorHandlerProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqAuthImplLoginSelectorHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqAuthImplLoginSelectorHandlerProperties();
	ComDayCqAuthImplLoginSelectorHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqAuthImplLoginSelectorHandlerProperties();

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
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectormappings();

	/*! \brief Set 
	 */
	void setAuthloginselectormappings(ConfigNodePropertyArray  authloginselectormappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectorchangepwmappings();

	/*! \brief Set 
	 */
	void setAuthloginselectorchangepwmappings(ConfigNodePropertyArray  authloginselectorchangepwmappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthloginselectordefaultloginpage();

	/*! \brief Set 
	 */
	void setAuthloginselectordefaultloginpage(ConfigNodePropertyString  authloginselectordefaultloginpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAuthloginselectordefaultchangepwpage();

	/*! \brief Set 
	 */
	void setAuthloginselectordefaultchangepwpage(ConfigNodePropertyString  authloginselectordefaultchangepwpage);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAuthloginselectorhandle();

	/*! \brief Set 
	 */
	void setAuthloginselectorhandle(ConfigNodePropertyArray  authloginselectorhandle);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAuthloginselectorhandleallextensions();

	/*! \brief Set 
	 */
	void setAuthloginselectorhandleallextensions(ConfigNodePropertyBoolean  authloginselectorhandleallextensions);

private:
	ConfigNodePropertyString path;
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyArray authloginselectormappings;
	ConfigNodePropertyArray authloginselectorchangepwmappings;
	ConfigNodePropertyString authloginselectordefaultloginpage;
	ConfigNodePropertyString authloginselectordefaultchangepwpage;
	ConfigNodePropertyArray authloginselectorhandle;
	ConfigNodePropertyBoolean authloginselectorhandleallextensions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqAuthImplLoginSelectorHandlerProperties_H_ */
