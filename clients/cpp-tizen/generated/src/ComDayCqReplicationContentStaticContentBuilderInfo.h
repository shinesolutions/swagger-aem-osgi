/*
 * ComDayCqReplicationContentStaticContentBuilderInfo.h
 *
 * 
 */

#ifndef _ComDayCqReplicationContentStaticContentBuilderInfo_H_
#define _ComDayCqReplicationContentStaticContentBuilderInfo_H_


#include <string>
#include "ComDayCqReplicationContentStaticContentBuilderProperties.h"
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

class ComDayCqReplicationContentStaticContentBuilderInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqReplicationContentStaticContentBuilderInfo();
	ComDayCqReplicationContentStaticContentBuilderInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqReplicationContentStaticContentBuilderInfo();

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
	ComDayCqReplicationContentStaticContentBuilderProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqReplicationContentStaticContentBuilderProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqReplicationContentStaticContentBuilderProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqReplicationContentStaticContentBuilderInfo_H_ */
