using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAuthImplCugCugSupportImplProperties
    /// </summary>
    public sealed class ComDayCqAuthImplCugCugSupportImplProperties:  IEquatable<ComDayCqAuthImplCugCugSupportImplProperties>
    { 
        /// <summary>
        /// CugExemptedPrincipals
        /// </summary>
        public ConfigNodePropertyArray CugExemptedPrincipals { get; private set; }

        /// <summary>
        /// CugEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CugEnabled { get; private set; }

        /// <summary>
        /// CugPrincipalsRegex
        /// </summary>
        public ConfigNodePropertyString CugPrincipalsRegex { get; private set; }

        /// <summary>
        /// CugPrincipalsReplacement
        /// </summary>
        public ConfigNodePropertyString CugPrincipalsReplacement { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAuthImplCugCugSupportImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAuthImplCugCugSupportImplProperties()
        {
        }

        private ComDayCqAuthImplCugCugSupportImplProperties(ConfigNodePropertyArray CugExemptedPrincipals, ConfigNodePropertyBoolean CugEnabled, ConfigNodePropertyString CugPrincipalsRegex, ConfigNodePropertyString CugPrincipalsReplacement)
        {
            
            this.CugExemptedPrincipals = CugExemptedPrincipals;
            
            this.CugEnabled = CugEnabled;
            
            this.CugPrincipalsRegex = CugPrincipalsRegex;
            
            this.CugPrincipalsReplacement = CugPrincipalsReplacement;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAuthImplCugCugSupportImplProperties.
        /// </summary>
        /// <returns>ComDayCqAuthImplCugCugSupportImplPropertiesBuilder</returns>
        public static ComDayCqAuthImplCugCugSupportImplPropertiesBuilder Builder()
        {
            return new ComDayCqAuthImplCugCugSupportImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAuthImplCugCugSupportImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAuthImplCugCugSupportImplPropertiesBuilder</returns>
        public ComDayCqAuthImplCugCugSupportImplPropertiesBuilder With()
        {
            return Builder()
                .CugExemptedPrincipals(CugExemptedPrincipals)
                .CugEnabled(CugEnabled)
                .CugPrincipalsRegex(CugPrincipalsRegex)
                .CugPrincipalsReplacement(CugPrincipalsReplacement);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAuthImplCugCugSupportImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAuthImplCugCugSupportImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplCugCugSupportImplProperties</param>
        /// <param name="right">Compared (ComDayCqAuthImplCugCugSupportImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAuthImplCugCugSupportImplProperties left, ComDayCqAuthImplCugCugSupportImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAuthImplCugCugSupportImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAuthImplCugCugSupportImplProperties</param>
        /// <param name="right">Compared (ComDayCqAuthImplCugCugSupportImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAuthImplCugCugSupportImplProperties left, ComDayCqAuthImplCugCugSupportImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAuthImplCugCugSupportImplProperties.
        /// </summary>
        public sealed class ComDayCqAuthImplCugCugSupportImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _CugExemptedPrincipals;
            private ConfigNodePropertyBoolean _CugEnabled;
            private ConfigNodePropertyString _CugPrincipalsRegex;
            private ConfigNodePropertyString _CugPrincipalsReplacement;

            internal ComDayCqAuthImplCugCugSupportImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplProperties.CugExemptedPrincipals property.
            /// </summary>
            /// <param name="value">CugExemptedPrincipals</param>
            public ComDayCqAuthImplCugCugSupportImplPropertiesBuilder CugExemptedPrincipals(ConfigNodePropertyArray value)
            {
                _CugExemptedPrincipals = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplProperties.CugEnabled property.
            /// </summary>
            /// <param name="value">CugEnabled</param>
            public ComDayCqAuthImplCugCugSupportImplPropertiesBuilder CugEnabled(ConfigNodePropertyBoolean value)
            {
                _CugEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplProperties.CugPrincipalsRegex property.
            /// </summary>
            /// <param name="value">CugPrincipalsRegex</param>
            public ComDayCqAuthImplCugCugSupportImplPropertiesBuilder CugPrincipalsRegex(ConfigNodePropertyString value)
            {
                _CugPrincipalsRegex = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAuthImplCugCugSupportImplProperties.CugPrincipalsReplacement property.
            /// </summary>
            /// <param name="value">CugPrincipalsReplacement</param>
            public ComDayCqAuthImplCugCugSupportImplPropertiesBuilder CugPrincipalsReplacement(ConfigNodePropertyString value)
            {
                _CugPrincipalsReplacement = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAuthImplCugCugSupportImplProperties.
            /// </summary>
            /// <returns>ComDayCqAuthImplCugCugSupportImplProperties</returns>
            public ComDayCqAuthImplCugCugSupportImplProperties Build()
            {
                Validate();
                return new ComDayCqAuthImplCugCugSupportImplProperties(
                    CugExemptedPrincipals: _CugExemptedPrincipals,
                    CugEnabled: _CugEnabled,
                    CugPrincipalsRegex: _CugPrincipalsRegex,
                    CugPrincipalsReplacement: _CugPrincipalsReplacement
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}