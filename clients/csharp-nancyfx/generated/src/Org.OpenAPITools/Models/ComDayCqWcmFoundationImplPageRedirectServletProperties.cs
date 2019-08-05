using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationImplPageRedirectServletProperties
    /// </summary>
    public sealed class ComDayCqWcmFoundationImplPageRedirectServletProperties:  IEquatable<ComDayCqWcmFoundationImplPageRedirectServletProperties>
    { 
        /// <summary>
        /// ExcludedResourceTypes
        /// </summary>
        public ConfigNodePropertyArray ExcludedResourceTypes { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationImplPageRedirectServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationImplPageRedirectServletProperties()
        {
        }

        private ComDayCqWcmFoundationImplPageRedirectServletProperties(ConfigNodePropertyArray ExcludedResourceTypes)
        {
            
            this.ExcludedResourceTypes = ExcludedResourceTypes;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationImplPageRedirectServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder</returns>
        public static ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder</returns>
        public ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder With()
        {
            return Builder()
                .ExcludedResourceTypes(ExcludedResourceTypes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmFoundationImplPageRedirectServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationImplPageRedirectServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageRedirectServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageRedirectServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationImplPageRedirectServletProperties left, ComDayCqWcmFoundationImplPageRedirectServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationImplPageRedirectServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationImplPageRedirectServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationImplPageRedirectServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationImplPageRedirectServletProperties left, ComDayCqWcmFoundationImplPageRedirectServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationImplPageRedirectServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExcludedResourceTypes;

            internal ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationImplPageRedirectServletProperties.ExcludedResourceTypes property.
            /// </summary>
            /// <param name="value">ExcludedResourceTypes</param>
            public ComDayCqWcmFoundationImplPageRedirectServletPropertiesBuilder ExcludedResourceTypes(ConfigNodePropertyArray value)
            {
                _ExcludedResourceTypes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationImplPageRedirectServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationImplPageRedirectServletProperties</returns>
            public ComDayCqWcmFoundationImplPageRedirectServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmFoundationImplPageRedirectServletProperties(
                    ExcludedResourceTypes: _ExcludedResourceTypes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}