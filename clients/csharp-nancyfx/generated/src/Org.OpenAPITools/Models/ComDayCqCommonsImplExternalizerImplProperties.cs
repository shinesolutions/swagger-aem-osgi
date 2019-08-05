using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqCommonsImplExternalizerImplProperties
    /// </summary>
    public sealed class ComDayCqCommonsImplExternalizerImplProperties:  IEquatable<ComDayCqCommonsImplExternalizerImplProperties>
    { 
        /// <summary>
        /// ExternalizerDomains
        /// </summary>
        public ConfigNodePropertyArray ExternalizerDomains { get; private set; }

        /// <summary>
        /// ExternalizerHost
        /// </summary>
        public ConfigNodePropertyString ExternalizerHost { get; private set; }

        /// <summary>
        /// ExternalizerContextpath
        /// </summary>
        public ConfigNodePropertyString ExternalizerContextpath { get; private set; }

        /// <summary>
        /// ExternalizerEncodedpath
        /// </summary>
        public ConfigNodePropertyBoolean ExternalizerEncodedpath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqCommonsImplExternalizerImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqCommonsImplExternalizerImplProperties()
        {
        }

        private ComDayCqCommonsImplExternalizerImplProperties(ConfigNodePropertyArray ExternalizerDomains, ConfigNodePropertyString ExternalizerHost, ConfigNodePropertyString ExternalizerContextpath, ConfigNodePropertyBoolean ExternalizerEncodedpath)
        {
            
            this.ExternalizerDomains = ExternalizerDomains;
            
            this.ExternalizerHost = ExternalizerHost;
            
            this.ExternalizerContextpath = ExternalizerContextpath;
            
            this.ExternalizerEncodedpath = ExternalizerEncodedpath;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqCommonsImplExternalizerImplProperties.
        /// </summary>
        /// <returns>ComDayCqCommonsImplExternalizerImplPropertiesBuilder</returns>
        public static ComDayCqCommonsImplExternalizerImplPropertiesBuilder Builder()
        {
            return new ComDayCqCommonsImplExternalizerImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqCommonsImplExternalizerImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqCommonsImplExternalizerImplPropertiesBuilder</returns>
        public ComDayCqCommonsImplExternalizerImplPropertiesBuilder With()
        {
            return Builder()
                .ExternalizerDomains(ExternalizerDomains)
                .ExternalizerHost(ExternalizerHost)
                .ExternalizerContextpath(ExternalizerContextpath)
                .ExternalizerEncodedpath(ExternalizerEncodedpath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqCommonsImplExternalizerImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqCommonsImplExternalizerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsImplExternalizerImplProperties</param>
        /// <param name="right">Compared (ComDayCqCommonsImplExternalizerImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqCommonsImplExternalizerImplProperties left, ComDayCqCommonsImplExternalizerImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqCommonsImplExternalizerImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqCommonsImplExternalizerImplProperties</param>
        /// <param name="right">Compared (ComDayCqCommonsImplExternalizerImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqCommonsImplExternalizerImplProperties left, ComDayCqCommonsImplExternalizerImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqCommonsImplExternalizerImplProperties.
        /// </summary>
        public sealed class ComDayCqCommonsImplExternalizerImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExternalizerDomains;
            private ConfigNodePropertyString _ExternalizerHost;
            private ConfigNodePropertyString _ExternalizerContextpath;
            private ConfigNodePropertyBoolean _ExternalizerEncodedpath;

            internal ComDayCqCommonsImplExternalizerImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplProperties.ExternalizerDomains property.
            /// </summary>
            /// <param name="value">ExternalizerDomains</param>
            public ComDayCqCommonsImplExternalizerImplPropertiesBuilder ExternalizerDomains(ConfigNodePropertyArray value)
            {
                _ExternalizerDomains = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplProperties.ExternalizerHost property.
            /// </summary>
            /// <param name="value">ExternalizerHost</param>
            public ComDayCqCommonsImplExternalizerImplPropertiesBuilder ExternalizerHost(ConfigNodePropertyString value)
            {
                _ExternalizerHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplProperties.ExternalizerContextpath property.
            /// </summary>
            /// <param name="value">ExternalizerContextpath</param>
            public ComDayCqCommonsImplExternalizerImplPropertiesBuilder ExternalizerContextpath(ConfigNodePropertyString value)
            {
                _ExternalizerContextpath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqCommonsImplExternalizerImplProperties.ExternalizerEncodedpath property.
            /// </summary>
            /// <param name="value">ExternalizerEncodedpath</param>
            public ComDayCqCommonsImplExternalizerImplPropertiesBuilder ExternalizerEncodedpath(ConfigNodePropertyBoolean value)
            {
                _ExternalizerEncodedpath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqCommonsImplExternalizerImplProperties.
            /// </summary>
            /// <returns>ComDayCqCommonsImplExternalizerImplProperties</returns>
            public ComDayCqCommonsImplExternalizerImplProperties Build()
            {
                Validate();
                return new ComDayCqCommonsImplExternalizerImplProperties(
                    ExternalizerDomains: _ExternalizerDomains,
                    ExternalizerHost: _ExternalizerHost,
                    ExternalizerContextpath: _ExternalizerContextpath,
                    ExternalizerEncodedpath: _ExternalizerEncodedpath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}