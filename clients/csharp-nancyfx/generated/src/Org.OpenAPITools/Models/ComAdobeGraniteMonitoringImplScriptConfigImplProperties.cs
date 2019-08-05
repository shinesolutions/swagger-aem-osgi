using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteMonitoringImplScriptConfigImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteMonitoringImplScriptConfigImplProperties:  IEquatable<ComAdobeGraniteMonitoringImplScriptConfigImplProperties>
    { 
        /// <summary>
        /// ScriptFilename
        /// </summary>
        public ConfigNodePropertyString ScriptFilename { get; private set; }

        /// <summary>
        /// ScriptDisplay
        /// </summary>
        public ConfigNodePropertyString ScriptDisplay { get; private set; }

        /// <summary>
        /// ScriptPath
        /// </summary>
        public ConfigNodePropertyString ScriptPath { get; private set; }

        /// <summary>
        /// ScriptPlatform
        /// </summary>
        public ConfigNodePropertyArray ScriptPlatform { get; private set; }

        /// <summary>
        /// Interval
        /// </summary>
        public ConfigNodePropertyInteger Interval { get; private set; }

        /// <summary>
        /// Jmxdomain
        /// </summary>
        public ConfigNodePropertyString Jmxdomain { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteMonitoringImplScriptConfigImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteMonitoringImplScriptConfigImplProperties()
        {
        }

        private ComAdobeGraniteMonitoringImplScriptConfigImplProperties(ConfigNodePropertyString ScriptFilename, ConfigNodePropertyString ScriptDisplay, ConfigNodePropertyString ScriptPath, ConfigNodePropertyArray ScriptPlatform, ConfigNodePropertyInteger Interval, ConfigNodePropertyString Jmxdomain)
        {
            
            this.ScriptFilename = ScriptFilename;
            
            this.ScriptDisplay = ScriptDisplay;
            
            this.ScriptPath = ScriptPath;
            
            this.ScriptPlatform = ScriptPlatform;
            
            this.Interval = Interval;
            
            this.Jmxdomain = Jmxdomain;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder</returns>
        public static ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder</returns>
        public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder With()
        {
            return Builder()
                .ScriptFilename(ScriptFilename)
                .ScriptDisplay(ScriptDisplay)
                .ScriptPath(ScriptPath)
                .ScriptPlatform(ScriptPlatform)
                .Interval(Interval)
                .Jmxdomain(Jmxdomain);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteMonitoringImplScriptConfigImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteMonitoringImplScriptConfigImplProperties left, ComAdobeGraniteMonitoringImplScriptConfigImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteMonitoringImplScriptConfigImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteMonitoringImplScriptConfigImplProperties left, ComAdobeGraniteMonitoringImplScriptConfigImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder
        {
            private ConfigNodePropertyString _ScriptFilename;
            private ConfigNodePropertyString _ScriptDisplay;
            private ConfigNodePropertyString _ScriptPath;
            private ConfigNodePropertyArray _ScriptPlatform;
            private ConfigNodePropertyInteger _Interval;
            private ConfigNodePropertyString _Jmxdomain;

            internal ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.ScriptFilename property.
            /// </summary>
            /// <param name="value">ScriptFilename</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder ScriptFilename(ConfigNodePropertyString value)
            {
                _ScriptFilename = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.ScriptDisplay property.
            /// </summary>
            /// <param name="value">ScriptDisplay</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder ScriptDisplay(ConfigNodePropertyString value)
            {
                _ScriptDisplay = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.ScriptPath property.
            /// </summary>
            /// <param name="value">ScriptPath</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder ScriptPath(ConfigNodePropertyString value)
            {
                _ScriptPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.ScriptPlatform property.
            /// </summary>
            /// <param name="value">ScriptPlatform</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder ScriptPlatform(ConfigNodePropertyArray value)
            {
                _ScriptPlatform = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.Interval property.
            /// </summary>
            /// <param name="value">Interval</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder Interval(ConfigNodePropertyInteger value)
            {
                _Interval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteMonitoringImplScriptConfigImplProperties.Jmxdomain property.
            /// </summary>
            /// <param name="value">Jmxdomain</param>
            public ComAdobeGraniteMonitoringImplScriptConfigImplPropertiesBuilder Jmxdomain(ConfigNodePropertyString value)
            {
                _Jmxdomain = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteMonitoringImplScriptConfigImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteMonitoringImplScriptConfigImplProperties</returns>
            public ComAdobeGraniteMonitoringImplScriptConfigImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteMonitoringImplScriptConfigImplProperties(
                    ScriptFilename: _ScriptFilename,
                    ScriptDisplay: _ScriptDisplay,
                    ScriptPath: _ScriptPath,
                    ScriptPlatform: _ScriptPlatform,
                    Interval: _Interval,
                    Jmxdomain: _Jmxdomain
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}