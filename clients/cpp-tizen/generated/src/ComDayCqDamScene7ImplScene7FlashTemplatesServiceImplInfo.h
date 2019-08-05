/*
 * ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo.h
 *
 * 
 */

#ifndef _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo_H_
#define _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo_H_


#include <string>
#include "ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.h"
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

class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo();
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo();

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
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties  properties);

private:
	std::string pid;
	std::string title;
	std::string description;
	ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo_H_ */
