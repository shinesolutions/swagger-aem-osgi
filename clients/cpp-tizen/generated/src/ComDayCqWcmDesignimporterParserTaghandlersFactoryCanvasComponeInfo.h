/*
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo_H_
#define _ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo_H_


#include <string>
#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties.h"
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

class ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo();
	ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getPid();

	/*! \brief Set 
	 */
	void setPid(std::string  pid);
	/*! \brief Get 
	 */
	std::string getTitle();

	/*! \brief Set 
	 */
	void setTitle(std::string  title);
	/*! \brief Get 
	 */
	std::string getDescription();

	/*! \brief Set 
	 */
	void setDescription(std::string  description);
	/*! \brief Get 
	 */
	ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo_H_ */
