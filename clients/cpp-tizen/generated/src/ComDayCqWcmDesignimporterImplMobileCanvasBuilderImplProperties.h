/*
 * ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_
#define _ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_


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

class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties();
	ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getFilepattern();

	/*! \brief Set 
	 */
	void setFilepattern(ConfigNodePropertyString  filepattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getDevicegroups();

	/*! \brief Set 
	 */
	void setDevicegroups(ConfigNodePropertyArray  devicegroups);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildpagenodes();

	/*! \brief Set 
	 */
	void setBuildpagenodes(ConfigNodePropertyBoolean  buildpagenodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildclientlibs();

	/*! \brief Set 
	 */
	void setBuildclientlibs(ConfigNodePropertyBoolean  buildclientlibs);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getBuildcanvascomponent();

	/*! \brief Set 
	 */
	void setBuildcanvascomponent(ConfigNodePropertyBoolean  buildcanvascomponent);

private:
	ConfigNodePropertyString filepattern;
	ConfigNodePropertyArray devicegroups;
	ConfigNodePropertyBoolean buildpagenodes;
	ConfigNodePropertyBoolean buildclientlibs;
	ConfigNodePropertyBoolean buildcanvascomponent;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties_H_ */
