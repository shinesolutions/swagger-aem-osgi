/*
 * ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.h
 *
 * 
 */

#ifndef _ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo_H_
#define _ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo_H_


#include <string>
#include "ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties.h"
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

class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo();
	ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo();

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
	ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo_H_ */
