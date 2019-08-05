using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
    /// </summary>
    public sealed class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties:  IEquatable<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties>
    { 
        /// <summary>
        /// Datasources
        /// </summary>
        public ConfigNodePropertyArray Datasources { get; private set; }

        /// <summary>
        /// Step
        /// </summary>
        public ConfigNodePropertyInteger Step { get; private set; }

        /// <summary>
        /// Archives
        /// </summary>
        public ConfigNodePropertyArray Archives { get; private set; }

        /// <summary>
        /// Path
        /// </summary>
        public ConfigNodePropertyString Path { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties()
        {
        }

        private OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(ConfigNodePropertyArray Datasources, ConfigNodePropertyInteger Step, ConfigNodePropertyArray Archives, ConfigNodePropertyString Path)
        {
            
            this.Datasources = Datasources;
            
            this.Step = Step;
            
            this.Archives = Archives;
            
            this.Path = Path;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder</returns>
        public static OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder Builder()
        {
            return new OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder</returns>
        public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder With()
        {
            return Builder()
                .Datasources(Datasources)
                .Step(Step)
                .Archives(Archives)
                .Path(Path);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties left, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties</param>
        /// <param name="right">Compared (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties left, OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
        /// </summary>
        public sealed class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder
        {
            private ConfigNodePropertyArray _Datasources;
            private ConfigNodePropertyInteger _Step;
            private ConfigNodePropertyArray _Archives;
            private ConfigNodePropertyString _Path;

            internal OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.Datasources property.
            /// </summary>
            /// <param name="value">Datasources</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder Datasources(ConfigNodePropertyArray value)
            {
                _Datasources = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.Step property.
            /// </summary>
            /// <param name="value">Step</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder Step(ConfigNodePropertyInteger value)
            {
                _Step = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.Archives property.
            /// </summary>
            /// <param name="value">Archives</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder Archives(ConfigNodePropertyArray value)
            {
                _Archives = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.Path property.
            /// </summary>
            /// <param name="value">Path</param>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesBuilder Path(ConfigNodePropertyString value)
            {
                _Path = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties.
            /// </summary>
            /// <returns>OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties</returns>
            public OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties Build()
            {
                Validate();
                return new OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties(
                    Datasources: _Datasources,
                    Step: _Step,
                    Archives: _Archives,
                    Path: _Path
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}