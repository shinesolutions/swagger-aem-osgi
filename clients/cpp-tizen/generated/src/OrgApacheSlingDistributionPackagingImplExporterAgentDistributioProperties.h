/*
 * OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_
#define _OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_


#include <string>
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

class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties();
	OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getName();

	/*! \brief Set 
	 */
	void setName(ConfigNodePropertyString  name);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getQueue();

	/*! \brief Set 
	 */
	void setQueue(ConfigNodePropertyString  queue);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getDropinvaliditems();

	/*! \brief Set 
	 */
	void setDropinvaliditems(ConfigNodePropertyBoolean  dropinvaliditems);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getAgenttarget();

	/*! \brief Set 
	 */
	void setAgenttarget(ConfigNodePropertyString  agenttarget);

private:
	ConfigNodePropertyString name;
	ConfigNodePropertyString queue;
	ConfigNodePropertyBoolean dropinvaliditems;
	ConfigNodePropertyString agenttarget;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties_H_ */
