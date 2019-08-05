using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties:  IEquatable<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties>
    { 
        /// <summary>
        /// Timeout
        /// </summary>
        public ConfigNodePropertyInteger Timeout { get; private set; }

        /// <summary>
        /// TargetStartLevel
        /// </summary>
        public ConfigNodePropertyInteger TargetStartLevel { get; private set; }

        /// <summary>
        /// TargetStartLevelPropName
        /// </summary>
        public ConfigNodePropertyString TargetStartLevelPropName { get; private set; }

        /// <summary>
        /// Type
        /// </summary>
        public ConfigNodePropertyDropDown Type { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties()
        {
        }

        private OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(ConfigNodePropertyInteger Timeout, ConfigNodePropertyInteger TargetStartLevel, ConfigNodePropertyString TargetStartLevelPropName, ConfigNodePropertyDropDown Type)
        {
            
            this.Timeout = Timeout;
            
            this.TargetStartLevel = TargetStartLevel;
            
            this.TargetStartLevelPropName = TargetStartLevelPropName;
            
            this.Type = Type;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder With()
        {
            return Builder()
                .Timeout(Timeout)
                .TargetStartLevel(TargetStartLevel)
                .TargetStartLevelPropName(TargetStartLevelPropName)
                .Type(Type);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties left, OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties left, OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Timeout;
            private ConfigNodePropertyInteger _TargetStartLevel;
            private ConfigNodePropertyString _TargetStartLevelPropName;
            private ConfigNodePropertyDropDown _Type;

            internal OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.Timeout property.
            /// </summary>
            /// <param name="value">Timeout</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder Timeout(ConfigNodePropertyInteger value)
            {
                _Timeout = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.TargetStartLevel property.
            /// </summary>
            /// <param name="value">TargetStartLevel</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder TargetStartLevel(ConfigNodePropertyInteger value)
            {
                _TargetStartLevel = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.TargetStartLevelPropName property.
            /// </summary>
            /// <param name="value">TargetStartLevelPropName</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder TargetStartLevelPropName(ConfigNodePropertyString value)
            {
                _TargetStartLevelPropName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.Type property.
            /// </summary>
            /// <param name="value">Type</param>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesBuilder Type(ConfigNodePropertyDropDown value)
            {
                _Type = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties</returns>
            public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
                    Timeout: _Timeout,
                    TargetStartLevel: _TargetStartLevel,
                    TargetStartLevelPropName: _TargetStartLevelPropName,
                    Type: _Type
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}