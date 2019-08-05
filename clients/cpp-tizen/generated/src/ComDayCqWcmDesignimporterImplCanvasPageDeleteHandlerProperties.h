/*
 * ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_
#define _ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_


#include <string>
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

class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties();
	ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMinThreadPoolSize();

	/*! \brief Set 
	 */
	void setMinThreadPoolSize(ConfigNodePropertyInteger  minThreadPoolSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxThreadPoolSize();

	/*! \brief Set 
	 */
	void setMaxThreadPoolSize(ConfigNodePropertyInteger  maxThreadPoolSize);

private:
	ConfigNodePropertyInteger minThreadPoolSize;
	ConfigNodePropertyInteger maxThreadPoolSize;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties_H_ */
