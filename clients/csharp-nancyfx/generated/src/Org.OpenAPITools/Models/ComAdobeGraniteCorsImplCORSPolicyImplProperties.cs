using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteCorsImplCORSPolicyImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteCorsImplCORSPolicyImplProperties:  IEquatable<ComAdobeGraniteCorsImplCORSPolicyImplProperties>
    { 
        /// <summary>
        /// Alloworigin
        /// </summary>
        public ConfigNodePropertyArray Alloworigin { get; private set; }

        /// <summary>
        /// Alloworiginregexp
        /// </summary>
        public ConfigNodePropertyArray Alloworiginregexp { get; private set; }

        /// <summary>
        /// Allowedpaths
        /// </summary>
        public ConfigNodePropertyArray Allowedpaths { get; private set; }

        /// <summary>
        /// Exposedheaders
        /// </summary>
        public ConfigNodePropertyArray Exposedheaders { get; private set; }

        /// <summary>
        /// Maxage
        /// </summary>
        public ConfigNodePropertyInteger Maxage { get; private set; }

        /// <summary>
        /// Supportedheaders
        /// </summary>
        public ConfigNodePropertyArray Supportedheaders { get; private set; }

        /// <summary>
        /// Supportedmethods
        /// </summary>
        public ConfigNodePropertyArray Supportedmethods { get; private set; }

        /// <summary>
        /// Supportscredentials
        /// </summary>
        public ConfigNodePropertyBoolean Supportscredentials { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteCorsImplCORSPolicyImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteCorsImplCORSPolicyImplProperties()
        {
        }

        private ComAdobeGraniteCorsImplCORSPolicyImplProperties(ConfigNodePropertyArray Alloworigin, ConfigNodePropertyArray Alloworiginregexp, ConfigNodePropertyArray Allowedpaths, ConfigNodePropertyArray Exposedheaders, ConfigNodePropertyInteger Maxage, ConfigNodePropertyArray Supportedheaders, ConfigNodePropertyArray Supportedmethods, ConfigNodePropertyBoolean Supportscredentials)
        {
            
            this.Alloworigin = Alloworigin;
            
            this.Alloworiginregexp = Alloworiginregexp;
            
            this.Allowedpaths = Allowedpaths;
            
            this.Exposedheaders = Exposedheaders;
            
            this.Maxage = Maxage;
            
            this.Supportedheaders = Supportedheaders;
            
            this.Supportedmethods = Supportedmethods;
            
            this.Supportscredentials = Supportscredentials;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteCorsImplCORSPolicyImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder</returns>
        public static ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder</returns>
        public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder With()
        {
            return Builder()
                .Alloworigin(Alloworigin)
                .Alloworiginregexp(Alloworiginregexp)
                .Allowedpaths(Allowedpaths)
                .Exposedheaders(Exposedheaders)
                .Maxage(Maxage)
                .Supportedheaders(Supportedheaders)
                .Supportedmethods(Supportedmethods)
                .Supportscredentials(Supportscredentials);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteCorsImplCORSPolicyImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteCorsImplCORSPolicyImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCorsImplCORSPolicyImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCorsImplCORSPolicyImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteCorsImplCORSPolicyImplProperties left, ComAdobeGraniteCorsImplCORSPolicyImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteCorsImplCORSPolicyImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteCorsImplCORSPolicyImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteCorsImplCORSPolicyImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteCorsImplCORSPolicyImplProperties left, ComAdobeGraniteCorsImplCORSPolicyImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteCorsImplCORSPolicyImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _Alloworigin;
            private ConfigNodePropertyArray _Alloworiginregexp;
            private ConfigNodePropertyArray _Allowedpaths;
            private ConfigNodePropertyArray _Exposedheaders;
            private ConfigNodePropertyInteger _Maxage;
            private ConfigNodePropertyArray _Supportedheaders;
            private ConfigNodePropertyArray _Supportedmethods;
            private ConfigNodePropertyBoolean _Supportscredentials;

            internal ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Alloworigin property.
            /// </summary>
            /// <param name="value">Alloworigin</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Alloworigin(ConfigNodePropertyArray value)
            {
                _Alloworigin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Alloworiginregexp property.
            /// </summary>
            /// <param name="value">Alloworiginregexp</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Alloworiginregexp(ConfigNodePropertyArray value)
            {
                _Alloworiginregexp = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Allowedpaths property.
            /// </summary>
            /// <param name="value">Allowedpaths</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Allowedpaths(ConfigNodePropertyArray value)
            {
                _Allowedpaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Exposedheaders property.
            /// </summary>
            /// <param name="value">Exposedheaders</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Exposedheaders(ConfigNodePropertyArray value)
            {
                _Exposedheaders = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Maxage property.
            /// </summary>
            /// <param name="value">Maxage</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Maxage(ConfigNodePropertyInteger value)
            {
                _Maxage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Supportedheaders property.
            /// </summary>
            /// <param name="value">Supportedheaders</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Supportedheaders(ConfigNodePropertyArray value)
            {
                _Supportedheaders = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Supportedmethods property.
            /// </summary>
            /// <param name="value">Supportedmethods</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Supportedmethods(ConfigNodePropertyArray value)
            {
                _Supportedmethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteCorsImplCORSPolicyImplProperties.Supportscredentials property.
            /// </summary>
            /// <param name="value">Supportscredentials</param>
            public ComAdobeGraniteCorsImplCORSPolicyImplPropertiesBuilder Supportscredentials(ConfigNodePropertyBoolean value)
            {
                _Supportscredentials = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteCorsImplCORSPolicyImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteCorsImplCORSPolicyImplProperties</returns>
            public ComAdobeGraniteCorsImplCORSPolicyImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteCorsImplCORSPolicyImplProperties(
                    Alloworigin: _Alloworigin,
                    Alloworiginregexp: _Alloworiginregexp,
                    Allowedpaths: _Allowedpaths,
                    Exposedheaders: _Exposedheaders,
                    Maxage: _Maxage,
                    Supportedheaders: _Supportedheaders,
                    Supportedmethods: _Supportedmethods,
                    Supportscredentials: _Supportscredentials
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}