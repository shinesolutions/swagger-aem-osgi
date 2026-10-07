/*
 * ComDayCqWcmDesignimporterDesignPackageImporterProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_
#define _ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_


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

class ComDayCqWcmDesignimporterDesignPackageImporterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterDesignPackageImporterProperties();
	ComDayCqWcmDesignimporterDesignPackageImporterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterDesignPackageImporterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getExtractfilter();

	/*! \brief Set 
	 */
	void setExtractfilter(ConfigNodePropertyArray  extractfilter);

private:
	ConfigNodePropertyArray extractfilter;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterDesignPackageImporterProperties_H_ */
