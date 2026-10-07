/*
 * ComDayCqPollingImporterImplPollingImporterImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqPollingImporterImplPollingImporterImplProperties_H_
#define _ComDayCqPollingImporterImplPollingImporterImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqPollingImporterImplPollingImporterImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqPollingImporterImplPollingImporterImplProperties();
	ComDayCqPollingImporterImplPollingImporterImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqPollingImporterImplPollingImporterImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getImportermininterval();

	/*! \brief Set 
	 */
	void setImportermininterval(ConfigNodePropertyInteger  importermininterval);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getImporteruser();

	/*! \brief Set 
	 */
	void setImporteruser(ConfigNodePropertyString  importeruser);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExcludepaths();

	/*! \brief Set 
	 */
	void setExcludepaths(ConfigNodePropertyArray  excludepaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIncludepaths();

	/*! \brief Set 
	 */
	void setIncludepaths(ConfigNodePropertyArray  includepaths);

private:
	ConfigNodePropertyInteger importermininterval;
	ConfigNodePropertyString importeruser;
	ConfigNodePropertyArray excludepaths;
	ConfigNodePropertyArray includepaths;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqPollingImporterImplPollingImporterImplProperties_H_ */
