/*
 * ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo_H_
#define _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo_H_


#include <string>
#include "ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.h"
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

class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo();
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo();

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
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo_H_ */
