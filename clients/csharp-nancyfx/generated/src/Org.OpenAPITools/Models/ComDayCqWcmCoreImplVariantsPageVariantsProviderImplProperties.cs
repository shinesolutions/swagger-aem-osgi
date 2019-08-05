using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties:  IEquatable<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties>
    { 
        /// <summary>
        /// DefaultExternalizerDomain
        /// </summary>
        public ConfigNodePropertyString DefaultExternalizerDomain { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties()
        {
        }

        private ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(ConfigNodePropertyString DefaultExternalizerDomain)
        {
            
            this.DefaultExternalizerDomain = DefaultExternalizerDomain;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder With()
        {
            return Builder()
                .DefaultExternalizerDomain(DefaultExternalizerDomain);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties left, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties left, ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _DefaultExternalizerDomain;

            internal ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.DefaultExternalizerDomain property.
            /// </summary>
            /// <param name="value">DefaultExternalizerDomain</param>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesBuilder DefaultExternalizerDomain(ConfigNodePropertyString value)
            {
                _DefaultExternalizerDomain = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties</returns>
            public ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties(
                    DefaultExternalizerDomain: _DefaultExternalizerDomain
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}