using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
    /// </summary>
    public sealed class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties:  IEquatable<ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties>
    { 
        /// <summary>
        /// RedirectEnabled
        /// </summary>
        public ConfigNodePropertyBoolean RedirectEnabled { get; private set; }

        /// <summary>
        /// RedirectStatsEnabled
        /// </summary>
        public ConfigNodePropertyBoolean RedirectStatsEnabled { get; private set; }

        /// <summary>
        /// RedirectExtensions
        /// </summary>
        public ConfigNodePropertyArray RedirectExtensions { get; private set; }

        /// <summary>
        /// RedirectPaths
        /// </summary>
        public ConfigNodePropertyArray RedirectPaths { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties()
        {
        }

        private ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(ConfigNodePropertyBoolean RedirectEnabled, ConfigNodePropertyBoolean RedirectStatsEnabled, ConfigNodePropertyArray RedirectExtensions, ConfigNodePropertyArray RedirectPaths)
        {
            
            this.RedirectEnabled = RedirectEnabled;
            
            this.RedirectStatsEnabled = RedirectStatsEnabled;
            
            this.RedirectExtensions = RedirectExtensions;
            
            this.RedirectPaths = RedirectPaths;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder</returns>
        public static ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder Builder()
        {
            return new ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder</returns>
        public ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder With()
        {
            return Builder()
                .RedirectEnabled(RedirectEnabled)
                .RedirectStatsEnabled(RedirectStatsEnabled)
                .RedirectExtensions(RedirectExtensions)
                .RedirectPaths(RedirectPaths);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties left, ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties</param>
        /// <param name="right">Compared (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties left, ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
        /// </summary>
        public sealed class ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _RedirectEnabled;
            private ConfigNodePropertyBoolean _RedirectStatsEnabled;
            private ConfigNodePropertyArray _RedirectExtensions;
            private ConfigNodePropertyArray _RedirectPaths;

            internal ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.RedirectEnabled property.
            /// </summary>
            /// <param name="value">RedirectEnabled</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder RedirectEnabled(ConfigNodePropertyBoolean value)
            {
                _RedirectEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.RedirectStatsEnabled property.
            /// </summary>
            /// <param name="value">RedirectStatsEnabled</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder RedirectStatsEnabled(ConfigNodePropertyBoolean value)
            {
                _RedirectStatsEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.RedirectExtensions property.
            /// </summary>
            /// <param name="value">RedirectExtensions</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder RedirectExtensions(ConfigNodePropertyArray value)
            {
                _RedirectExtensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.RedirectPaths property.
            /// </summary>
            /// <param name="value">RedirectPaths</param>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesBuilder RedirectPaths(ConfigNodePropertyArray value)
            {
                _RedirectPaths = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
            /// </summary>
            /// <returns>ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties</returns>
            public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties Build()
            {
                Validate();
                return new ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
                    RedirectEnabled: _RedirectEnabled,
                    RedirectStatsEnabled: _RedirectStatsEnabled,
                    RedirectExtensions: _RedirectExtensions,
                    RedirectPaths: _RedirectPaths
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}