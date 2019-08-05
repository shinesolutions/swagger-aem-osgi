using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties:  IEquatable<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties>
    { 
        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(ConfigNodePropertyInteger Priority)
        {
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder With()
        {
            return Builder()
                .Priority(Priority);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties</returns>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties(
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}