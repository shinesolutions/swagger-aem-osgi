/*
 * ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_
#define _ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();
	ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getItemresourcetypes();

	/*! \brief Set 
	 */
	void setItemresourcetypes(ConfigNodePropertyArray  itemresourcetypes);

private:
	ConfigNodePropertyArray itemresourcetypes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties_H_ */
