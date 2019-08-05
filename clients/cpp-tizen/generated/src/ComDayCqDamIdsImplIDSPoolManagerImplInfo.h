/*
 * ComDayCqDamIdsImplIDSPoolManagerImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamIdsImplIDSPoolManagerImplInfo_H_
#define _ComDayCqDamIdsImplIDSPoolManagerImplInfo_H_


#include <string>
#include "ComDayCqDamIdsImplIDSPoolManagerImplProperties.h"
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

class ComDayCqDamIdsImplIDSPoolManagerImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamIdsImplIDSPoolManagerImplInfo();
	ComDayCqDamIdsImplIDSPoolManagerImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamIdsImplIDSPoolManagerImplInfo();

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
	ComDayCqDamIdsImplIDSPoolManagerImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamIdsImplIDSPoolManagerImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamIdsImplIDSPoolManagerImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamIdsImplIDSPoolManagerImplInfo_H_ */
