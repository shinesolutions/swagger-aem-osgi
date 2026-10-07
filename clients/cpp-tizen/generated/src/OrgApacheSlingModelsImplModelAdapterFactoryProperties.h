/*
 * OrgApacheSlingModelsImplModelAdapterFactoryProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_
#define _OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_


#include <string>
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

class OrgApacheSlingModelsImplModelAdapterFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingModelsImplModelAdapterFactoryProperties();
	OrgApacheSlingModelsImplModelAdapterFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingModelsImplModelAdapterFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardlistener();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardlistener(ConfigNodePropertyString  osgihttpwhiteboardlistener);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getOsgihttpwhiteboardcontextselect();

	/*! \brief Set 
	 */
	void setOsgihttpwhiteboardcontextselect(ConfigNodePropertyString  osgihttpwhiteboardcontextselect);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxrecursiondepth();

	/*! \brief Set 
	 */
	void setMaxrecursiondepth(ConfigNodePropertyInteger  maxrecursiondepth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCleanupjobperiod();

	/*! \brief Set 
	 */
	void setCleanupjobperiod(ConfigNodePropertyInteger  cleanupjobperiod);

private:
	ConfigNodePropertyString osgihttpwhiteboardlistener;
	ConfigNodePropertyString osgihttpwhiteboardcontextselect;
	ConfigNodePropertyInteger maxrecursiondepth;
	ConfigNodePropertyInteger cleanupjobperiod;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingModelsImplModelAdapterFactoryProperties_H_ */
