using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties
    /// </summary>
    public sealed class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties:  IEquatable<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties>
    { 
        /// <summary>
        /// FieldWhitelist
        /// </summary>
        public ConfigNodePropertyArray FieldWhitelist { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties()
        {
        }

        private ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties(ConfigNodePropertyArray FieldWhitelist)
        {
            
            this.FieldWhitelist = FieldWhitelist;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder</returns>
        public static ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder</returns>
        public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder With()
        {
            return Builder()
                .FieldWhitelist(FieldWhitelist);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties left, ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties left, ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder
        {
            private ConfigNodePropertyArray _FieldWhitelist;

            internal ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.FieldWhitelist property.
            /// </summary>
            /// <param name="value">FieldWhitelist</param>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesBuilder FieldWhitelist(ConfigNodePropertyArray value)
            {
                _FieldWhitelist = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties</returns>
            public ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties(
                    FieldWhitelist: _FieldWhitelist
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}