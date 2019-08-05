using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
    /// </summary>
    public sealed class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties:  IEquatable<OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties>
    { 
        /// <summary>
        /// DatasourceName
        /// </summary>
        public ConfigNodePropertyString DatasourceName { get; private set; }

        /// <summary>
        /// DatasourceSvcPropName
        /// </summary>
        public ConfigNodePropertyString DatasourceSvcPropName { get; private set; }

        /// <summary>
        /// DatasourceJndiName
        /// </summary>
        public ConfigNodePropertyString DatasourceJndiName { get; private set; }

        /// <summary>
        /// JndiProperties
        /// </summary>
        public ConfigNodePropertyArray JndiProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties()
        {
        }

        private OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(ConfigNodePropertyString DatasourceName, ConfigNodePropertyString DatasourceSvcPropName, ConfigNodePropertyString DatasourceJndiName, ConfigNodePropertyArray JndiProperties)
        {
            
            this.DatasourceName = DatasourceName;
            
            this.DatasourceSvcPropName = DatasourceSvcPropName;
            
            this.DatasourceJndiName = DatasourceJndiName;
            
            this.JndiProperties = JndiProperties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder</returns>
        public static OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder Builder()
        {
            return new OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder</returns>
        public OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder With()
        {
            return Builder()
                .DatasourceName(DatasourceName)
                .DatasourceSvcPropName(DatasourceSvcPropName)
                .DatasourceJndiName(DatasourceJndiName)
                .JndiProperties(JndiProperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties left, OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties</param>
        /// <param name="right">Compared (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties left, OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
        /// </summary>
        public sealed class OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _DatasourceName;
            private ConfigNodePropertyString _DatasourceSvcPropName;
            private ConfigNodePropertyString _DatasourceJndiName;
            private ConfigNodePropertyArray _JndiProperties;

            internal OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.DatasourceName property.
            /// </summary>
            /// <param name="value">DatasourceName</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder DatasourceName(ConfigNodePropertyString value)
            {
                _DatasourceName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.DatasourceSvcPropName property.
            /// </summary>
            /// <param name="value">DatasourceSvcPropName</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder DatasourceSvcPropName(ConfigNodePropertyString value)
            {
                _DatasourceSvcPropName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.DatasourceJndiName property.
            /// </summary>
            /// <param name="value">DatasourceJndiName</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder DatasourceJndiName(ConfigNodePropertyString value)
            {
                _DatasourceJndiName = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.JndiProperties property.
            /// </summary>
            /// <param name="value">JndiProperties</param>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesBuilder JndiProperties(ConfigNodePropertyArray value)
            {
                _JndiProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.
            /// </summary>
            /// <returns>OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties</returns>
            public OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties Build()
            {
                Validate();
                return new OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
                    DatasourceName: _DatasourceName,
                    DatasourceSvcPropName: _DatasourceSvcPropName,
                    DatasourceJndiName: _DatasourceJndiName,
                    JndiProperties: _JndiProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}