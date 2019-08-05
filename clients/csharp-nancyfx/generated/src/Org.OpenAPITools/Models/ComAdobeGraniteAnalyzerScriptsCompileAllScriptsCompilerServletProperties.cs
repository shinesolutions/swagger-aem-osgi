using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties
    /// </summary>
    public sealed class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties:  IEquatable<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties>
    { 
        /// <summary>
        /// Disabled
        /// </summary>
        public ConfigNodePropertyBoolean Disabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties()
        {
        }

        private ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(ConfigNodePropertyBoolean Disabled)
        {
            
            this.Disabled = Disabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder</returns>
        public static ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder</returns>
        public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder With()
        {
            return Builder()
                .Disabled(Disabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties left, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties left, ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Disabled;

            internal ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.Disabled property.
            /// </summary>
            /// <param name="value">Disabled</param>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesBuilder Disabled(ConfigNodePropertyBoolean value)
            {
                _Disabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties</returns>
            public ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties(
                    Disabled: _Disabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}