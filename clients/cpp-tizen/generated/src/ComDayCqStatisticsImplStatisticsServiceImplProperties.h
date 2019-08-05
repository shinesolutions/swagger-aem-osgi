/*
 * ComDayCqStatisticsImplStatisticsServiceImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqStatisticsImplStatisticsServiceImplProperties_H_
#define _ComDayCqStatisticsImplStatisticsServiceImplProperties_H_


#include <string>
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

class ComDayCqStatisticsImplStatisticsServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqStatisticsImplStatisticsServiceImplProperties();
	ComDayCqStatisticsImplStatisticsServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqStatisticsImplStatisticsServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPath();

	/*! \brief Set 
	 */
	void setPath(ConfigNodePropertyString  path);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getWorkspace();

	/*! \brief Set 
	 */
	void setWorkspace(ConfigNodePropertyString  workspace);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeywordsPath();

	/*! \brief Set 
	 */
	void setKeywordsPath(ConfigNodePropertyString  keywordsPath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAsyncEntries();

	/*! \brief Set 
	 */
	void setAsyncEntries(ConfigNodePropertyBoolean  asyncEntries);

private:
	ConfigNodePropertyInteger schedulerperiod;
	ConfigNodePropertyBoolean schedulerconcurrent;
	ConfigNodePropertyString path;
	ConfigNodePropertyString workspace;
	ConfigNodePropertyString keywordsPath;
	ConfigNodePropertyBoolean asyncEntries;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqStatisticsImplStatisticsServiceImplProperties_H_ */
