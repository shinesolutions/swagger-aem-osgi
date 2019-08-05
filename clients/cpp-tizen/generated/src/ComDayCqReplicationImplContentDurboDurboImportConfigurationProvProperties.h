/*
 * ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.h
 *
 * 
 */

#ifndef _ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_
#define _ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties();
	ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreservehierarchynodes();

	/*! \brief Set 
	 */
	void setPreservehierarchynodes(ConfigNodePropertyBoolean  preservehierarchynodes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getIgnoreversioning();

	/*! \brief Set 
	 */
	void setIgnoreversioning(ConfigNodePropertyBoolean  ignoreversioning);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getImportacl();

	/*! \brief Set 
	 */
	void setImportacl(ConfigNodePropertyBoolean  importacl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSavethreshold();

	/*! \brief Set 
	 */
	void setSavethreshold(ConfigNodePropertyInteger  savethreshold);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreserveuserpaths();

	/*! \brief Set 
	 */
	void setPreserveuserpaths(ConfigNodePropertyBoolean  preserveuserpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPreserveuuid();

	/*! \brief Set 
	 */
	void setPreserveuuid(ConfigNodePropertyBoolean  preserveuuid);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreserveuuidnodetypes();

	/*! \brief Set 
	 */
	void setPreserveuuidnodetypes(ConfigNodePropertyArray  preserveuuidnodetypes);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPreserveuuidsubtrees();

	/*! \brief Set 
	 */
	void setPreserveuuidsubtrees(ConfigNodePropertyArray  preserveuuidsubtrees);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAutocommit();

	/*! \brief Set 
	 */
	void setAutocommit(ConfigNodePropertyBoolean  autocommit);

private:
	ConfigNodePropertyBoolean preservehierarchynodes;
	ConfigNodePropertyBoolean ignoreversioning;
	ConfigNodePropertyBoolean importacl;
	ConfigNodePropertyInteger savethreshold;
	ConfigNodePropertyBoolean preserveuserpaths;
	ConfigNodePropertyBoolean preserveuuid;
	ConfigNodePropertyArray preserveuuidnodetypes;
	ConfigNodePropertyArray preserveuuidsubtrees;
	ConfigNodePropertyBoolean autocommit;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties_H_ */
