using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties:  IEquatable<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties>
    { 
        /// <summary>
        /// Priority
        /// </summary>
        public ConfigNodePropertyInteger Priority { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties(ConfigNodePropertyInteger Priority)
        {
            
            this.Priority = Priority;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder With()
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

        public bool Equals(ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties left, ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Priority;

            internal ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.Priority property.
            /// </summary>
            /// <param name="value">Priority</param>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesBuilder Priority(ConfigNodePropertyInteger value)
            {
                _Priority = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties</returns>
            public ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties(
                    Priority: _Priority
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}