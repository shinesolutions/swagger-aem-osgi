using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties:  IEquatable<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties>
    { 
        /// <summary>
        /// IsMemberCheck
        /// </summary>
        public ConfigNodePropertyBoolean IsMemberCheck { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties()
        {
        }

        private ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(ConfigNodePropertyBoolean IsMemberCheck)
        {
            
            this.IsMemberCheck = IsMemberCheck;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder</returns>
        public static ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder</returns>
        public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder With()
        {
            return Builder()
                .IsMemberCheck(IsMemberCheck);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties left, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties left, ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsMemberCheck;

            internal ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.IsMemberCheck property.
            /// </summary>
            /// <param name="value">IsMemberCheck</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesBuilder IsMemberCheck(ConfigNodePropertyBoolean value)
            {
                _IsMemberCheck = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties</returns>
            public ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(
                    IsMemberCheck: _IsMemberCheck
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}