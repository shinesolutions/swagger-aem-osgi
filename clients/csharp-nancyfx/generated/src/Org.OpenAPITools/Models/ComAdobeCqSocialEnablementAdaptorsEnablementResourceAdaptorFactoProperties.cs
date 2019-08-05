using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties:  IEquatable<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties>
    { 
        /// <summary>
        /// IsMemberCheck
        /// </summary>
        public ConfigNodePropertyBoolean IsMemberCheck { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties()
        {
        }

        private ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(ConfigNodePropertyBoolean IsMemberCheck)
        {
            
            this.IsMemberCheck = IsMemberCheck;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder</returns>
        public static ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder</returns>
        public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties left, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties left, ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _IsMemberCheck;

            internal ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.IsMemberCheck property.
            /// </summary>
            /// <param name="value">IsMemberCheck</param>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesBuilder IsMemberCheck(ConfigNodePropertyBoolean value)
            {
                _IsMemberCheck = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties</returns>
            public ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(
                    IsMemberCheck: _IsMemberCheck
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}