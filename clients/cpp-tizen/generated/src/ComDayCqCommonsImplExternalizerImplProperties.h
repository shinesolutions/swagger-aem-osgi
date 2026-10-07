/*
 * ComDayCqCommonsImplExternalizerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqCommonsImplExternalizerImplProperties_H_
#define _ComDayCqCommonsImplExternalizerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComDayCqCommonsImplExternalizerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqCommonsImplExternalizerImplProperties();
	ComDayCqCommonsImplExternalizerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqCommonsImplExternalizerImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExternalizerdomains();

	/*! \brief Set 
	 */
	void setExternalizerdomains(ConfigNodePropertyArray  externalizerdomains);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizerhost();

	/*! \brief Set 
	 */
	void setExternalizerhost(ConfigNodePropertyString  externalizerhost);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getExternalizercontextpath();

	/*! \brief Set 
	 */
	void setExternalizercontextpath(ConfigNodePropertyString  externalizercontextpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getExternalizerencodedpath();

	/*! \brief Set 
	 */
	void setExternalizerencodedpath(ConfigNodePropertyBoolean  externalizerencodedpath);

private:
	ConfigNodePropertyArray externalizerdomains;
	ConfigNodePropertyString externalizerhost;
	ConfigNodePropertyString externalizercontextpath;
	ConfigNodePropertyBoolean externalizerencodedpath;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqCommonsImplExternalizerImplProperties_H_ */
